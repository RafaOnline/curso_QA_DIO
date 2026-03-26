package com.everis.steps;

import io.cucumber.java.pt.*;

import com.everis.pages.ResultadoPesquisaPage;

public class DetalheProdutoPage {

	@E("^aumenta a quantidade produto$")
	public void aumentarQuantidadeProduto() {
		DetalheProdutoPage detalheProdutoPage = new DetalheProdutoPage();
		detalheProdutoPage.aumentarQuantidadeProduto();
	}
	
	
}