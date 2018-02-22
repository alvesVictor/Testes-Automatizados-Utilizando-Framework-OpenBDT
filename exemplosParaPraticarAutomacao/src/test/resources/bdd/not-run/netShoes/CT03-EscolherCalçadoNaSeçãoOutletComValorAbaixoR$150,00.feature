Feature:  Escolher um calçado na seção outlet com valor abaixo de R$150,00

@netShoes
Scenario Outline: Escolher um calçado na seção outlet com valor abaixo de R$150,00
	Given estou na pagina inicial netShoes "<url>"
	When insiro no campo de busca netShoes "<busca>"
	And seleciono opcao de outlet "<opcao>"
	And seleciono faixa de preco
	And seleciono o tenis "<tenis>"
	And seleciono o tamanho "<tam>"
	And clico no botao ' COMPRAR'
	Then verifico se o item foi adicionado ao carrinho netShoes "<tenis>"
	

Examples:
	|url						|busca			|opcao					|tenis								|tam|
	|http://www.netshoes.com.br/|outlet			|Calçados Masculinos	|Bota GONEW Fênix Camo				|41	|