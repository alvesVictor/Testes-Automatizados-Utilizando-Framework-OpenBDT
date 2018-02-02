Feature: Adicionar geladeira Brastemp ao carrinho(obs: Navegar até a seção geladeira e freezers via menu)

@souBarato
Scenario Outline: Adicionar geladeira Brastemp ao carrinho
	Given estou na pagina inicial souBarato"<url>"
	When clico em 'MENU'
	And seleciono a 'categoria' "<categ>"
	And seleciono a 'subCategoria' "<subCateg>"
	And seleciono o filtro de busca "<filtro>"
	And clico em uma geladeira "<posicao>"
	And clico no botao 'COMPRAR'
	Then verifico se o produto foi adicionado no carrinho
	
	
Examples:
	|url							|categ				|subCateg				|filtro		|posicao|
	|http://www.soubarato.com.br	|Eletrodomésticos	|Geladeiras e Freezeres	|Brastemp	|5		|