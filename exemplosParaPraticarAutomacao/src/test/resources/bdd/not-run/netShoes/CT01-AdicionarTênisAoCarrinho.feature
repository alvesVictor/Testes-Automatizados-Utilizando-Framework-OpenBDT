Feature: Adicionar tênis ao carrinho (qualquer um)

Scenario Outline: Adicionar tênis ao carrinho
	Given estou na pagina inicial netShoes "<url>"
	When seleciono a opcao do menu "<opcao>"
	And seleciono o tipo de calcado "<tipo>"
	And seleciono o tenis "<tenis>"
	And seleciono o tamanho do tenis "<tam>"
	And clico no botao ' COMPRAR'
	Then verifico se o tenis foi adicionado ao carrinho "<tenis>"
	


Examples:
	|url						|opcao		|tipo	|tenis										|tam	|
	|http://www.netshoes.com.br/|CALÇADOS	|Tênis	|Tênis Nike Air Epic Speed TR 2 Masculino	|41		|