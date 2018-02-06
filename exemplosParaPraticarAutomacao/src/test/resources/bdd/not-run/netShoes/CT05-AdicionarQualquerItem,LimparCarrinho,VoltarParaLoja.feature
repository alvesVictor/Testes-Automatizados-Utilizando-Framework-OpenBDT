Feature:  Adicionar qualquer item no carrinho, Limpar Carrinho e voltar para loja

@netShoes
Scenario Outline: Adicionar qualquer item no carrinho, Limpar Carrinho e voltar para loja
	Given estou na pagina inicial netShoes "<url>"
	When seleciono a opcao do menu "<opcao>"
	And seleciono o tipo de calcado "<tipo>"
	And seleciono o tenis "<tenis>"
	And seleciono o tamanho "<tam>"
	And clico no botao ' COMPRAR'
	And verifico se o item foi adicionado ao carrinho netShoes "<tenis>"
	And clico no botao 'Limpar_Carrinho'
	And clico no botao 'VOLTAR_PARA_A_LOJA'
	Then verifico se estou na pagina inicial "<url>"
	


Examples:
	|url							|opcao		|tipo	|tenis												|tam	|cep		|
	|http://www.netshoes.com.br/	|CALÇADOS	|Tênis	|Tênis Couro Nike Shox Avenue LTR Masculino			|41		|06020-000	|