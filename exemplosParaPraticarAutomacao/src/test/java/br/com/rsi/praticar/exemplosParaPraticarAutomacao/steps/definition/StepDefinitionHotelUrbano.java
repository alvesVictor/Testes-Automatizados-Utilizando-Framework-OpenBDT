package br.com.rsi.praticar.exemplosParaPraticarAutomacao.steps.definition;

import java.util.UUID;

import org.springframework.test.context.ContextConfiguration;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import br.com.rsi.praticar.exemplosParaPraticarAutomacao.steps.business.StepBusinessHotelUrbano;
import br.com.rsi.praticar.exemplosParaPraticarAutomacao.steps.business.StepBusinessSouBarato;
import net.thucydides.core.annotations.Steps;

@ContextConfiguration("/appcontext.xml")
public class StepDefinitionHotelUrbano {

	@Steps
	StepBusinessHotelUrbano stepB;
	
	@Given("^estou na pagina inicial hotelUrbano \"([^\"]*)\"$")
	public void estou_na_pagina_inicial_hotelUrbano(String url) throws Throwable {
		stepB.openHome(url);
	}

	@When("^insiro no campo de busca hotelUrbano \"([^\"]*)\"$")
	public void insiro_no_campo_de_busca_hotelUrbano(String busca) throws Throwable {
		stepB.inserirNoCampoBusca(busca);
	}

	@When("^clico no botao 'Buscar'$")
	public void clico_no_botao_Buscar() throws Throwable {
		stepB.clicarBtnBuscar();
	}
	
	@When("^seleciono numero de estrelas \"([^\"]*)\"$")
	public void seleciono_numero_de_estrelas(int num) throws Throwable {
		stepB.selecionarNumeroEstrelas(num);
	}

	@When("^seleciono o hotel \"([^\"]*)\"$")
	public void seleciono_o_hotel(String hotel) throws Throwable {
		stepB.selecionarHotel(hotel);
	}
	@When("^verifico se abriu nova aba hotelUrbano$")
	public void verifico_se_abriu_nova_aba_hotelUrbano() throws Throwable {
		stepB.verificarNovaAba();
	}
	
	@When("^insiro o local de origem \"([^\"]*)\"$")
	public void insiro_o_local_de_origem(String origem) throws Throwable {
		stepB.inserirLocalOrigem(origem);
	}

	@When("^insiro o local de destino \"([^\"]*)\"$")
	public void insiro_o_local_de_destino(String destino) throws Throwable {
		stepB.inserirLocalDestino(destino);
	}

	@When("^seleciono a classe das passagens \"([^\"]*)\"$")
	public void seleciono_a_classe_das_passagens(String classe) throws Throwable {
		stepB.selecionarClassePassagens(classe);
	}

	@When("^clico no botao para buscar passagens$")
	public void clico_no_botao_para_buscar_passagens() throws Throwable {
		stepB.clicarBtnBuscarPassagens();
	}

	
	@Then("^verifico se o hotel escolhido foi carregado \"([^\"]*)\"$")
	public void verifico_se_o_hotel_escolhido_foi_carregado(String hotel) throws Throwable {
		stepB.verificarSeCarregouHotelEscolhido(hotel);
	}
	
	@Then("^verifico os resultados de voos$")
	public void verifico_os_resultados_de_voos() throws Throwable {
		stepB.verirficarResultadosVoos();
	}

}
