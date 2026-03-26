package com.everis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;

public class DetalheProdutoPage extends BasePage {

	@FindBy(xpath = "//*[text()='Add to cart']")
	protected WebElement botaoAdicionarAoCarrinho;

	@FindBy(css = ".value")
	protected WebElement botaoAumentarQuantidade;
	
	public DetalheProdutoPage() {
        PageFactory.initElements(Hooks.getDriver(), this);
    }

	public void aumentarQuantidadeProduto() {
		botaoAumentarQuantidade.click();
		log("Aumentou a quantidade do produto");
	}
}