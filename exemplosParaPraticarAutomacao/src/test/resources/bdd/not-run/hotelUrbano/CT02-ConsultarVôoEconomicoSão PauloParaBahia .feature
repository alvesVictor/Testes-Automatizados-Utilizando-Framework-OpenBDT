Feature: Consultar vôo economico de São Paulo para Bahia 

@hotelUrbano
Scenario Outline: Consultar vôo economico de São Paulo para Bahia 
	Given estou na pagina inicial hotelUrbano "<url>"
	When insiro o local de origem "<origem>"
	And insiro o local de destino "<destino>"
	And seleciono a classe das passagens "<classe>"
	And clico no botao para buscar passagens
	Then verifico os resultados de voos
		

Examples:
	|url													|origem		|destino	|classe		|
	|http://passagensaereas.hotelurbano.com/pt-BR/flights	|São Paulo	|Bahia		|Econômica	|