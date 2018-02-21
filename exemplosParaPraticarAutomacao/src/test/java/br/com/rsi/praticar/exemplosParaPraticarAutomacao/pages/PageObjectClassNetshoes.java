package br.com.rsi.praticar.exemplosParaPraticarAutomacao.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class PageObjectClassNetshoes extends PageObject{

	@FindBy(className="main-submenu with-banner calcados")
	private WebElement getCalcadoscategorias;
	
	@FindBy(xpath="//*[@id='item-list']/div[1]/div")
	private List<WebElement> listaProduto;
			
	@FindBy(id="buy-button-now")
	private WebElement btnComprar;
	
	@FindBy(xpath="//div[@class='sku-select label']/ul/li")
	private List<WebElement> tamanhos;
	
	@FindBy(className="product-line")
	private WebElement carrinho;
	
	@FindBy(id="search-input")
	private WebElement campoBusca;
	
	@FindBy(xpath="//*[@id='item-list']/div/div ")
	private List<WebElement> listaCamisaSelecao;
	
	@FindBy(xpath="//*[@id='aggregate-salePrice']/div/a[1]")
	private WebElement radiBtnPreco;
	
	@FindBy(name="shipping[zipCode]")
	private WebElement campoCep;
	
	@FindBy(xpath="//button[@class='calculate-shipping__button']")
	private WebElement btnCalculaCep;
	
	@FindBy(xpath="//td[@class='column-shipping-label cart__table__column cart__table__column--align-right']")
	private WebElement calculoDoFrete;
	
	@FindBy(xpath="//td[@class='cart__table__column']/a")
	private WebElement btnLimparCarrinho;
	
	@FindBy(xpath="//div[@class='empty-content']/a")
	private WebElement btnVoltarParaLoja;
	
	@FindBy(className="drezzup-categorias-li")
	private List<WebElement> opcoesOutlet;
	
	
	public WebElement getGetCalcadoscategorias() {
		return getCalcadoscategorias;
	}

	public List<WebElement> getListaProduto() {
		return listaProduto;
	}

	public WebElement getBtnComprar() {
		return btnComprar;
	}

	public List<WebElement> getTamanhos() {
		return tamanhos;
	}

	public WebElement getCarrinho() {
		return carrinho;
	}

	public WebElement getCampoBusca() {
		return campoBusca;
	}

	public List<WebElement> getListaCamisaSelecao() {
		return listaCamisaSelecao;
	}

	public WebElement getRadiBtnPreco() {
		return radiBtnPreco;
	}

	public WebElement getCampoCep() {
		return campoCep;
	}


	public WebElement getBtnCalculaCep() {
		return btnCalculaCep;
	}

	public WebElement getCalculoDoFrete() {
		return calculoDoFrete;
	}

	public WebElement getBtnLimparCarrinho() {
		return btnLimparCarrinho;
	}

	public WebElement getBtnVoltarParaLoja() {
		return btnVoltarParaLoja;
	}

	public List<WebElement> getOpcoesOutlet() {
		return opcoesOutlet;
	}


	
}
