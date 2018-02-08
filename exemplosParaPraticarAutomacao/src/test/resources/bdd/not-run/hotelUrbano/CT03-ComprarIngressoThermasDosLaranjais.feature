Feature: Comprar ingresso Thermas dos Laranjais

@hotelUrbano
Scenario Outline: Comprar ingresso Thermas dos Laranjais
	Given estou na pagina inicial hotelUrbano "<url>"
	When insiro no campo de busca hotelUrbano "<busca>"
	And seleciono a opcao 'Ingresso_Thermas_dos_Laranjais'
	And clico no botao 'Buscar'
	And seleciono o hotel "<busca>"
	And verifico se abriu nova aba hotelUrbano
	And insiro quantidade de pessoas "<qtdP>"
	And clico no botao 'COMPRAR' hotelBarato
	And insiro email do visitante "<email>"
	And seleciono forma de pagamento "<forma>"
	And insiro no campo 'Nome_do_sacador' "<nome>"
	And insiro no campo 'Telefone_do_sacador' "<tel>"

Examples:
	|url						|busca					|qtdP	|email				|forma				|nome					|tel		|
	|https://www.hotelurbano.com|Thermas dos Laranjais	|4		|etSilva@gmail.com	|Boleto bancário	|Etevaldo Marques Silva	|1147896321	|