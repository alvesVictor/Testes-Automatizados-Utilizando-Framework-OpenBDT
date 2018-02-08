Feature: Consultar se há promoção no trajeto Angra dos Reis-Rio de Janeiro

@hotelUrbano
Scenario Outline: Consultar se há promoção no trajeto Angra dos Reis-Rio de Janeiro
	Given estou na pagina inicial hotelUrbano "<url>"
	When seleciono opcao no menu superior "<opcao>"
	Then verifico se possui alguma promocao "<promo>"

Examples:
	|url						|opcao			|	promo						|
	|https://www.hotelurbano.com|PROMOÇÕES		|ANGRA DOS REIS/RIO DE JANEIRO	|