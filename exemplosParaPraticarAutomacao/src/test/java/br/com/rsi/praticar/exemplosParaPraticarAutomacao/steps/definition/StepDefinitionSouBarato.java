package br.com.rsi.praticar.exemplosParaPraticarAutomacao.steps.definition;

import java.util.UUID;

import org.springframework.test.context.ContextConfiguration;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import br.com.rsi.praticar.exemplosParaPraticarAutomacao.steps.business.StepBusinessSouBarato;
import net.thucydides.core.annotations.Steps;

@ContextConfiguration("/appcontext.xml")
public class StepDefinitionSouBarato {

	@Steps
	StepBusinessSouBarato stepB;
	
	@Given("^estou na pagina inicial souBarato\"([^\"]*)\"$")
	public void estou_na_pagina_inicial_souBarato(String url) throws Throwable {
		stepB.openHomeSouBarato(url);
	}
	
	//----- WHEN ------
	@When("^seleciono a opcao \"([^\"]*)\"$")
	public void seleciono_a_opcao(String opcao) throws Throwable {
		stepB.selecionarOpcaoMenu(opcao);
	}

	@When("^seleciono iten \"([^\"]*)\"$")
	public void seleciono_iten(Integer item) throws Throwable {
		stepB.selecionarIten(item);
	}
	
	@When("^clico no botao 'COMPRAR'$")
	public void clico_no_botao_COMPRAR() throws Throwable {
		stepB.clicarBtnCompra();
	}

	@When("^confirmo compra$")
	public void confirmo_compra() throws Throwable {
		stepB.confirmarCompra();
	}
	
	@When("^clico no botao 'CONTINUAR'$")
	public void clico_no_botao_CONTINUAR() throws Throwable {
		stepB.clicarBtnContinuar();
	}
	
	@When("^clico em 'MENU'$")
	public void clico_em_MENU() throws Throwable {
		stepB.clicarNoMenu();
	}

	@When("^seleciono a 'categoria' \"([^\"]*)\"$")
	public void seleciono_a_categoria(String cate) throws Throwable {
		stepB.selecionarCategoria(cate);
	}

	@When("^seleciono a 'subCategoria' \"([^\"]*)\"$")
	public void seleciono_a_subCategoria(String subCate) throws Throwable {
		stepB.selecionarSubCategoria(subCate);
	}
	
	@When("^seleciono o filtro de busca \"([^\"]*)\"$")
	public void seleciono_o_filtro_de_busca(String filtro) throws Throwable {
		stepB.selecionarFiltroBusca(filtro);
	}

	@When("^clico em uma geladeira \"([^\"]*)\"$")
	public void clico_em_uma_geladeira(Integer posicao) throws Throwable {
		stepB.clicarNaGeladeira(posicao);	
	}
	
	@When("^confirmo compra geladeira$")
	public void confirmo_compra_geladeira() throws Throwable {
		stepB.confirmarCompraGeladeira();
	}
	
	//------- THEN ---------
	@Then("^verifico se o produto foi adicionado no carrinho$")
	public void verifico_se_o_produto_foi_adicionado_no_carrinho() throws Throwable {
	    stepB.verificoProdutoAdd();
	}
}
