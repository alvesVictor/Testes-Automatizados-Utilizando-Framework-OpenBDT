package br.com.rsi.praticar.exemplosParaPraticarAutomacao.steps.definition;

import java.util.UUID;

import org.springframework.test.context.ContextConfiguration;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import br.com.rsi.praticar.exemplosParaPraticarAutomacao.steps.business.StepBusinessNetShoes;
import br.com.rsi.praticar.exemplosParaPraticarAutomacao.steps.business.StepBusinessSouBarato;
import net.thucydides.core.annotations.Steps;

@ContextConfiguration("/appcontext.xml")
public class StepDefinitionNetShoes {

	@Steps
	StepBusinessNetShoes stepB;
	
	@Given("^estou na pagina inicial netShoes \"([^\"]*)\"$")
	public void estou_na_pagina_inicial_netShoes(String url) throws Throwable {
		stepB.openHome(url);
	}

	@When("^seleciono a opcao do menu \"([^\"]*)\"$")
	public void seleciono_a_opcao_do_menu(String opcao) throws Throwable {
		stepB.selecionarOpcaoMenu(opcao);
	}

	@When("^seleciono o tipo de calcado \"([^\"]*)\"$")
	public void seleciono_o_tipo_de_calcado(String tipo) throws Throwable {
		stepB.selecionarTipoCalcado(tipo);
	}
	@When("^seleciono o tenis \"([^\"]*)\"$")
	public void seleciono_o_tenis(String tenis) throws Throwable {
		stepB.selecionarTenis(tenis);
	}
	
	@When("^seleciono o tamanho \"([^\"]*)\"$")
	public void seleciono_o_tamanho(String tam) throws Throwable {
		stepB.selecionarTamanho(tam);
	}

	@When("^clico no botao ' COMPRAR'$")
	public void clico_no_botao_COMPRAR() throws Throwable {
	    stepB.clicarBtnComprar();
	}
	
	@When("^insiro no campo de busca netShoes \"([^\"]*)\"$")
	public void insiro_no_campo_de_busca_netShoes(String busca) throws Throwable {
		stepB.inserirCampoBusca(busca);
	}
	
	@When("^seleciono a camisa de selecao brasileira \"([^\"]*)\"$")
	public void seleciono_a_camisa_de_selecao_brasileira(String camisa) throws Throwable {
		stepB.selecionarCamisaSelecao(camisa);
	}
	
	@When("^seleciono opcao de outlet \"([^\"]*)\"$")
	public void seleciono_opcao_de_outlet(String opcao) throws Throwable {
		stepB.selecionarOpcaoOutlet(opcao);
	}

	@When("^seleciono faixa de preco$")
	public void seleciono_faixa_de_preco() throws Throwable {
		stepB.selecinarfaixaPreco();
	}
	
	@When("^calculo o frete \"([^\"]*)\"$")
	public void calculo_o_frete(String cep) throws Throwable {
		stepB.calcularFrete(cep);
	}
	
	@When("^clico no botao 'Limpar_Carrinho'$")
	public void clico_no_botao_Limpar_Carrinho() throws Throwable {
		stepB.clicarBtnLimparCarrinho();
	}

	@When("^clico no botao 'VOLTAR_PARA_A_LOJA'$")
	public void clico_no_botao_VOLTAR_PARA_A_LOJA() throws Throwable {
		stepB.clicarBtnVoltarLoja();
	}

	@Then("^verifico se estou na pagina inicial \"([^\"]*)\"$")
	public void verifico_se_estou_na_pagina_inicial(String url) throws Throwable {
		stepB.verificarSeEstouPaginaInicial(url);
	}
	
	@Then("^verifico se o frete foi calculado$")
	public void verifico_se_o_frete_foi_calculado() throws Throwable {
		stepB.verificarFreteCalculado();
	}
	
	@Then("^verifico se o item foi adicionado ao carrinho netShoes \"([^\"]*)\"$")
	public void verifico_se_o_item_foi_adicionado_ao_carrinho_netShoes(String item) throws Throwable {
		stepB.verificarItemNoCarrinho(item);
	}

}
