Feature: Buscar Agencia e exibir detalhes

@Correios
Scenario Outline: Buscar Agencia
	Given estou na pagina inicial "<url>"
	When clico na opcao de servico "<opcao>"
	And seleciono 'Busca_agencia_por' "<buscaAgencia>"
	And seleciono o 'Estado' "<estado>"
	And seleciono o 'Municipio' "<municipio>"
	And seleciono o 'Bairro' "<bairro>"
	Then seleciono a agencia "<agencia>"

	
	
Examples:
	|url									| opcao				| buscaAgencia	|estado		|municipio	|bairro	|agencia		|
	|http://www.correios.com.br/para-voce	|Rede de Atendimento|Localidade		|SÃO PAULO	|SAO PAULO	|CENTRO	|AGF BOA VISTA	|