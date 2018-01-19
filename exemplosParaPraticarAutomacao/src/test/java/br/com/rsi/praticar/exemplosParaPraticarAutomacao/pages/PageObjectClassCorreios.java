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

	
	
}
