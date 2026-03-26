#language: pt
#encoding: utf-8

@test
Funcionalidade: Realizar Compra no E-commerce

	Como um comprador
	Quero ver a lista de produtos disponiveis
	Para que eu possa escolher qual devo comprar
  		
  Cenario: Adicionar produto ao carrinho
  	Dado que um usuario acessa o site "http://automationpractice.com"
  	E pesquisa pelo produto "Blouse"
  	Quando adiciona o produto "Blouse" ao carrinho
  	Entao o produto "Blouse" deve estar presente no carrinho

  @test
  Cenario: Aumentar a quantidade de produto atraves do detalhes do produto
	Dado que um usuario acessa o site "https://automationexercise.com"
  	E pesquisa pelo produto "Men Tshirt"
	E acessa o produto "Men Tshirt"
	E aumenta a quantidade produto
	Quando adiciona o produto "Men Tshirt" ao carrinho
	Entao o produto "Men Tshirt" deve possuir a quantidade 2
