package br.com.Action;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import br.com.driver.PageBase;
import pageObjectReversa.CriarUsuarioPageObject;

public class CriarUsarioAction extends PageBase {

	private CriarUsuarioPageObject criarUsario;
	public Object o_sistema_retorna_informando_para_inserir_email;

	public CriarUsarioAction() throws IOException {
		criarUsario = new CriarUsuarioPageObject(driver);
	}

	public void aguarde(int tempo) {
		try {
			Thread.sleep(tempo);
	} catch (Exception e ){ 
		
		}
		
	}

	public void queExibeTelaDeLogin() {
		aguarde(3000);
		String capturartexto = criarUsario.getExibeTelaLogin().getText();
		String valoresperado = "Entrar na sua conta";
		assertEquals(capturartexto,valoresperado);
			
		
		
	}

	public void clicoNoLinkCadastreSeDaTelaDeLogin() {
		 aguarde(1000);
       criarUsario.getCadastreSe().click();
				

		
	}

	public void exibeTelaDeRegistreSe() {
		aguarde(1000);
	String capturartexto = criarUsario.getexibeTelaDeRegistreSe().getText();
	 String valoresperado = "Registre-se";
	assertEquals(capturartexto,valoresperado);
			
		
		
	}

	public void digitoNoCampoPrimeiroNomeTelaDeRegistreSe(String primeironome) {
          aguarde(1000);
			criarUsario.getDigitoNoCampoPrimeiroNome().sendKeys(primeironome);
			

		
	}

	public void digitoNoCampoSobrenomeTelaDeRegistreSe(String sobrenome) {
		aguarde(1000);
		criarUsario.getdigitoNoCampoSobrenome().sendKeys(sobrenome);
			
		
		
	}

	public void digitoNoCampoEnderecoDeEMailTelaDeRegistreSe(String enderecodeemail) {
			aguarde(1000);
			criarUsario.getdigitoNoCampoEnderecoDeEMail().sendKeys(enderecodeemail);
			
		
		
	}

	public void digitoNoCampoSenhaTelaDeRegistreSe(String senha) {
		aguarde(1000);
		criarUsario.getdigitoNoCampoSenha().sendKeys(senha);
		
	}

	public void digitoNoCampoConfirmeASenhaTelaDeRegistreSe(String confirmesenha) {
			aguarde(1000);
			criarUsario.getdigitoNoCampoConfirmeASenha().sendKeys(confirmesenha);
			
		
		
	}

	public void clicoNoBotaoCadastreSe() {
			aguarde(2000);
			criarUsario.getclicoNoBotaoCadastreSe().click();
			

		
	}

	public void exibeTelaVerificacaoDeEnderecoDeEmail() {
			aguarde(3000);
			String capturartexto = criarUsario.getExibeTelaVerificacaoEmail().getText();
		    String valoresperado = "Verificação de endereço de e-mail";
		 assertEquals(capturartexto,valoresperado);
			
		
		
	}

	public void naoDigitoNoCampoPrimeiroNomeTelaDeRegistreSe(String primeironome) {
		aguarde(1000);
		criarUsario.getNaoDigitoNoCampoPrimeiroNome().sendKeys(primeironome);
		
	}

	public void sistemaRetornaMensagemPorFavorInformeOPrimeiroNome() {
			aguarde(2000);
			String capturartexto = criarUsario.getInformePrimeiroNome().getText();
		    String valoresperado = "Por favor, informe o primeiro nome.";
		 assertEquals(capturartexto,valoresperado);
			
		

		
	}

	public void naoDigitoNoCampoSobrenomeTelaDeRegistreSe(String sobrenome) {
		aguarde(1000);
		criarUsario.getNaoDigitoNoCampoSobrenome().sendKeys(sobrenome);
		
	}

	public void sistemaRetornaMensagemPorFavorInformeOSobrenome() {
		aguarde(2000);
		String capturartexto = criarUsario.getInformeSobrenome().getText();
	    String valoresperado = "Por favor, informe o sobrenome.";
	 assertEquals(capturartexto,valoresperado);
		
	}

	public void naoDigitoNoCampoEnderecoDeEMailTelaDeRegistreSe(String enderecodeemail) {
		aguarde(1000);
		criarUsario.getNaoDigitoNoCampoEnderecoDeEMail().sendKeys(enderecodeemail);
		
	}

	public void sistemaRetornaMensagemPorFavorInformeOEnderecoDeEMail() {
		aguarde(2000);
		String capturartexto = criarUsario.getInformeEnderecoDeEMail().getText();
	    String valoresperado = "Por favor, informe o endereço de e-mail.";
	 assertEquals(capturartexto,valoresperado);
		
	}

	public void naoDigitoNoCampoSenhaTelaDeRegistreSe(String senha) {
		aguarde(1000);
		criarUsario.getNaoDigitoNoCampoSenha().sendKeys(senha);
		
	}

	public void sistemaRetornaMensagemPorFavorInformeASenha() {
		aguarde(2000);
		String capturartexto = criarUsario.getInformeSenha().getText();
	    String valoresperado = "Por favor, informe a senha.";
	 assertEquals(capturartexto,valoresperado);
		
	}

