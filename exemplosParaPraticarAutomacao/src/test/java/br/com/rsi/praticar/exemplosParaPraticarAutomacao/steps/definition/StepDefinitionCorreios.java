package br.com.rsi.praticar.exemplosParaPraticarAutomacao.steps.definition;

import java.util.UUID;

import org.springframework.test.context.ContextConfiguration;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.openbdt.api.ViewElement;
import br.com.rsi.praticar.exemplosParaPraticarAutomacao.steps.business.StepBusinessCorreios;
import br.com.rsi.praticar.exemplosParaPraticarAutomacao.steps.business.StepBusinessSouBarato;
import net.thucydides.core.annotations.Steps;

@ContextConfiguration("/appcontext.xml")
public class StepDefinitionCorreios {

	@Steps
	StepBusinessCorreios stepB;
	
	//----------- GIVEN ---------------------
	@Given("^estou na pagina inicial \"([^\"]*)\"$")
	public void estou_na_pagina_inicial(String url) throws Throwable {
	    stepB.openHome(url);
	}

	//--------------- WHEN ---------------------
	@When("^preencho o campo 'Busca_CEP_ou_Endereço' \"([^\"]*)\"$")
	public void preencho_o_campo_Busca_CEP_ou_Endereço(String cepEndereco) throws Throwable {
	    stepB.preencherCampoCepEndereco(cepEndereco);
	}
	
	@When("^verifico se abriu nova aba$")
	public void verifico_se_abriu_nova_aba() throws Throwable {
	    stepB.verificarNovaAba();
	}
	
	@When("^clico na opcao de servico \"([^\"]*)\"$")
	public void clico_na_opcao_de_servico(String opcao) throws Throwable {
	    stepB.clicarNaOpcaoDeServico(opcao);
	}
	
	@When("^insiro data no campo 'Data_da_postagem' \"([^\"]*)\"$")
	public void insiro_data_no_campo_Data_da_postagem(String dataPostagem) throws Throwable {
		stepB.inserirDataPostagem(dataPostagem);
	}

	@When("^insiro no campo 'CEP_de_origem' \"([^\"]*)\"$")
	public void insiro_no_campo_CEP_de_origem(String cepOrigem) throws Throwable {
		stepB.inserirCepOrigem(cepOrigem);
	}

	@When("^insiro no campo 'CEP_de_destino' \"([^\"]*)\"$")
	public void insiro_no_campo_CEP_de_destino(String cepDestino) throws Throwable {
		stepB.inserirCepDestino(cepDestino);
	}

	@When("^seleciono 'Tipo_de_serviço' \"([^\"]*)\"$")
	public void seleciono_Tipo_de_serviço(String tServico) throws Throwable {
	}
	//---------------- THEN-------------------
	@Then("^verifico o resultado \"([^\"]*)\"$")
	public void verifico_o_resultado(String resul) throws Throwable {
		stepB.verificarResultado(resul);
	}
	
	@Then("^verifico se foram encontrados os CEPs \"([^\"]*)\"$")
	public void verifico_se_foram_encontrados_os_CEPs(String resul) throws Throwable {
	    stepB.verificarCeps(resul);
	}
}
