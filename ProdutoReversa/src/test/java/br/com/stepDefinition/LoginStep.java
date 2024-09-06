package br.com.stepDefinition;

import java.io.IOException;

import br.com.Action.CriarUsarioAction;
import br.com.Action.LoginAction;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginStep {

	private LoginAction login;
	private CriarUsarioAction criarUsario;
	

	
	public LoginStep() throws IOException {
		login = new LoginAction();
		criarUsario = new CriarUsarioAction();
		
		
		
	}

	//@login01
	@Quando("digito no campo endereco de e-mail tela login{string}")
	public void digitoNoCampoEnderecoDeEMailTelaLogin(String enderecodeemail) {
		login.digitoNoCampoEnderecoDeEMailTelaLogin(enderecodeemail);
	}

	@Quando("digito no campo senha tela login{string}")
	public void digitoNoCampoSenhaTelaLogin(String senha) {
		login.digitoNoCampoSenhaTelaLogin(senha);
	}

	@Quando("clico no botao entrar tela login")
	public void clicoNoBotaoEntrarTelaLogin() {
		login.clicoNoBotaoEntrarTelaLogin();
	}

	@Entao("e feito login com sucesso")
	public void eFeitoLoginComSucesso() {
		login.eFeitoLoginComSucesso();
	}
	
	//@login02
	@Quando("nao digito no campo endereco de e-mail tela login{string}")
	public void naoDigitoNoCampoEnderecoDeEMailTelaLogin(String enderecodeemail) {
		login.naoDigitoNoCampoEnderecoDeEMailTelaLogin(enderecodeemail);
	}

	@Entao("o sistema retorna nome de usuario ou senha invalida")
	public void oSistemaRetornaNomeDeUsuarioOuSenhaInvalida() {
		login.oSistemaRetornaNomeDeUsuarioOuSenhaInvalida();
	}

	//@login03
	
	@Quando("digito no campo endereco de e-mail incorreto tela login{string}")
	public void digitoNoCampoEnderecoDeEMailIncorretoTelaLogin(String enderecodeemail) {
		login.digitoNoCampoEnderecoDeEMailIncorretoTelaLogin(enderecodeemail);
	}

	
	//@login04
	@Quando("nao digito no campo senha tela login{string}")
	public void naoDigitoNoCampoSenhaTelaLogin(String senha) {
		login.naoDigitoNoCampoSenhaTelaLogin(senha);
	}
	//@login05
	@Quando("digito no campo senha incorreto tela login{string}")
	public void digitoNoCampoSenhaIncorretoTelaLogin(String senha) {
		login.digitoNoCampoSenhaIncorretoTelaLogin(senha);
	}
	
	
	
 ///////////////////Esqueceu sua Senha ////////////////////////////
	
	//@EsquecerSenha01
	@Quando("clico no link esqueceu sua senha da tela login")
	public void clicoNoLinkEsqueceuSuaSenhaDaTelaLogin() {
		login.clicoNoLinkEsqueceuSuaSenhaDaTelaLogin();
	}

	@Quando("exibe tela esqueceu sua senha")
	public void exibeTelaEsqueceuSuaSenha() {
		login.exibeTelaEsqueceuSuaSenha();
	}

	@Quando("digito no campo endereco de e-mail tela esqueceu sua senha{string}")
	public void digitoNoCampoEnderecoDeEMailTelaEsqueceuSuaSenha(String enderecodeemail) {
		login.digitoNoCampoEnderecoDeEMailTelaEsqueceuSuaSenha(enderecodeemail);
	}

	@Quando("clico no botao OK tela esqueceu sua senha")
	public void clicoNoBotaoOKTelaEsqueceuSuaSenha() {
		login.clicoNoBotaoOKTelaEsqueceuSuaSenha();
	}

	@Entao("sistema envia notificacao por email para fazer reset de senha")
	public void sistemaEnviaNotificacaoPorEmailParaFazerResetDeSenha() {
		login.sistemaEnviaNotificacaoPorEmailParaFazerResetDeSenha();
	}

	//@EsquecerSenha02
	@Quando("nao digito no campo endereco de e-mail tela esqueceu sua senha{string}")
	public void naoDigitoNoCampoEnderecoDeEMailTelaEsqueceuSuaSenha(String enderecodeemail) {
		login.naoDigitoNoCampoEnderecoDeEMailTelaEsqueceuSuaSenha(enderecodeemail);
	}

	@Entao("sistema retorna mensagem por favor informe o nome de usuario")
	public void sistemaRetornaMensagemPorFavorInformeONomeDeUsuario() {
		login.sistemaRetornaMensagemPorFavorInformeONomeDeUsuario();
	}


}
