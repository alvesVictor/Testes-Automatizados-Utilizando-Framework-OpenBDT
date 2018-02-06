Feature: Adicionar tênis ao carrinho (qualquer um)

@netShoes
Scenario Outline: Adicionar tênis ao carrinho
	Given estou na pagina inicial netShoes "<url>"
	When seleciono a opcao do menu "<opcao>"
	And seleciono o tipo de calcado "<tipo>"
	And seleciono o tenis "<tenis>"
	And seleciono o tamanho "<tam>"
	And clico no botao ' COMPRAR'
	Then verifico se o item foi adicionado ao carrinho netShoes "<tenis>"
	


Examples:
	|url						|opcao		|tipo	|tenis										|tam	|
	|http://www.netshoes.com.br/|CALÇADOS	|Tênis	|Tênis Couro Nike Shox Avenue LTR Masculino	|41		|