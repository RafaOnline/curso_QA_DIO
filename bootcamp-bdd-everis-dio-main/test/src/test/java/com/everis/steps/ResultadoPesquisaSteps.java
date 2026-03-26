package com.everis.steps;

import com.everis.pages.ResultadoPesquisaPage;

import io.cucumber.java.pt.*;

public class ResultadoPesquisaSteps {

	@Quando("^adiciona o produto \"(.*)\" ao carrinho$")
	public void adicionarProdutoAoCarrinho(String nomeProduto) {
		ResultadoPesquisaPage resultadoPesquisaPage = new ResultadoPesquisaPage();
		resultadoPesquisaPage.adicionarProdutoAoCarrinho(nomeProduto);
	}

	@E("^acessa o produto \"(.*)\"$")
	public void acessarProduto(String nomeProduto) {
		ResultadoPesquisaPage resultadoPesquisaPage = new;
		ResultadoPesquisaPage.acessarProduto(nomeProduto);
	}
	
	
}