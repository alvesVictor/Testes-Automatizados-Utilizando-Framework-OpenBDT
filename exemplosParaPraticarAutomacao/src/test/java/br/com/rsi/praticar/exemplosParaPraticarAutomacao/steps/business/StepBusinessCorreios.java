package br.com.rsi.praticar.exemplosParaPraticarAutomacao.steps.business;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import io.openbdt.element.WebBrowserScreenElement;
import br.com.rsi.praticar.exemplosParaPraticarAutomacao.pages.PageObjectClassCorreios;
import br.com.rsi.praticar.exemplosParaPraticarAutomacao.pages.PageObjectClassSouBarato;
import jxl.common.Logger;
import net.serenity_bdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;

@ContextConfiguration("/appcontext.xml")
public class StepBusinessCorreios {

	PageObjectClassCorreios page;
	private static Logger LOG = Logger.getLogger(StepBusinessCorreios.class);

	@Autowired
	private WebBrowserScreenElement viewElement; // OBJETO QUE CONT�M M�TODOS
													// PR�PRIOS DO FRAMEWORK

	public void openHome(String url) {
		viewElement.open(url);
		viewElement.getDriver().manage().window().maximize();
	}

	public void preencherCampoCepEndereco(String cepEndereco) {
		viewElement.sendText(page.getCampoBusca(), cepEndereco);
		viewElement.submit(page.getCampoBusca());
	}

	public void verificarResultado(String resul) {
		Assert.assertTrue(page.element(page.getResultadoBusca()).containsText(resul));
		if (page.element(page.getResultadoBusca()).containsText("DADOS ENCONTRADOS COM SUCESSO.")) {
			List<WebElement> elementos = viewElement.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/table/tbody/tr[2]/td"));
			for (WebElement end : elementos) {
				LOG.info(end.getText());
			}
		}
	}

	public void verificarNovaAba() {
		String abaAtual = viewElement.getDriver().getWindowHandle();
		// LOG.info(abaAtual);
		for (String abaNova : viewElement.getDriver().getWindowHandles()) {
			viewElement.getDriver().switchTo().window(abaNova);
			// LOG.info(abaNova);
		}
		Assert.assertFalse(abaAtual.equals(viewElement.getDriver().getWindowHandle()));
	}

	public void verificarCeps(String resul) {
		Assert.assertTrue(page.element(page.getResultadoBusca()).containsText(resul));
			if (page.element(page.getResultadoBusca()).containsText("DADOS ENCONTRADOS COM SUCESSO.")) {
				LOG.info("Entrou no if");
				boolean clicavel;
				do{
					LOG.info("Entrou no doWhile");
					List<WebElement> elementos = viewElement.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/table/tbody/tr"));
					for(int i=0; i < elementos.size();i++){
						//LOG.info(elementos.get(i).getText());
					}
					clicavel = page.element(page.getResultadoBusca()).containsElements(page.getBtnProx()) ? true:false;
					LOG.info("podeClicar? "+clicavel);
					if(clicavel){
						viewElement.findElement(page.getBtnProx()).click();
						//LOG.info("click");
					}
				}while(clicavel);
			}
	}

	public void clicarNaOpcaoDeServico(String opcao) {
		List<WebElement> elementos = page.getPrincipaisServicos();
		//LOG.info(elementos.size());
		for(WebElement servico: elementos){
			if(servico.getAttribute("title").equals(opcao)){
				viewElement.click(servico);
				break;
			}
		}
	}

	public void inserirDataPostagem(String dataPostagem) {
		viewElement.sendText(page.getCampoDataPostagem(), dataPostagem);
	}

	public void inserirCepOrigem(String cepOrigem) {
		viewElement.sendText(page.getCampoCepOrigem(), cepOrigem);
	}
	
	public void inserirCepDestino(String cepDestino) {
		viewElement.sendText(page.getCampoCepDestino(), cepDestino);
	}

	public void selecionarTipoServico(String tServico) {
		viewElement.selectByVisibleText(page.getSelectServico(), tServico);
	}

	public void selecionarEmbalagem(String embalagem) {
		viewElement.selectByVisibleText(page.getSelectEmbalagem(), embalagem);
	}

	public void selecionarFormato(String formato) {
		List<WebElement> elementos = page.getFormatoPacote();
		for(WebElement forma: elementos) {
			if(forma.getAttribute("class").equals(formato)) {
				viewElement.click(forma);
				break;
			}
		}	
	}

	public void selecionarPeso(String peso) {
		viewElement.selectByVisibleText(page.getSelectPeso(), peso);
	}

	public void selecionarTipoEmbalagem(String tipoEmbalagem) {
		//LOG.info(page.getDivTipoEmbalagem());
		while(!page.element(page.getDivTipoEmbalagem()).containsText(tipoEmbalagem)){
			viewElement.click(page.getBtnNextTipo());
			page.waitFor(3).seconds();
		}
		viewElement.click(page.getBtnSelecionarEmbalagem());
	}

	public void clicarBtnEnviar() {
		viewElement.clickAndWait(page.getBtnEnviar(), 20);
	}

	public void verificarResultadoPrecoPrazo(String resul) {
		Assert.assertTrue(page.containsAllText(resul));
	}
	

}
