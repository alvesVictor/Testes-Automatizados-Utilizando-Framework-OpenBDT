Feature: Adicionar ao carrinho camisa seleção brasileira 

@netShoes
Scenario Outline: Adicionar ao carrinho camisa seleção brasileira
	Given estou na pagina inicial netShoes "<url>"
	When insiro no campo de busca netShoes "<busca>"
	And seleciono a camisa de selecao brasileira "<camisa>"
	And seleciono o tamanho "<tam>"
	And clico no botao ' COMPRAR'
	Then verifico se o item foi adicionado ao carrinho netShoes "<camisa>"
	

Examples:
	|url						|busca						|camisa														|tam| 
	|http://www.netshoes.com.br/|camisa seleção brasileira	|Camisa Seleção Brasil II 2016 s/nº Torcedor Nike Masculina	|P	|