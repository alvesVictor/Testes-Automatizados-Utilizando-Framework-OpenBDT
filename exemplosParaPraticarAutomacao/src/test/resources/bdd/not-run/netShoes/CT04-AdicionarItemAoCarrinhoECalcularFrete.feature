Feature:  Adicionar qualquer item ao carrinho e calcular frete até o CEP da RSI Matriz

@netShoes
Scenario Outline: Adicionar qualquer item ao carrinho e calcular frete até o CEP da RSI Matriz
	Given estou na pagina inicial netShoes "<url>"
	When seleciono a opcao do menu "<opcao>"
	And seleciono o tipo de calcado "<tipo>"
	And seleciono o tenis "<tenis>"
	And seleciono o tamanho "<tam>"
	And clico no botao ' COMPRAR'
	And verifico se o item foi adicionado ao carrinho netShoes "<tenis>"
	And calculo o frete "<cep>"
	Then verifico se o frete foi calculado
	


Examples:
	|url						|opcao		|tipo	|tenis												|tam	|cep		|
	|http://www.netshoes.com.br/|CALÇADOS	|Tênis	|Tênis Couro Nike Shox Avenue LTR Masculino			|41		|06020-000	|