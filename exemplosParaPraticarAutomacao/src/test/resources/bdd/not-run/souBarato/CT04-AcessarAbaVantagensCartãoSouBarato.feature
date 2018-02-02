Feature: Acessar aba das vantagens do cartão Sou Barato


@souBarato
Scenario Outline: Acessar aba das vantagens do cartão Sou Barato
	Given estou na pagina inicial souBarato"<url>"
	When seleciono a opcao "<opcao>"
	And clico no link 'VANTAGENS'
	And clico na opcao 'Conheca_as_vantagens'
	Then verifico resposta


	
Examples:
	|url							|opcao				|
	|http://www.soubarato.com.br	|Cartão Sou Barato	|