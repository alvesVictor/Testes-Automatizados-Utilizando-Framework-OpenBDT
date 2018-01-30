Feature: Buscar CEP (por endereço)

@Correios
Scenario Outline: Buscar usando Endereço
	Given estou na pagina inicial "<url>"
	When preencho o campo 'Busca_CEP_ou_Endereço' "<endereco>"
	And verifico se abriu nova aba
	Then verifico se foram encontrados os CEPs "<resul>"

	
	
	
	
Examples: 
	|url									|endereco						|resul							|
	|http://www.correios.com.br/para-voce	|Avenida ze						|DADOS ENCONTRADOS COM SUCESSO.	|
	|http://www.correios.com.br/para-voce	|Rua Victor Alves, Jandira		|DADOS NAO ENCONTRADOS			|