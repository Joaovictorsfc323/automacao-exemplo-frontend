package br.com.stepDefinition;


import java.io.IOException;


import br.com.Action.InicioAction;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class InicioStep {

	private InicioAction inicio;
	
	public InicioStep() throws IOException {
		inicio = new InicioAction();
	}
	//@Inicio01
	@Quando("exibe tela inicio")
	public void exibeTelaInicio() {
		inicio.exibeTelaInicio();
	}

	@Quando("clico no botao logout da tela inicio")
	public void clicoNoBotaoLogoutDaTelaInicio() {
		inicio.clicoNoBotaoLogoutDaTelaInicio();
	}

	
	@Quando("clico menu sair da aba")
	public void clicoMenuSairDaAba() {
		inicio.clicoMenuSairDaAba();
	}


	@Entao("exibe tela login")
	public void exibeTelaLogin() {
		inicio.exibeTelaLogin();
	}
	
	
	
	
	
	
	
	
	
	
}
