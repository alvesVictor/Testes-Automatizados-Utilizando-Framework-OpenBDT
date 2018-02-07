Feature: Selecionar hotel 5 estrelas Rio de Janeiro

@hotelUrbano
Scenario Outline: Selecionar hotel 5 estrelas Rio de Janeiro
	Given estou na pagina inicial hotelUrbano "<url>"
	When insiro no campo de busca hotelUrbano "<busca>"
	And clico no botao 'Buscar'
	And seleciono numero de estrelas "<numEstrelas>"
	And seleciono o hotel "<hotel>"
	And verifico se abriu nova aba hotelUrbano
	Then verifico se o hotel escolhido foi carregado "<hotel>"
	

Examples:
	|url							|busca			|numEstrelas|hotel						|
	|https://www.hotelurbano.com/	|Rio de Janeiro	|5			|LSH Lifestyle Barra Hotel	|