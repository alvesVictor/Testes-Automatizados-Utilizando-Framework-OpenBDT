Feature: Buscar Endereço (por CEP)


@Correios
Scenario Outline: Buscar usando CEP
	Given estou na pagina inicial "<url>"
	When preencho o campo 'Busca_CEP_ou_Endereço' "<cep/end>"
	And verifico se abriu nova aba
	Then verifico o resultado "<resul>"

	
Examples:
	|url									| cep/end	|resul							|
	|http://www.correios.com.br/para-voce	|06624350	|DADOS ENCONTRADOS COM SUCESSO.	|
	|http://www.correios.com.br/para-voce	|99999999	|DADOS NAO ENCONTRADOS			|
	