Feature: Preços e prazos - de CEP A a CEP B

@preçosEPrazos
Scenario Outline: carcular valor de uma entrega do CEP A até CEP B
	Given estou na pagina inicial "<url>"
	When clico na opcao de servico "<opcao>"
	And insiro data no campo 'Data_da_postagem' "<dataPostagem>"
	And insiro no campo 'CEP_de_origem' "<cepOrigem>"
	And insiro no campo 'CEP_de_destino' "<cepDestino>"
	And seleciono 'Tipo_de_serviço' "<tServico>"
	

	#id="content-principais-servicos"
Examples:
	|url									| opcao			|dataPostagem	|cepOrigem	|cepDestino	|tServico	|
	|http://www.correios.com.br/para-voce	|Preços e prazos|19/01/2018		|06624350	|06624370	|SEDEX		|	