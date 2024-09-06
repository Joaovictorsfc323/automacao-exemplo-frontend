package br.com.Action;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import br.com.driver.PageBase;
import pageObjectReversa.LoginPageObject;

public class LoginAction extends PageBase {
	private LoginPageObject login;

	public LoginAction() throws IOException {
		login = new LoginPageObject(driver);
	}

	public void aguarde(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (Exception e ){ 
		
		}
		
	}

	public void digitoNoCampoEnderecoDeEMailTelaLogin(String enderecodeemail) {
		aguarde(1000);
		login.getDigitoNoCampoEndereçoDeEMailTelaLogin().sendKeys(enderecodeemail);

		
	}

	public void digitoNoCampoSenhaTelaLogin(String senha) {
		aguarde(1000);
		login.getDigitoNoCampoSenhaTelaLogin().sendKeys(senha);
		
	}

	public void clicoNoBotaoEntrarTelaLogin() {
		aguarde(2000);
		login.getclicoNoBotaoEntrarTelaLogin().click();
		
	}

	public void eFeitoLoginComSucesso() {
		aguarde(3000);
		String capturartexto = login.geteFeitoLoginComSucesso().getText();
	    String valoresperado = "Bem vindo,";
	 assertEquals(capturartexto,valoresperado);
		
		
	}

	public void naoDigitoNoCampoEnderecoDeEMailTelaLogin(String enderecodeemail) {
		aguarde(1000);
		login.getNaoDigitoNoCampoEnderecoDeEMailTelaLogin().sendKeys(enderecodeemail);
		
	}

	public void oSistemaRetornaNomeDeUsuarioOuSenhaInvalida() {
		aguarde(2000);
		String capturartexto = login.getOSistemaRetornaNomeDeUsuarioOuSenhaInvalida().getText();
	    String valoresperado = "Nome de usuário ou senha inválida.";
	 assertEquals(capturartexto,valoresperado);
		
		
	}

	public void digitoNoCampoEnderecoDeEMailIncorretoTelaLogin(String enderecodeemail) {
		aguarde(1000);
		login.getdigitoNoCampoEnderecoDeEMailIncorretoTelaLogin().sendKeys(enderecodeemail);
		
	}

	public void naoDigitoNoCampoSenhaTelaLogin(String senha) {
		aguarde(2000);
		login.getnaoDigitoNoCampoSenhaTelaLogin().sendKeys(senha);
		
	}

	public void digitoNoCampoSenhaIncorretoTelaLogin(String senha) {
		aguarde(2000);
		login.getdigitoNoCampoSenhaIncorretoTelaLogin().sendKeys(senha);
		
	}
        
	////////////Esqueceu sua Senha //////////////////////////////////////
	
	public void clicoNoLinkEsqueceuSuaSenhaDaTelaLogin() {
		aguarde(2000);
		login.getclicoNoLinkEsqueceuSuaSenhaDaTelaLogin().click();
		
	}

	public void exibeTelaEsqueceuSuaSenha() {
		aguarde(2000);
		String capturartexto = login.getexibeTelaEsqueceuSuaSenha().getText();
	    String valoresperado = "Esqueceu sua senha?";
	 assertEquals(capturartexto,valoresperado);
		
	}

	public void digitoNoCampoEnderecoDeEMailTelaEsqueceuSuaSenha(String enderecodeemail) {
		aguarde(2000);
		login.getdigitoNoCampoEnderecoDeEMailTelaEsqueceuSuaSenha().sendKeys(enderecodeemail);
		
	}

	public void clicoNoBotaoOKTelaEsqueceuSuaSenha() {
		aguarde(2000);
		login.getclicoNoBotaoOKTelaEsqueceuSuaSenha().click();
		
	}

	public void sistemaEnviaNotificacaoPorEmailParaFazerResetDeSenha() {
		aguarde(2000);
		String capturartexto = login.getNotificacaoPorEmailParaFazerResetDeSenha().getText();
	    String valoresperado = "Você deverá receber um e-mail em breve com mais instruções.";
	 assertEquals(capturartexto,valoresperado);
		
	}

	public void naoDigitoNoCampoEnderecoDeEMailTelaEsqueceuSuaSenha(String enderecodeemail) {
		aguarde(2000);
		login.getNaoDigitoNoCampoEnderecoDeEMail().sendKeys(enderecodeemail);
		
	}

	public void sistemaRetornaMensagemPorFavorInformeONomeDeUsuario() {
		aguarde(2000);
		String capturartexto = login.getsistemaRetornaMensagemPorFavorInformeONomeDeUsuario().getText();
	    String valoresperado = "Por favor, informe o nome de usuário.";
	 assertEquals(capturartexto,valoresperado);
		
	}

	
	
	
	
	
	
	
	

}
