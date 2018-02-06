package br.com.rsi.praticar.exemplosParaPraticarAutomacao.steps.business;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import io.openbdt.element.WebBrowserScreenElement;
import br.com.rsi.praticar.exemplosParaPraticarAutomacao.pages.PageObjectClassNetshoes;
import br.com.rsi.praticar.exemplosParaPraticarAutomacao.pages.PageObjectClassSouBarato;
import jxl.common.Logger;
import net.serenity_bdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;

@ContextConfiguration("/appcontext.xml")
public class StepBusinessNetShoes {

	PageObjectClassNetshoes page;
	private static Logger LOG = Logger.getLogger(StepBusinessNetShoes.class);
	
	@Autowired
	private WebBrowserScreenElement viewElement; // OBJETO QUE CONT�M M�TODOS PR�PRIOS DO FRAMEWORK

	public void openHome(String url) {
		viewElement.open(url);
		viewElement.getDriver().manage().window().maximize();
	}

	public void selecionarOpcaoMenu(String opcao) {
		viewElement.mouseOver(viewElement.findElement(By.linkText(opcao)));
	}

	public void selecionarTipoCalcado(String tipo){
		//page.waitFor(page.getGetCalcadoscategorias()).isVisible();
		viewElement.findElement(By.linkText(tipo)).click();
	}

	public void selecionarTenis(String tenis) {
		List<WebElement> elementos = page.getListaProduto();
		for(WebElement ele: elementos) {
			if(ele.getText().contains(tenis)) {
				ele.click();
				break;
			}
		}
	}

	public void selecionarTamanho(String tam) {
		page.waitFor(5).seconds();
		List<WebElement> elementos = page.getTamanhos();
		for(WebElement ele: elementos) {
			LOG.info(ele.getText());
			if(ele.getText().contains(tam)){
				ele.click();
				break;
			}
		}
	}

	public void clicarBtnComprar() {
		viewElement.click(page.getBtnComprar());
	}

	public void verificarItemNoCarrinho(String Item) {
		assertTrue(page.containsText(Item));
	}

	public void inserirCampoBusca(String busca) {
		viewElement.sendText(page.getCampoBusca(), busca);
		viewElement.submit(page.getCampoBusca());
	}

	public void selecionarCamisaSelecao(String camisa) {
		List<WebElement> elementos = page.getListaCamisaSelecao();
		for(WebElement ele:elementos) {
			//LOG.info(ele.getText());
			if(ele.getText().contains(camisa)) {
				ele.click();
				break;
			}
		}
	}

	public void selecionarOpcaoOutlet(String opcao) {
		viewElement.findElement(By.linkText(opcao)).click();
	}

	public void selecinarfaixaPreco() {
		viewElement.click(page.getRadiBtnPreco());
	}

	public void calcularFrete(String cep) {
		String[] c = cep.split("-");
		//LOG.info(c[0].toString() +" "+ c[1].toString());
		viewElement.sendText(page.getCampoCep1(), c[0].toString());
		viewElement.sendText(page.getCampoCep2(), c[1].toString());
		viewElement.click(page.getBtnCalculaCep());
	}

	public void verificarFreteCalculado() {
		assertTrue(page.element(page.getCalculoDoFrete()).containsText("FRETE NETSHOES"));
	}

	public void clicarBtnLimparCarrinho() {
		viewElement.clickAndWait(page.getBtnLimparCarrinho(), 10);
	}

	public void clicarBtnVoltarLoja() {
		viewElement.clickAndWait(page.getBtnVoltarParaLoja(), 10);
	}

	public void verificarSeEstouPaginaInicial(String url) {
		//LOG.info(viewElement.getDriver().getCurrentUrl());
		assertTrue(viewElement.getDriver().getCurrentUrl().equals(url));
	}



}
