Feature: Reservar diária hotel 5 estrelas São Paulo

@hotelUrbano
Scenario Outline: Reservar diária hotel 5 estrelas São Paulo
	Given estou na pagina inicial hotelUrbano "<url>"
	When insiro no campo de busca hotelUrbano "<busca>"
	And clico no botao 'Buscar'
	And seleciono numero de estrelas "<numEstrelas>"
	And seleciono o hotel "<hotel>"
	And verifico se abriu nova aba hotelUrbano
	And verifico se o hotel escolhido foi carregado "<hotel>"
	And seleciono data de entrada "<dia>" "<mes>" "<ano>"

Examples:
	|url							|busca			|numEstrelas|hotel				|dia|mes	|ano	|
	|https://www.hotelurbano.com/	|São Paulo		|5			|Meliá Ibirapuera	|31 |Agosto	|2018	|