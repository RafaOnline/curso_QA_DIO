package com.everis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;

public class CarrinhoPage extends BasePage {
	
	public CarrinhoPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}
	
	public boolean apresentouProdutoEsperadoNoCarrinho(String nomeProduto) {
		boolean apresentouProdutoEsperadoNoCarrinho = isElementDisplayed(By.xpath("//*[contains(@class,'cart_item')]//a[text()='" + nomeProduto + "']"));
		if (apresentouProdutoEsperadoNoCarrinho) {
			log("Apresentou o produto [" + nomeProduto + "] no carrinho conforme esperado.");
			return true;
		}
		logFail("Deveria ter apresentado o produto [" + nomeProduto + "] no carrinho.");
		return false;
	}

	public boolean oProdutoApresentouQuantidadeEsperada(String quantidadeEsperada) {
    String quantidadeAtual = driver
        .findElement(By.xpath("//button[contains(@class,'disabled')]"))
        .getText();

    if (quantidadeAtual.equals(quantidadeEsperada)) {
        log("✅ Quantidade correta: " + quantidadeAtual);
        return true;
    } else {
        log("❌ Quantidade incorreta! Esperado: " 
            + quantidadeEsperada + " | Atual: " + quantidadeAtual);
        return false;
    }
}
	

}