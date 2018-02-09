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

	@When("^seleciono a opcao 'Ingresso_Thermas_dos_Laranjais'$")
	public void seleciono_a_opcao_Ingresso_Thermas_dos_Laranjais() throws Throwable {
		stepB.selecionarOpcaoThermasLaranjais();
	}
	
	@When("^insiro quantidade de pessoas \"([^\"]*)\"$")
	public void insiro_quantidade_de_pessoas(String qtd) throws Throwable {
		stepB.inserirQtdPessoas(qtd);
	}

	@When("^clico no botao 'COMPRAR' hotelBarato$")
	public void clico_no_botao_COMPRAR_hotelBarato() throws Throwable {
		stepB.clicarBtnComprar();
	}

	@When("^insiro email do visitante \"([^\"]*)\"$")
	public void insiro_email_do_visitante(String email) throws Throwable {
		stepB.inserirEmailVisitante(email);		
	}
	
	@When("^seleciono forma de pagamento \"([^\"]*)\"$")
	public void seleciono_forma_de_pagamento(String pagamento) throws Throwable {
		stepB.selecionarFormaPagamento(pagamento);
	}

	@When("^insiro no campo 'Nome_do_sacador' \"([^\"]*)\"$")
	public void insiro_no_campo_Nome_do_sacador(String nome) throws Throwable {
		stepB.inserirNomeSacador(nome);
	}

	@When("^insiro no campo 'Telefone_do_sacador' \"([^\"]*)\"$")
	public void insiro_no_campo_Telefone_do_sacador(String tel) throws Throwable {
		stepB.inserirTelefoneSacador(tel);
	}
	
	@When("^seleciono opcao no menu superior \"([^\"]*)\"$")
	public void seleciono_opcao_no_menu_superior(String menu) throws Throwable {
		stepB.selecionarOpcaoMenu(menu);
	}
	
	@When("^seleciono data de entrada \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void seleciono_data_de_entrada(String dia,String mes, String ano) throws Throwable {
		stepB.selecionarDataEntrada(dia, mes, ano);
	}
	
	@When("^seleciono data de saida \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void seleciono_data_de_saida(String dia,String mes, String ano) throws Throwable {
		stepB.selecionarDataSaida(dia, mes, ano);
	}
	
	@When("^seleciono quantidade de quartos \"([^\"]*)\"$")
	public void seleciono_quantidade_de_quartos(String qtdQuartos) throws Throwable {
		stepB.selecionarQtdQuartos(qtdQuartos);
	}

	@When("^seleciono numero de adultos \"([^\"]*)\"$")
	public void seleciono_numero_de_adultos(String qtdAdultos) throws Throwable {
		stepB.selecionarNumeroAdultos(qtdAdultos);
	}

	@When("^seleciono numero de criancas \"([^\"]*)\"$")
	public void seleciono_numero_de_criancas(String qtdCriancas) throws Throwable {
		stepB.selecionarNumeroCriancas(qtdCriancas);
	}
	
	@When("^clico no botao 'Verificar_Disponibilidade'$")
	public void clico_no_botao_Verificar_Disponibilidade() throws Throwable {
			//Continuar Daqui
	}
	
	@Then("^verifico se possui alguma promocao \"([^\"]*)\"$")
	public void verifico_se_possui_alguma_promocao(String promo) throws Throwable {
		stepB.verificarPromocao(promo);
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
