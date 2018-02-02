package br.com.rsi.praticar.exemplosParaPraticarAutomacao.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class PageObjectClassSouBarato extends PageObject{

	@FindBy(xpath="//*[@id='lightpop']/div/div[2]/a")
	private WebElement popUpInicial;

	@FindBy(xpath="//*[@id='containerpage']/div/div/div/div/section/ul/li/section/div/a/img")
	private List<WebElement> listaProdutosReembalados;
	
	@FindBy(id="product-buy-button")
	private WebElement btnComprar;
	
	@FindBy(id="product-selected-buy-continue")
	private WebElement btnConfirmarCompraReembalado;
	
	@FindBy(xpath="//*[@id='containerpage']/form/div[2]/div[2]/div/div[2]/button")
	private WebElement btnContinuar;
	
	@FindBy(xpath="//*[@id='app']/section/article/div[2]/div[2]/div/div/table/tbody/tr[1]/td[1]")
	private WebElement campoQtdProduto;
	
	@FindBy(id="main-header-menu-toggle")
	private WebElement btnMenu;
	
	@FindBy(xpath="//*[@id='containerpage']/div[5]/div/div/div[2]/section/ul/li/section")
	private List<WebElement> listaGeladeiras;
	
	@FindBy(id="product-selected-buy-continue")
	private WebElement btnConfirmarCompra;
	
	@FindBy(id="header-search-input")
	private WebElement campoBusca;
	
	@FindBy(xpath="//*[@id='containerpage']/div[1]/div/div[1]/h1")
	private WebElement divResultadoBusca;
	
	@FindBy(xpath=" //*[@id='containerpage']/div[1]/div/div[2]/section/ul/li/section")
	private List<WebElement> listaIphone;
	
	// --------- GETTERS -----------
	public WebElement getPopUpInicial() {
		return popUpInicial;
	}
	public List<WebElement> getListaProdutosReembalados() {
		return listaProdutosReembalados;
	}
	public WebElement getBtnComprar() {
		return btnComprar;
	}
	public WebElement getBtnConfirmarCompra() {
		return btnConfirmarCompra;
	}
	public WebElement getCampoQtdProduto() {
		return campoQtdProduto;
	}
	public WebElement getBtnContinuar() {
		return btnContinuar;
	}
	public WebElement getBtnMenu() {
		return btnMenu;
	}
	public List<WebElement> getListaGeladeiras() {
		return listaGeladeiras;
	}
	public WebElement getBtnConfirmarCompraReembalado() {
		return btnConfirmarCompraReembalado;
	}
	public WebElement getCampoBusca() {
		return campoBusca;
	}
	public WebElement getDivResultadoBusca() {
		return divResultadoBusca;
	}
	public List<WebElement> getListaIphone() {
		return listaIphone;
	}

	
	
	
}
