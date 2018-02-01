package br.com.rsi.praticar.exemplosParaPraticarAutomacao.steps.business;

import static org.junit.Assume.assumeTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import io.openbdt.element.WebBrowserScreenElement;
import br.com.rsi.praticar.exemplosParaPraticarAutomacao.pages.PageObjectClassSouBarato;
import jxl.common.Logger;
import net.serenity_bdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;

@ContextConfiguration("/appcontext.xml")
public class StepBusinessSouBarato {

	PageObjectClassSouBarato page;
	private static Logger LOG = Logger.getLogger(StepBusinessSouBarato.class);
	
	@Autowired
	private WebBrowserScreenElement viewElement; // OBJETO QUE CONT�M M�TODOS PR�PRIOS DO FRAMEWORK

	public void openHomeSouBarato(String url) {
		viewElement.open(url);
		viewElement.getDriver().manage().window().maximize();
		viewElement.click(page.getPopUpInicial());
	}

	public void selecionarOpcaoMenu(String opcao) {
		viewElement.findElement(By.linkText(opcao)).click();
	}

	public void selecionarIten(Integer item) {
		List<WebElement> elementos = page.getListaProdutosReembalados();
		WebElement produtoEscolhido = elementos.get(item);
		
		viewElement.mouseOver(produtoEscolhido);
		page.waitFor(5).seconds();
		viewElement.click(produtoEscolhido);
	}

	public void clicarBtnCompra() {
		viewElement.click(page.getBtnComprar());
	}

	public void confirmarCompra() {
		viewElement.click(page.getBtnConfirmarCompra());
	}
	
	public void clicarBtnContinuar() {
		viewElement.click(page.getBtnContinuar());
	}
	
	public void verificoProdutoAdd() {
		LOG.info(page.getCampoQtdProduto().getText());
		assumeTrue(page.element(page.getCampoQtdProduto()).containsText("1"));
	}




	

}
