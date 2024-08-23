package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {
	
	// Elementos Login
	By btnLogin = By.xpath("//button[@class='login-button']");
    By username = By.xpath("//input[@name='username']");
    By password = By.xpath("//input[@name='password']");
    By btnContinuar = By.xpath("//button[@class='form-button']");
    By btnCancelar = By.xpath("//button[contains(text(),'Cancelar')]");

    // Elementos Abrir conta
	By btnAbrirConta = By.xpath("//button[@class='login-button']");
	By cpf = By.xpath("//input[@id='cpf-input']");

	
	
}
