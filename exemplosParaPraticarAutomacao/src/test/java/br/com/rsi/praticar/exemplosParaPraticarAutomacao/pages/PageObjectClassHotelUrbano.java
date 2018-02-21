package br.com.rsi.praticar.exemplosParaPraticarAutomacao.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class PageObjectClassHotelUrbano extends PageObject{


	@FindBy(id="huSearchComponentAutocomplete")
	private WebElement campoBusca;
	
	@FindBy(xpath="//button[contains(text(), 'Buscar')]")
	private WebElement btnBuscar;
	
	@FindBy(xpath=" //div[@class='content-filters']/label[@data-event-action='Click_filtro_categoria']")
	private List<WebElement> estrelas;
	
	//@FindBy(xpath="//*[@id=\"result-card\"]/div/div/div[2]/div[2]")
	@FindBy(xpath="//*[@id='result-card']/div")
	private List<WebElement> listaHoteis;
	
	@FindBy(xpath="//span[@class='promotion-sku']/div[1]")
	private WebElement resultadoHotel;
	
	@FindBy(xpath="//*[@id='search']/div[1]/div[3]")
	private WebElement divCampoOrigemVoo;
	
	@FindBy(xpath="//input[@placeholder='Cidade ou aeroporto de origem']")
	private WebElement campoOrigemVoo;
	
	@FindBy(xpath="//*[@id='search']/div[1]/div[4]")
	private WebElement divCampoDestinoVoo;
	
	@FindBy(xpath="//input[@placeholder='Cidade ou aeroporto de destino']")
	private WebElement campoDestinoVoo;
	
	@FindBy(xpath="//button[@aria-label='Classe de cabine']/div")
	private WebElement tipoPassagem;
	
	@FindBy(xpath="//*[@id='search']/a")
	private WebElement btnBuscaPassagemAerea;
	
	//@FindBy(xpath="//*[@id='main-container']/div/div/div[1]/div/div[1]")
	private By barraCarregando = By.xpath("//div[@class='js-results-progress-panel container']/div/div[1]");

	@FindBy(xpath="//div[@class='js-itinerary-list-container']")
	private WebElement resultadosVoo;
	
	@FindBy(xpath="//li[@data-event-value='Ingresso Thermas dos Laranjais']/strong")
	private WebElement buscaThermas;
						
	@FindBy(xpath="//select[@class='hu-dropdown--field mapx-produto-pacotes-click-oferta_input_pessoa select2-hidden-accessible']")
	private WebElement selectQtdPessoas;
	
	@FindBy(xpath="//a[@class='button mapx-produto-pacotes-click-oferta_btn_comprar_1']")
	private WebElement btnComprarIngressoThermas;
	
	@FindBy(name="guestEmail")
	private WebElement campoEmailVisitante;
	
	@FindBy(name="billHolder")
	private WebElement campoNomeSacador;
	
	@FindBy(name="billHolderTel")
	private WebElement campoTelSacador;
	
	@FindBy(xpath="//nav[@class='src-components-header-___nav__nav']/a")
	private List<WebElement> menuOpcoes;
	
	@FindBy(xpath="//*[@id='paymentMethods']/ul/li")
	private List<WebElement> formasPagamento;
	
	@FindBy(xpath="//strong[@class='product-card__support-text' and contains(@data-reactid,'$product-card-')]")
	private List<WebElement> destinoViagem;
	
	@FindBy(xpath="//input[@class='form-control-hu calendar-checkin datepicker datepicker-from hasDatepicker']")
	private WebElement dataCheckin;
					
	@FindBy(xpath="//input[@class='form-control-hu calendar-checkout datepicker datepicker-to hasDatepicker']")
	private WebElement dataCheckout;
	
	@FindBy(xpath="//a[@class='ui-datepicker-next ui-corner-all']/span[@class='ui-icon ui-icon-circle-triangle-e']")
	private WebElement dataProx;
	
	@FindBy(xpath="//*[@id='ui-datepicker-div']//a[contains(@class, 'ui-state-default')]")
	private List<WebElement> dataDias;
	
	@FindBy(className="ui-datepicker-month")
	private WebElement dataMes;
	
	@FindBy(className="ui-datepicker-year")
	private WebElement dataAno;
	
	@FindBy(name="rooms")
	private WebElement numQuartos;
	
	@FindBy(name="adults")
	private WebElement numAdulto;
	
	@FindBy(name="children")
	private WebElement numCrianca;
	
	@FindBy(xpath="//input[contains(@value, 'Verificar disponibilidade')]")
	private WebElement btnVerificarDisponibilidade;
	
	@FindBy(id="wrap-availability")
	private WebElement quartos;
	
	@FindBy(xpath="//select[@data-room-id]")
	private WebElement qtdQuartosReservados;
	
	@FindBy(xpath="//input[@class='form-control-hu btn-large btn-book booking-btn ga-tracking-book_total_price-trg']")
	private WebElement btnReservar;
	
	@FindBy(name="extraFieldroomIdentificationName[1]")
	private WebElement campoResponsavelQuarto;
		
	@FindBy(name="cpf[]")
	private WebElement cpfTitular;
	
	@FindBy(name="date-of-birthday[]")
	private WebElement dataNascimento;
	
	@FindBy(name="phoneNumber[]")
	private WebElement telefone;
	
	@FindBy(name="cardNumber[]")
	private WebElement numeroCartao;
	
	@FindBy(name="cardHolder[]")
	private WebElement titularCartao;
	
	@FindBy(name="expiration[]")
	private WebElement validade;
	
	@FindBy(name="cvv[]")
	private WebElement codSeguranca;
	
	@FindBy(name="installments[]")
	private WebElement numeroParcelas;
	
	////*[@id="paymentMethods__cc"]/div[1]/div[3]/div/label/span/span
	////*[@id="paymentMethods__cc"]/div[1]/div[4]/div/label/span/span
	@FindBy(xpath="//span[contains(@class, 'creditcard--option')]")
	private List<WebElement> numerosCartoes;
	
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

	public List<WebElement> getMenuOpcoes() {
		return menuOpcoes;
	}

	public List<WebElement> getDestinoViagem() {
		return destinoViagem;
	}

	public WebElement getDataCheckin() {
		return dataCheckin;
	}

	public WebElement getDataProx() {
		return dataProx;
	}

	public List<WebElement> getDataDias() {
		return dataDias;
	}

	public WebElement getDataMes() {
		return dataMes;
	}

	public WebElement getDataAno() {
		return dataAno;
	}

	public WebElement getDataCheckout() {
		return dataCheckout;
	}

	public WebElement getNumQuartos() {
		return numQuartos;
	}

	public WebElement getNumAdulto() {
		return numAdulto;
	}

	public WebElement getNumCrianca() {
		return numCrianca;
	}

	public WebElement getBtnVerificarDisponibilidade() {
		return btnVerificarDisponibilidade;
	}

	public WebElement getQuartos() {
		return quartos;
	}

	public WebElement getQtdQuartosReservados() {
		return qtdQuartosReservados;
	}

	public WebElement getBtnReservar() {
		return btnReservar;
	}

	public WebElement getCampoResponsavelQuarto() {
		return campoResponsavelQuarto;
	}

	public WebElement getCpfTitular() {
		return cpfTitular;
	}

	public WebElement getDataNascimento() {
		return dataNascimento;
	}

	public WebElement getTelefone() {
		return telefone;
	}

	public WebElement getNumeroCartao() {
		return numeroCartao;
	}

	public WebElement getTitularCartao() {
		return titularCartao;
	}

	public WebElement getValidade() {
		return validade;
	}

	public WebElement getCodSeguranca() {
		return codSeguranca;
	}

	public WebElement getNumeroParcelas() {
		return numeroParcelas;
	}

	public List<WebElement> getNumerosCartoes() {
		return numerosCartoes;
	}

	public WebElement getDivCampoOrigemVoo() {
		return divCampoOrigemVoo;
	}

	public WebElement getDivCampoDestinoVoo() {
		return divCampoDestinoVoo;
	}
	
}