	public void naoDigitoNoCampoConfirmeASenhaTelaDeRegistreSe(String confirmesenha) {
		aguarde(1000);
		criarUsario.getNaoDigitoNoCampoConfirmeASenha().sendKeys(confirmesenha);
		
	}

	public void sistemaRetornaMensagemSenhaDeConfirmacaoNaoCoincide() {
		aguarde(2000);
		String capturartexto = criarUsario.getInformeConfirmeSenha().getText();
	    String valoresperado = "Senha de confirmação não coincide.";
	 assertEquals(capturartexto,valoresperado);
		
	}

	public void sistemaRetornaInformandoEnderecoDeEMailJaExiste() {
		aguarde(2000);
		String capturartexto = criarUsario.getInformeEMailJaExiste().getText();
	    String valoresperado = "Endereço de e-mail já existe.";
	 assertEquals(capturartexto,valoresperado);
		
	}

	











	






	

	//public void naoDigitoNoCampoSobrenome(String sobrenome) {
	//	aguarde(1000);
		//criarUsario.getNaoDigitoNoCampoSobrenome().sendKeys(sobrenome);
		
//	}

	//public void sistemaRetornaMensagemPorFavorInformeOSobrenome() {
	//	aguarde(2000);
	//	String capturartexto = criarUsario.getInformeSobrenome().getText();
	 //   String valoresperado = "Por favor, informe o sobrenome.";
	// assertEquals(capturartexto,valoresperado);
		
	//}

	//public void naoDigitoNoCampoEndereçoDeEMail(String enderecodeemail) {
	//	aguarde(1000);
	//getnaoDigitoNoCampoEndereçoDeEMail().sendKeys(enderecodeemail);
		
	//}

//	public void sistemaRetornaMensagemPorFavorInformeOEnderecoDeEMail() {
	//	aguarde(2000);
	//	String capturartexto = criarUsario.getInformeEnderecoDeEMail().getText();
	//    String valoresperado = "Por favor, informe o endereço de e-mail.";
	 //assertEquals(capturartexto,valoresperado);
		
	//}

	//public void naoDigitoNoCampoSenha(String senha) {
		//aguarde(1000);
		//criarUsario.getnaoDigitoNoCampoSenha().sendKeys(senha);
		
	//}

	//public void sistemaRetornaMensagemPorFavorInformeASenha() {
	//	aguarde(2000);
	//	String capturartexto = criarUsario.getInformeSenha().getText();
	  //  String valoresperado = "Por favor, informe a senha.";
	// assertEquals(capturartexto,valoresperado);
		
	//}

	

//	public void naoDigitoNoCampoConfirmeASenha(String confirmesenha) {
		//criarUsario.getNaoDigitoConfirmeASenha().sendKeys(confirmesenha);
		
	//}

	//public void sistemaRetornaMensagemSenhaDeConfirmacaoNaoCoincide() {
	//	aguarde(2000);
	// String capturartexto = criarUsario.getInformeConfirmacaoSenha().getText();
	//    String valoresperado = "Senha de confirmação não coincide.";
	// assertEquals(capturartexto,valoresperado);
		
	//}

	//public void sistemaRetornaInformandoEnderecoDeEMailJaExiste() {
	//	aguarde(2000);
	//	String capturartexto = criarUsario.getEnderecoDeEMailJaExiste().getText();
	  //  String valoresperado = "Endereço de e-mail já existe.";
	// assertEquals(capturartexto,valoresperado);
		
//	}

	//public void digitoNoCampoPrimeiroNomeTelaDeRegistreSe(String primeironome) {
		//aguarde(1000);
	//	criarUsario.getdigitoNoCampoPrimeiroNomeTelaDeRegistreSe().sendKeys(primeironome);
		
	//}

	//public void digitoNoCampoSobrenomeTelaDeRegistreSe(String sobrenome) {
	//	aguarde(1000);
		//criarUsario.getdigitoNoCampoSobrenomeTelaDeRegistreSe().sendKeys(sobrenome);
		
//	}

//	public void digitoNoCampoEnderecoDeEMailTelaDeRegistreSe(String enderecodeemail) {
	//	aguarde(1000);
	//	criarUsario.getdigitoNoCampoEnderecoDeEMailTelaDeRegistreSe().sendKeys(enderecodeemail);
		
//	}

	//public void digitoNoCampoSenhaTelaDeRegistreSe(String senha) {
		//aguarde(1000);
	//	criarUsario.getdigitoNoCampoSenhaTelaDeRegistreSe().sendKeys(senha);
		
	//}

	//public void digitoNoCampoConfirmeASenhaTelaDeRegistreSe(String confirmesenha) {
		//aguarde(1000);
	//	criarUsario.getdigitoNoCampoConfirmeASenhaTelaDeRegistreSe().sendKeys(confirmesenha);
		
	//}

	//public void naoDigitoNoCampoPrimeiroNomeTelaDeRegistreSe(String primeironome) {
	//	criarUsario.getnaoDigitoNoCampoPrimeiroNomeTelaDeRegistreSe().sendKeys(primeironome);
		
	//}
	
	////////////////////////////////////////////////////////////////////
	

	
		
	


	

	


	
	
	

}
