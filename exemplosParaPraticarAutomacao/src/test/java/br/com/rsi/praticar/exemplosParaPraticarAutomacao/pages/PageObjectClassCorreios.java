package br.com.rsi.praticar.exemplosParaPraticarAutomacao.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class PageObjectClassCorreios extends PageObject{
	
	@FindBy(id="acesso-busca")
	private WebElement campoBusca;
	
	@FindBy(xpath="/html/body/div[1]/div[3]/div[2]/div/div/div[2]/div[2]/div[2]")
	private WebElement resultadoBusca;

	//@FindBy(linkText="[ Próxima ]")
	private By btnProx = By.linkText("[ Próxima ]");
	
	@FindBy(xpath="//*[@id='content-principais-servicos']/ul/li/a")
	private List<WebElement> principaisServicos;
	
	@FindBy(id="data")
	private WebElement campoDataPostagem;
	
	@FindBy(name="cepOrigem")
	private WebElement campoCepOrigem;
	
	@FindBy(name="cepDestino")
	private WebElement campoCepDestino;
	
	@FindBy(name="servico")
	private WebElement selectServico;
	
	@FindBy(xpath="//*[@id='spanFormato']/img")
	private List<WebElement> formatoPacote;
	
	@FindBy(xpath="//*[@id=\"spanEmbalagemEnvelope\"]/label/select")
	private WebElement selectEmbalagem;
	
	@FindBy(name="peso")
	private WebElement selectPeso;
	
	@FindBy(xpath="//*[@id='spanTipoEmbalagem2']/div/div[1]/a[2]")
	private WebElement btnNextTipo;
	
	//@FindBy(xpath="//*[@id='spanTipoEmbalagem2']/div/div[2]/div/div[4]/div")
	private By divTipoEmbalagem = By.xpath("//*[@id='spanTipoEmbalagem2']/div/div[2]/div/div[4]/div");
	
	@FindBy(xpath="//*[@id='spanTipoEmbalagem2']/div/div[2]/div/div[4]/div/p/button")
	private WebElement btnSelecionarEmbalagem;
	
	@FindBy(name="Calcular")
	private WebElement btnEnviar;
	
	//@FindBy(className="f2col")
	private By radioBuscaAgencia = By.className("f2col");
	
	@FindBy(name="estadoAgencia")
	private WebElement selectEstadoAgencia;
	
	@FindBy(name="municipioAgencia")
	private WebElement selectMunicipioAgencia;
	
	@FindBy(name="bairroAgencia")
	private WebElement selectBairroAgencia;
	
	//@FindBy(xpath= "//*[@id='tableNomeAgencia']/tbody/tr/td/a")
	private By agencias = By.xpath("//*[@id='tableNomeAgencia']/tbody/tr/td/a");
	
	//-------- GETTERS ---------
	public WebElement getCampoBusca() {
		return campoBusca;
	}

	public WebElement getResultadoBusca() {
		return resultadoBusca;
	}

	public By getBtnProx() {
		return btnProx;
	}

	public List<WebElement> getPrincipaisServicos() {
		return principaisServicos;
	}

	public WebElement getCampoDataPostagem() {
		return campoDataPostagem;
	}

	public WebElement getCampoCepOrigem() {
		return campoCepOrigem;
	}

	public WebElement getCampoCepDestino() {
		return campoCepDestino;
	}

	public WebElement getSelectServico() {
		return selectServico;
	}

	public List<WebElement> getFormatoPacote() {
		return formatoPacote;
	}

	public WebElement getSelectEmbalagem() {
		return selectEmbalagem;
	}

	public WebElement getSelectPeso() {
		return selectPeso;
	}

	public WebElement getBtnNextTipo() {
		return btnNextTipo;
	}

	public By getDivTipoEmbalagem() {
		return divTipoEmbalagem;
	}

	public WebElement getBtnSelecionarEmbalagem() {
		return btnSelecionarEmbalagem;
	}

	public WebElement getBtnEnviar() {
		return btnEnviar;
	}

	public By getRadioBuscaAgencia() {
		return radioBuscaAgencia;
	}

	public WebElement getSelectEstadoAgencia() {
		return selectEstadoAgencia;
	}

	public WebElement getSelectMunicipioAgencia() {
		return selectMunicipioAgencia;
	}

	public WebElement getSelectBairroAgencia() {
		return selectBairroAgencia;
	}

	public By getAgencias() {
		return agencias;
	}

	
	
}
