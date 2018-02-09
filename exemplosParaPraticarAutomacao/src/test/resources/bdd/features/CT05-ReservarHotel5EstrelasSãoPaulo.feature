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
	And seleciono data de entrada "<diaIda>" "<mesIda>" "<anoIda>"
	And seleciono data de saida "<diaVolta>" "<mesVolta>" "<anoVolta>"
	And seleciono quantidade de quartos "<qtdQuarto>"
	And seleciono numero de adultos "<numAdulto>"
	And seleciono numero de criancas "<numCrianca>"
	And clico no botao 'Verificar_Disponibilidade'
	
	

Examples:
	|url							|busca			|numEstrelas|hotel					|diaIda	|mesIda	|anoIda	|diaVolta	|mesVolta|anoVolta	|qtdQuarto	|numAdulto	|numCrianca	|
	|https://www.hotelurbano.com/	|São Paulo		|5			|Radisson Blu São Paulo	|20 	|Agosto	|2018	|22			|Setembro|2020		|1			|2			|0			|	