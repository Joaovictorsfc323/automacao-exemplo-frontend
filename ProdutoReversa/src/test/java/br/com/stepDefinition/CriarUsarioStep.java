package br.com.stepDefinition;

import java.io.IOException;

import br.com.Action.CriarUsarioAction;
import br.com.Action.LoginAction;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class CriarUsarioStep {

	private CriarUsarioAction criarUsario;
	private LoginAction login;
	
	public CriarUsarioStep() throws IOException {
		criarUsario = new CriarUsarioAction();
		login = new LoginAction();
	}
   
	//@CriarUsuario01
	@Dado("que exibe tela de login")
	public void queExibeTelaDeLogin() {
		criarUsario.queExibeTelaDeLogin();
	}

	@Quando("clico no link cadastre-se da tela de login")
	public void clicoNoLinkCadastreSeDaTelaDeLogin() {
		criarUsario.clicoNoLinkCadastreSeDaTelaDeLogin();
	}

	@Quando("exibe tela de registre -se")
	public void exibeTelaDeRegistreSe() {
		criarUsario.exibeTelaDeRegistreSe();
	}
	
	@Quando("digito no campo primeiro nome tela de registre -se{string}")
	public void digitoNoCampoPrimeiroNomeTelaDeRegistreSe(String primeironome) {
		criarUsario.digitoNoCampoPrimeiroNomeTelaDeRegistreSe(primeironome);
	}
	

	

	
	@Quando("digito no campo sobrenome tela de registre -se{string}")
	public void digitoNoCampoSobrenomeTelaDeRegistreSe(String sobrenome) {
		criarUsario.digitoNoCampoSobrenomeTelaDeRegistreSe(sobrenome);
	}

	@Quando("digito no campo endereco de e-mail tela de registre -se{string}")
	public void digitoNoCampoEnderecoDeEMailTelaDeRegistreSe(String enderecodeemail) {
		criarUsario.digitoNoCampoEnderecoDeEMailTelaDeRegistreSe(enderecodeemail);
	}

	@Quando("digito no campo senha tela de registre -se{string}")
	public void digitoNoCampoSenhaTelaDeRegistreSe(String senha) {
		criarUsario.digitoNoCampoSenhaTelaDeRegistreSe(senha); 
	}

	@Quando("digito no campo confirme a senha tela de registre -se{string}")
	public void digitoNoCampoConfirmeASenhaTelaDeRegistreSe(String confirmesenha) {
		criarUsario.digitoNoCampoConfirmeASenhaTelaDeRegistreSe(confirmesenha);
	}

	@Quando("clico no botao cadastre-se")
	public void clicoNoBotaoCadastreSe() {
		criarUsario.clicoNoBotaoCadastreSe();
	}

	@Entao("exibe tela verificacao de endereco de email")
	public void exibeTelaVerificacaoDeEnderecoDeEmail() {
		criarUsario.exibeTelaVerificacaoDeEnderecoDeEmail();
	}

	
	//@CriarUsuario02
	@Quando("nao digito no campo primeiro nome tela de registre -se{string}")
	public void naoDigitoNoCampoPrimeiroNomeTelaDeRegistreSe(String primeironome) {
		criarUsario.naoDigitoNoCampoPrimeiroNomeTelaDeRegistreSe(primeironome);
	}

	@Entao("sistema retorna mensagem  por favor informe o primeiro nome")
	public void sistemaRetornaMensagemPorFavorInformeOPrimeiroNome() {
		criarUsario.sistemaRetornaMensagemPorFavorInformeOPrimeiroNome();
	}
	
	//@CriarUsuario03
	

	@Quando("nao digito no campo sobrenome tela de registre -se{string}")
	public void naoDigitoNoCampoSobrenomeTelaDeRegistreSe(String sobrenome) {
		criarUsario.naoDigitoNoCampoSobrenomeTelaDeRegistreSe(sobrenome);
	}

	@Entao("sistema retorna mensagem  por favor informe o sobrenome")
	public void sistemaRetornaMensagemPorFavorInformeOSobrenome() {
		criarUsario.sistemaRetornaMensagemPorFavorInformeOSobrenome();
	}
	
	//@CriarUsuario04
	@Quando("nao digito no campo endereco de e-mail tela de registre -se{string}")
	public void naoDigitoNoCampoEnderecoDeEMailTelaDeRegistreSe(String enderecodeemail) {
		criarUsario.naoDigitoNoCampoEnderecoDeEMailTelaDeRegistreSe(enderecodeemail);
	}

	@Entao("sistema retorna mensagem  por favor informe o endereco de e-mail")
	public void sistemaRetornaMensagemPorFavorInformeOEnderecoDeEMail() {
	    criarUsario.sistemaRetornaMensagemPorFavorInformeOEnderecoDeEMail();
	}
	
	//@CriarUsuario05
	@Quando("nao digito no campo senha tela de registre -se{string}")
	public void naoDigitoNoCampoSenhaTelaDeRegistreSe(String senha) {
		criarUsario.naoDigitoNoCampoSenhaTelaDeRegistreSe(senha);
	}

	@Entao("sistema retorna mensagem  por favor informe a senha")
	public void sistemaRetornaMensagemPorFavorInformeASenha() {
		criarUsario.sistemaRetornaMensagemPorFavorInformeASenha();
	}
	
	//@CriarUsuario06
	@Quando("nao digito no campo confirme a senha tela de registre -se{string}")
	public void naoDigitoNoCampoConfirmeASenhaTelaDeRegistreSe(String confirmesenha) {
		criarUsario.naoDigitoNoCampoConfirmeASenhaTelaDeRegistreSe(confirmesenha);
	}

	@Entao("sistema retorna mensagem senha de confirmacao nao coincide")
	public void sistemaRetornaMensagemSenhaDeConfirmacaoNaoCoincide() {
		criarUsario.sistemaRetornaMensagemSenhaDeConfirmacaoNaoCoincide();
	}


	//@CriarUsuario07
	@Entao("sistema retorna informando endereco de e-mail ja existe")
	public void sistemaRetornaInformandoEnderecoDeEMailJaExiste() {
		criarUsario.sistemaRetornaInformandoEnderecoDeEMailJaExiste();
	}

	
	
	
	
	
	
	
	
	
}
