Feature: Adicionar ao carrinho um item da seção Produtos Reembalados


@souBarato
Scenario Outline: Adicionar ao carrinho um item da seção Produtos Reembalados
	Given estou na pagina inicial souBarato"<url>"
	When seleciono a opcao "<opcao>"
	And seleciono iten "<item>"
	And clico no botao 'COMPRAR'
	And confirmo compra reembalado
	And clico no botao 'CONTINUAR'
	Then verifico se o produto foi adicionado no carrinho


	
Examples:
	|url							|opcao					|item	|
	|http://www.soubarato.com.br	|Produtos Reembalados	|1		|
	