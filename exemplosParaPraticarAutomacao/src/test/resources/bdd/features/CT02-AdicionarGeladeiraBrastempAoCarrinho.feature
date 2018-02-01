Feature: Adicionar geladeira Brastemp ao carrinho(obs: Navegar até a seção geladeira e freezers via menu)

@souBarato
Scenario Outline: Adicionar geladeira Brastemp ao carrinho
	Given estou na pagina inicial souBarato"<url>"



	
Examples:
	|url							|opcao					|item	|
	|http://www.soubarato.com.br	|Produtos Reembalados	|1		|
	