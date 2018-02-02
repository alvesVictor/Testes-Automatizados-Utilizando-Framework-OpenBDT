Feature: Adicionar um Iphone ao carrinho.

@souBarato
Scenario Outline: Adicionar um Iphone ao carrinho
	Given estou na pagina inicial souBarato"<url>"
	When insiro no campo de busca "<busca>"
	And seleciono o iphone desejado "<iphone>"
	And clico no botao 'COMPRAR'
	And confirmo compra reembalado
	And clico no botao 'CONTINUAR'
	Then verifico se o produto foi adicionado no carrinho
	
	



	
Examples:
	|url							|busca	|iphone					|
	|http://www.soubarato.com.br	|Iphone	|iPhone 6s 32GB Cinza	|
	