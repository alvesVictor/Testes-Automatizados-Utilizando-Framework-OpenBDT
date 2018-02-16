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
	And clico no numero de quartos "<numQuartos>"
	And clico em 'Reservar'
	And insiro email do visitante "<email>"
	And insiro nome do responsavel do quarto "<nome>"
	And seleciono numero de cartoes de credito "<numeroCartoes>"
	And insiro cpf "<cpf>"
	And insiro data nascimento "<dataNascimento>"
	And insiro telefone "<tel>"
	And insiro numero do cartao de credito "<numeroCartao>"
	And insiro titular do cartao "<nome>"
	And insiro validade do cartao "<validade>"
	And insiro codigo de seguranca do cartao "<codSeguranca>"
	And seleciono o numero de parcelas "<numParcelas>"
	 
	
	

Examples:
	|url							|busca			|numEstrelas|hotel					|diaIda	|mesIda	|anoIda	|diaVolta	|mesVolta|anoVolta	|qtdQuarto	|numAdulto	|numCrianca	|numQuartos	|email				|nome				|numeroCartoes	|cpf		|dataNascimento	|tel		|numeroCartao		|validade	|codSeguranca	|numParcelas|
	|https://www.hotelurbano.com/	|São Paulo		|5			|Radisson Blu São Paulo	|20 	|Agosto	|2018	|22			|Setembro|2018		|1			|2			|0			|1			|etSilva@gmail.com	|etevaldo pereira	|Um cartão		|50541488333|21081996		|11926523122|4485607922510605	|10/2019	|253			|3			|