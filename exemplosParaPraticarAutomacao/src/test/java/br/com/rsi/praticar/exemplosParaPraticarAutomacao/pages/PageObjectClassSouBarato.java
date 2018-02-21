package br.com.rsi.praticar.exemplosParaPraticarAutomacao.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class PageObjectClassSouBarato extends PageObject{

	@FindBy(xpath="//div[@class='lightpop-close md-btn-visible']/a")
	private WebElement popUpInicial;

	@FindBy(xpath=" //div[@class='p-image-placeholder']/a/img")
	private List<WebElement> listaProdutosReembalados;
	
	@FindBy(id="product-buy-button")
	private WebElement btnComprar;
	
	@FindBy(xpath="//button[@class='pure-button pure-button-buy button-large pure-button-wide']")
	private WebElement btnContinuar;
	
	@FindBy(xpath="//div[@class='table-summary table-summary-basket']//td[@class='text-capitalize col-xs-8' and contains(text(),'produto')]")
	private WebElement campoQtdProduto;
	
	@FindBy(id="main-header-menu-toggle")
	private WebElement btnMenu;
	
	@FindBy(xpath="//ul[@class='vitrine p-grid']/li/section")
	private List<WebElement> listaGeladeiras;
	
	@FindBy(id="product-selected-buy-continue")
	private WebElement btnConfirmarCompra;
	
	@FindBy(id="header-search-input")
	private WebElement campoBusca;
	
	@FindBy(xpath="//div[@class='panel-header']/h1")
	private WebElement divResultadoBusca;
	
	@FindBy(xpath="//ul[@class='vitrine p-grid']/li")
	private List<WebElement> listaIphone;
	
	@FindBy(xpath="//a[contains(text(), 'VANTAGENS')]")
	private WebElement linkVantagens;
	
	@FindBy(xpath="//a[contains(text(), 'Conheça vantagens')]")
	private WebElement linkConhecaVantagens;
	
	@FindBy(xpath="//*[@id='vantagens-cartoes']/h3")
	private WebElement resultadoCartao;
	
	@FindBy(id="cep")
	private WebElement campoCep;
	
	@FindBy(id="calculate-freight-button")
	private WebElement btnCep;
	
	
	
	
	
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

	public WebElement getCampoBusca() {
		return campoBusca;
	}
	public WebElement getDivResultadoBusca() {
		return divResultadoBusca;
	}
	public List<WebElement> getListaIphone() {
		return listaIphone;
	}
	public WebElement getLinkVantagens() {
		return linkVantagens;
	}
	public WebElement getLinkConhecaVantagens() {
		return linkConhecaVantagens;
	}
	public WebElement getResultadoCartao() {
		return resultadoCartao;
	}
	public WebElement getCampoCep() {
		return campoCep;
	}
	public WebElement getBtnCep() {
		return btnCep;
	}

	
	
	
}
