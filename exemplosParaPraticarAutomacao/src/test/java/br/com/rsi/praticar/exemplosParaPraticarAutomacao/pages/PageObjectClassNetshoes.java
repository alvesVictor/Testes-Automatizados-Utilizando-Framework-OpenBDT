package br.com.rsi.praticar.exemplosParaPraticarAutomacao.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class PageObjectClassNetshoes extends PageObject{

	@FindBy(className="main-submenu with-banner calcados")
	private WebElement getCalcadoscategorias;
	
	@FindBy(className="product-list-item")
	private List<WebElement> listaProduto;

	@FindBy(id="buy-now-button")
	private WebElement btnComprar;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div[1]/div[3]/div/form/div[4]/ul/li")
	private List<WebElement> tamanhosTenis;
	
	@FindBy(className="product-line")
	private WebElement carrinho;
	
	public WebElement getGetCalcadoscategorias() {
		return getCalcadoscategorias;
	}

	public List<WebElement> getListaProduto() {
		return listaProduto;
	}

	public WebElement getBtnComprar() {
		return btnComprar;
	}

	public List<WebElement> getTamanhosTenis() {
		return tamanhosTenis;
	}

	public WebElement getCarrinho() {
		return carrinho;
	}


	
}
