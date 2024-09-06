package br.com.Action;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import br.com.driver.PageBase;
import pageObjectReversa.MinhaContaPageObject;

public class MinhaContaAction extends PageBase  {

	
	 private MinhaContaPageObject telaminhaconta;
	
	 
	 
	 public MinhaContaAction() throws IOException {
		 telaminhaconta = new MinhaContaPageObject(driver);
		 
		
		
	 }

	 public void aguarde(int tempo) {
			try {
				Thread.sleep(tempo);
			} catch (Exception e ){ 
			
			}
			
		}

	//@minhaconta01
	 
	public void clicoNaAbaDireitaDaTelaInicio() {
		aguarde(2000);
		telaminhaconta.getClicoNaAbaDireitaDaTelaInicio().click();
		
	}

	public void clicoMenuSuaContaDaAba() {
		aguarde(2000);
		telaminhaconta.getclicoMenuSuaContaDaAba().click();
		
	}

	public void exibeTelaMinhaConta() {
		aguarde(2000);
		String capturartexto = telaminhaconta.getexibeTelaMinhaConta().getText();
	    String valoresperado = "Minha Conta";
	        assertEquals(capturartexto,valoresperado);
		
	}

	public void digitoNoCampoCnpjDaTelaMinhaConta(String cnpj) {
		aguarde(3000);
		telaminhaconta.getdigitoNoCampoCnpj().sendKeys(cnpj);
		
	}

	public void digitoNoCampoNomeDaOrganizacaoDaTelaMinhaConta(String nomedaorganizacao) {
		aguarde(2000);
		telaminhaconta.getdigitoNoCampoNomeDaOrganizacao().sendKeys(nomedaorganizacao);
		
	}

	public void digitoNoCampoWebSiteDaTelaMinhaConta(String website) {
		aguarde(2000);
		telaminhaconta.getdigitoNoCampoWebSite().sendKeys(website);
		
	}

	public void digitoNoCampoPedidosMensaisDaTelaMinhaConta(String pedidosmensais) {
		aguarde(2000);
		telaminhaconta.getdigitoNoCampoPedidosMensais().sendKeys(pedidosmensais);
		
	}

	public void clicoFiltroTimezoneDaTelaMinhaConta() {
		aguarde(2000);
		telaminhaconta.getclicoFiltroTimezone().click();
		
	}

	public void selecioneUmasDasOpcoesDoFiltroTimezone() {
		// duvida pesquisar na internet 
		
	}

	public void digitoNoCampoEmailDaTelaMinhaConta(String emailminhaconta) {
		aguarde(1000);
		telaminhaconta.getdigitoNoCampoEmailDaTelaMinhaConta().sendKeys(emailminhaconta);
		
	}

	public void digitoNoCampoTelefoneDaTelaMinhaConta(String telefoneminhaconta) {
		aguarde(1000);
		telaminhaconta.getdigitoNoCampoTelefone().sendKeys(telefoneminhaconta);
		
	}

	public void digitoNoCampoRuaDaTelaMinhaConta(String rua) {
		aguarde(1000);
		telaminhaconta.getdigitoNoCampoRua().sendKeys(rua);
		
	}

	public void digitoNoCampoCidadeDaTelaMinhaConta(String cidade) {
		aguarde(1000);
		telaminhaconta.getdigitoNoCampoCidade().sendKeys(cidade);
		
	}

	public void digitoNoCampoEstadoDaTelaMinhaConta(String estado) {
		aguarde(1000);
		telaminhaconta.getdigitoNoCampoEstado().sendKeys(estado);
		
	}

	public void digitoNoCampoCepDaTelaMinhaConta(String cep) {
		aguarde(1000);
		telaminhaconta.getdigitoNoCampoCep().sendKeys(cep);
		
	}

	public void clicoBotaoSalvarAlteracoesDaTelaMinhaConta() {
		aguarde(1000);
		telaminhaconta.getBotaoSalvarAlteracoesDaTelaMinhaConta().click();
		
	}

	public void sistemaDeveraSalvarAlteracoesFeita() {
		aguarde(2000);
		String capturartexto = telaminhaconta.getSalvarAlteracoesMinhaconta().getText();
	    String valoresperado = "Dados atualizados com sucesso!";
	        assertEquals(capturartexto,valoresperado);
		
	}

	
		
	//@minhaconta02

	public void naoDigitoNoCampoCnpjDaTelaMinhaConta(String cnpj) {
		aguarde(1000);
		telaminhaconta.getdigitoNoCampoCnpj().sendKeys(cnpj);

	}

	public void sistemaDeveraApresentarMensagemPreenchaTodosOsCamposObrigatorios() {
		aguarde(2000);
		String capturartexto = telaminhaconta.getMensagemPreenchaTodosOsCamposObrigatorios().getText();
	    String valoresperado = "Preencha todos os campos obrigatórios.";
	        assertEquals(capturartexto,valoresperado);

	}

	//@minhaconta03

	public void naoDigitoNoCampoNomeDaOrganizacaoDaTelaMinhaConta(String nomedaorganizacao) {
		aguarde(1000);
		telaminhaconta.getdigitoNoCampoNomeDaOrganizacao().sendKeys(nomedaorganizacao);

	}

	//@minhaconta04

	public void naoDigitoNoCampoWebSiteDaTelaMinhaConta(String website) {
		aguarde(1000);
		telaminhaconta.getdigitoNoCampoWebSite().sendKeys(website);

	}



	//@minhaconta05

	public void naoDigitoNoCampoPedidosMensaisDaTelaMinhaConta(String pedidosmensais) {
		aguarde(1000);
		telaminhaconta.getdigitoNoCampoPedidosMensais().sendKeys(pedidosmensais);

	}



	//@minhaconta06

	public void naoDigitoNoCampoEmailDaTelaMinhaConta(String emailminhaconta) {
		aguarde(1000);
		telaminhaconta.getdigitoNoCampoEmailDaTelaMinhaConta().sendKeys(emailminhaconta);

	}

	
	
	
}
