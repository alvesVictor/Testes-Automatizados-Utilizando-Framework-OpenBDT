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

	public void selecionarTamanhoTenis(String tam) {
		List<WebElement> elementos = page.getTamanhosTenis();
		for(WebElement ele: elementos) {
			//LOG.info(ele.getText());
			if(ele.getText().contains(tam)){
				ele.click();
				break;
			}
		}
	}

	public void clicarBtnComprar() {
		viewElement.click(page.getBtnComprar());
	}

	public void verificarTenisNoCarrinho(String tenis) {
		assertTrue(page.element(page.getCarrinho()).containsText(tenis));
	}



}
