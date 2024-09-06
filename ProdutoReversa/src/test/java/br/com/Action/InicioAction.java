package br.com.Action;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import br.com.driver.PageBase;
import pageObjectReversa.InicioPageObject;

public class InicioAction extends PageBase  {
 private InicioPageObject inicio;
	
	
 public InicioAction() throws IOException {
	 inicio = new  InicioPageObject(driver);
	}

 public void aguarde(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (Exception e ){ 
		
		}
		
	}

public void exibeTelaInicio() {
	aguarde(2000);
	String capturartexto = inicio.getexibeTelaInicio().getText();
    String valoresperado = "Bem vindo,";
        assertEquals(capturartexto,valoresperado);
	
	
}

public void clicoNoBotaoLogoutDaTelaInicio() {
	aguarde(1000);
	inicio.getclicoNoBotaoLogoutDaTelaInicio().click();

	
}



public void clicoMenuSairDaAba() {
	aguarde(1000);
	inicio.getclicoMenuSairDaAba().click();
	
}

public void exibeTelaLogin() {
	aguarde(2000);
	String capturartexto = inicio.getexibeTelaLogin().getText();
    String valoresperado = "Entrar na sua conta";
        assertEquals(capturartexto,valoresperado);
	
}



}
