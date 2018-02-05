Feature: Calcular frete de qualquer item até o CEP da RSI Matriz

@souBarato
Scenario Outline: Calcular frete de qualquer item até o CEP da RSI Matriz
	Given estou na pagina inicial souBarato"<url>"
	When insiro no campo de busca "<busca>"
	And seleciono o iphone desejado "<iphone>"
	And clico no botao 'COMPRAR'
	And confirmo compra reembalado
	And clico no botao 'CONTINUAR'
	And insiro bo campo 'CEP' "<cep>"
	Then verifico se foi calculado o frete
	
		
Examples:
	|url							|busca	|iphone					|cep		|
	|http://www.soubarato.com.br	|Iphone	|iPhone 6s 32GB Cinza	|06020-000	|