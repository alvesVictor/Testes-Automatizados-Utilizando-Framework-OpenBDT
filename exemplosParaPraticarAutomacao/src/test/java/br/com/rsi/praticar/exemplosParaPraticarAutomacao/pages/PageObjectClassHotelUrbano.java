package br.com.rsi.praticar.exemplosParaPraticarAutomacao.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class PageObjectClassHotelUrbano extends PageObject{


	@FindBy(id="huSearchComponentAutocomplete")
	private WebElement campoBusca;
	
	@FindBy(xpath="//*[@id='get-intent-midia']/div/form/div[2]/div[2]/button")
	private WebElement btnBuscar;
	
	@FindBy(xpath="//*[@id='filters']/aside/div[2]/div[2]/div[2]/label")
	private List<WebElement> estrelas;
	
	//@FindBy(xpath="//*[@id=\"result-card\"]/div/div/div[2]/div[2]")
	@FindBy(xpath="//*[@id=\"result-card\"]/div")
	private List<WebElement> listaHoteis;
	
	@FindBy(xpath="//*[@id='wrap-content']/span/div[1]")
	private WebElement resultadoHotel;
	
	@FindBy(xpath="//*[@id='search']/div[1]/div[3]/div/div/div/input")
	private WebElement campoOrigemVoo;
	
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[4]/div/div/div/input")
	private WebElement campoDestinoVoo;
	
	@FindBy(xpath="//*[@id='service-class']/div/button/div")
	private WebElement tipoPassagem;
	
	@FindBy(xpath="//*[@id='search']/a")
	private WebElement btnBuscaPassagemAerea;
	
	//@FindBy(xpath="//*[@id='main-container']/div/div/div[1]/div/div[1]")
	private By barraCarregando = By.xpath("//*[@id='main-container']/div/div/div[1]/div/div[1]");

	@FindBy(xpath="//*[@id=\"main-container\"]/div/div/div[3]/div/div[2]/section[2]/div[3]/div/div[2]")
	private WebElement resultadosVoo;
	
	@FindBy(xpath="//*[@id='hu-hotels-autocomplete-field']/div/ul/li[4]/strong")
	private WebElement buscaThermas;
	
	@FindBy(xpath="//*[@id='offer-options']/div[1]/div/div/select")
	private WebElement selectQtdPessoas;
	
	@FindBy(xpath="//*[@id='offer-options']/div[2]/div[2]/div[2]/div/div[4]/div[2]/div[4]/a")
	private WebElement btnComprarIngressoThermas;
	
	@FindBy(name="guestEmail")
	private WebElement campoEmailVisitante;
	
	@FindBy(name="billHolder")
	private WebElement campoNomeSacador;
	
	@FindBy(name="billHolderTel")
	private WebElement campoTelSacador;
	
	@FindBy(xpath="//*[@id='paymentMethods']/ul/li")
	private List<WebElement> formasPagamento;
	

	public WebElement getCampoBusca() {
		return campoBusca;
	}

	public WebElement getBtnBuscar() {
		return btnBuscar;
	}

	public List<WebElement> getEstrelas() {
		return estrelas;
	}

	public List<WebElement> getListaHoteis() {
		return listaHoteis;
	}

	public WebElement getResultadoHotel() {
		return resultadoHotel;
	}

	public WebElement getCampoOrigemVoo() {
		return campoOrigemVoo;
	}

	public WebElement getCampoDestinoVoo() {
		return campoDestinoVoo;
	}

	public WebElement getTipoPassagem() {
		return tipoPassagem;
	}

	public WebElement getBtnBuscaPassagemAerea() {
		return btnBuscaPassagemAerea;
	}

	public By getBarraCarregando() {
		return barraCarregando;
	}

	public WebElement getResultadosVoo() {
		return resultadosVoo;
	}

	public WebElement getBuscaThermas() {
		return buscaThermas;
	}

	public WebElement getSelectQtdPessoas() {
		return selectQtdPessoas;
	}

	public WebElement getBtnComprarIngressoThermas() {
		return btnComprarIngressoThermas;
	}

	public WebElement getCampoEmailVisitante() {
		return campoEmailVisitante;
	}

	public WebElement getCampoNomeSacador() {
		return campoNomeSacador;
	}

	public WebElement getCampoTelSacador() {
		return campoTelSacador;
	}

	public List<WebElement> getFormasPagamento() {
		return formasPagamento;
	}
	
}
