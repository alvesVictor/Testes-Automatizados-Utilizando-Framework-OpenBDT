package br.com.rsi.praticar.exemplosParaPraticarAutomacao.steps.business;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.fasterxml.classmate.util.ResolvedTypeCache.Key;

import io.openbdt.element.WebBrowserScreenElement;
import br.com.rsi.praticar.exemplosParaPraticarAutomacao.pages.PageObjectClassHotelUrbano;
import br.com.rsi.praticar.exemplosParaPraticarAutomacao.pages.PageObjectClassSouBarato;
import jxl.common.Logger;
import net.serenity_bdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;

@ContextConfiguration("/appcontext.xml")
public class StepBusinessHotelUrbano {

	PageObjectClassHotelUrbano page;
	private static Logger LOG = Logger.getLogger(StepBusinessHotelUrbano.class);
	
	@Autowired
	private WebBrowserScreenElement viewElement; // OBJETO QUE CONT�M M�TODOS PR�PRIOS DO FRAMEWORK

	public void verificarNovaAba() {
		String abaAtual = viewElement.getDriver().getWindowHandle();
		for (String abaNova : viewElement.getDriver().getWindowHandles()) {
			viewElement.getDriver().switchTo().window(abaNova);
		}
		Assert.assertFalse(abaAtual.equals(viewElement.getDriver().getWindowHandle()));
	}

	public void openHome(String url) {
		viewElement.open(url);
		viewElement.getDriver().manage().window().maximize();
	}

	public void inserirNoCampoBusca(String busca) {
		viewElement.sendText(page.getCampoBusca(), busca);
	}

	public void clicarBtnBuscar() {
		viewElement.clickAndWait(page.getBtnBuscar(), 10);
	}

	public void selecionarNumeroEstrelas(int num) {
		List<WebElement> elementos = page.getEstrelas();
		num = Math.abs(num - elementos.size());
		elementos.get(num).click();
	}

	public void selecionarHotel(String hotel) {
		page.waitFor(5).seconds();
		List<WebElement> hoteis = page.getListaHoteis();
		for(WebElement ho: hoteis) {
			//LOG.info(ho.getText());
			if(ho.getText().contains(hotel)) {
				ho.findElement(By.cssSelector("div")).findElement(By.cssSelector("a")).click();
				break;
			}
		}
	}

	public void verificarSeCarregouHotelEscolhido(String hotel) {
		assertTrue(page.element(page.getResultadoHotel()).containsText(hotel));
	}

	public void inserirLocalOrigem(String origem) {
		viewElement.findElement(By.xpath("//*[@id='search']/div[1]/div[3]")).click();
		viewElement.sendText(page.getCampoOrigemVoo(), origem);
		page.waitFor(3).seconds();
		viewElement.sendText(page.getCampoOrigemVoo(), ""+Keys.ENTER);
	}
 
	public void inserirLocalDestino(String destino) {
		viewElement.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[4]")).click();
		viewElement.sendText(page.getCampoDestinoVoo(), destino);
		page.waitFor(3).seconds();
		viewElement.sendText(page.getCampoDestinoVoo(), ""+Keys.ENTER);
	}

	public void selecionarClassePassagens(String classe) {
		viewElement.click(page.getTipoPassagem());
		viewElement.findElement(By.linkText(classe)).click();
	}

	public void clicarBtnBuscarPassagens() {
		viewElement.clickAndWait(page.getBtnBuscaPassagemAerea(), 10);
		page.waitFor(page.getBtnBuscaPassagemAerea()).isPresent();
	}

	public void verirficarResultadosVoos() {
		viewElement.waitForElementIsPresent(40, page.getResultadosVoo());
		assertTrue(page.waitFor(page.getResultadosVoo()).isVisible());
	}

	public void selecionarOpcaoThermasLaranjais() {
		page.waitFor(page.getBuscaThermas()).isVisible();
		viewElement.click(page.getBuscaThermas());
	}

	public void inserirQtdPessoas(String qtd) {
		viewElement.selectByVisibleText(page.getSelectQtdPessoas(), qtd);
	}

	public void clicarBtnComprar() {
		viewElement.click(page.getBtnComprarIngressoThermas());
	}

	public void inserirEmailVisitante(String email) {
		page.waitFor(4).seconds();
		viewElement.sendText(page.getCampoEmailVisitante(), email);
	}

	public void selecionarFormaPagamento(String pagamento) {
		List<WebElement> elementos = page.getFormasPagamento();
		for(WebElement ele : elementos) {
			if(ele.getText().contains(pagamento)){
				ele.click();
				break;
			}
		}
	}

	public void inserirNomeSacador(String nome) {
		viewElement.sendText(page.getCampoNomeSacador(), nome);
	}

	public void inserirTelefoneSacador(String tel) {
		viewElement.sendText(page.getCampoTelSacador(), tel);
	}

	public void selecionarOpcaoMenu(String menu) {
		List<WebElement> elementos = page.getMenuOpcoes();
		for(WebElement ele : elementos) {
			LOG.info(ele.getText());
			if(ele.getText().contains(menu)) {
				ele.click();
				break;
			}
		}
	}

	public void verificarPromocao(String promo) {
		page.waitFor(3).seconds();
		List<WebElement> elementos = page.getDestinoViagem();
		boolean achou = false;
		for(WebElement ele : elementos) {
			LOG.info(ele.getText());
			if(ele.getText().contains(promo)) {
				achou = true;
				break;
			}
		}
		
		assertTrue(achou);
	}

	public void selecionarDataEntrada(String dia, String mes, String ano) {
		viewElement.click(page.getDataCheckin());
		selecionaDiaMesAno(dia, mes, ano);
	}

	public void selecionarDataSaida(String dia, String mes, String ano) {
		viewElement.click(page.getDataCheckout());
		selecionaDiaMesAno(dia, mes, ano);
	}
	
	private void selecionaDiaMesAno(String dia, String mes, String ano) {
		//seleciona mes e ano
		while(!page.element(page.getDataMes()).containsText(mes) || !page.element(page.getDataAno()).containsText(ano)) {
			viewElement.click(page.getDataProx());
		}
		//seleciona o dia
		List<WebElement> dias = page.getDataDias();
		boolean mesCorrente = false;
		for(WebElement d: dias) {
			//viewElement.mouseOver(d);
			if(d.getText().equals("1")) {
				mesCorrente = true;
			}
			if(d.getText().equals(dia) && mesCorrente){
				page.waitFor(3).seconds();
				d.click();
				break;
			}
		}
	}

	public void selecionarQtdQuartos(String qtdQuartos) {
		viewElement.selectByVisibleText(page.getNumQuartos(), qtdQuartos);
	}

	public void selecionarNumeroAdultos(String qtdAdultos) {
		viewElement.selectByVisibleText(page.getNumAdulto(), qtdAdultos);
	}

	public void selecionarNumeroCriancas(String qtdCriancas) {
		viewElement.selectByVisibleText(page.getNumCrianca(), qtdCriancas);
	}
	

}
