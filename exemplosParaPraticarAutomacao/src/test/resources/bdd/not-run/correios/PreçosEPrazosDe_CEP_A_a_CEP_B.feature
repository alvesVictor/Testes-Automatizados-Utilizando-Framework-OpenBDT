Feature: Preços e prazos - de CEP A a CEP B

@Correios
Scenario Outline: carcular valor de uma entrega do CEP A até CEP B
	Given estou na pagina inicial "<url>"
	When clico na opcao de servico "<opcao>"
	And insiro data no campo 'Data_da_postagem' "<dataPostagem>"
	And insiro no campo 'CEP_de_origem' "<cepOrigem>"
	And insiro no campo 'CEP_de_destino' "<cepDestino>"
	And seleciono 'Tipo_de_serviço' "<tServico>"
	And seleciono o 'Formato' "<formato>"
	And seleciono 'Embalagem' "<embalagem>"
	And seleciono 'Peso_estimado' "<peso>"
	And seleciono 'Tipo_de_embalagem' "<tipoEmbalagem>"
	And clico no botao 'Enviar'
	And verifico se abriu nova aba
	Then verifico resultado do preco e prazo "<resul>"
			
Examples:
	|url									| opcao			|dataPostagem	|cepOrigem	|cepDestino	|tServico	|formato	|embalagem				|peso	|tipoEmbalagem							|resul			|
	|http://www.correios.com.br/para-voce	|Preços e prazos|19/01/2018		|06624350	|06624370	|SEDEX		|envelope	|Embalagem dos Correios	|1		|Envelope Convencional Médio (plástico)	|Valor total	|