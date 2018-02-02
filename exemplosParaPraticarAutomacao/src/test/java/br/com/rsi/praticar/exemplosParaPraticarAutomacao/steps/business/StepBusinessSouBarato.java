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

	public void confirmarCompraReembalado() {
		viewElement.click(page.getBtnConfirmarCompraReembalado());
	}
	
	public void clicarBtnContinuar() {
		viewElement.click(page.getBtnContinuar());
	}
	
	public void verificoProdutoAdd() {
		LOG.info(page.getCampoQtdProduto().getText());
		assumeTrue(page.element(page.getCampoQtdProduto()).containsText("1"));
	}

	public void clicarNoMenu() {
		viewElement.mouseOver(page.getBtnMenu());
	}

	public void selecionarCategoria(String cate) {
		viewElement.mouseOver(viewElement.findElement(By.linkText(cate)));
	}

	public void selecionarSubCategoria(String subCate) {
		viewElement.findElement(By.linkText(subCate)).click();
	}

	public void selecionarFiltroBusca(String filtro) {
		viewElement.findElement(By.linkText(filtro)).click();
	}

	public void clicarNaGeladeira(Integer posicao) {
		List<WebElement> elementos = page.getListaGeladeiras();
		WebElement geladeira = elementos.get(posicao-1);
		viewElement.click(geladeira);
	}

	public void confirmarCompraGeladeira() {
		viewElement.click(page.getBtnConfirmarCompra());
	}

	public void inserirNoCampoBusca(String busca) {
		viewElement.sendText(page.getCampoBusca(), busca);
		viewElement.submit(page.getCampoBusca());
	}

	public void selecionarIphoneDesejado(String item) {
		page.waitFor(page.getDivResultadoBusca()).isPresent();
		List<WebElement> elementos = page.getListaIphone();
		for(WebElement ele: elementos) {
			LOG.info(ele.getText());
			if(ele.getText().contains(item)){
				viewElement.click(ele);
				break;
			}
		}
	}




	

}
