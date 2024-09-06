package br.com.stepDefinition;

import java.io.IOException;

import br.com.Action.MinhaContaAction;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class MinhaContaStep {

private MinhaContaAction telaminhaconta;
	
	public MinhaContaStep() throws IOException {
		telaminhaconta = new MinhaContaAction();
	}
	
	//@minhaconta01
	@Quando("clico na aba direita da tela inicio")
	public void clicoNaAbaDireitaDaTelaInicio() {
		telaminhaconta.clicoNaAbaDireitaDaTelaInicio();
	}

	@Quando("clico menu sua conta da aba")
	public void clicoMenuSuaContaDaAba() {
		telaminhaconta.clicoMenuSuaContaDaAba();
	}

	@Quando("exibe tela minha conta")
	public void exibeTelaMinhaConta() {
		telaminhaconta.exibeTelaMinhaConta();
	}

	@Quando("digito no campo cnpj da tela minha conta{string}")
	public void digitoNoCampoCnpjDaTelaMinhaConta(String cnpj) {
		telaminhaconta.digitoNoCampoCnpjDaTelaMinhaConta(cnpj);
	}

	@Quando("digito no campo nome da organizacao da tela minha conta {string}")
	public void digitoNoCampoNomeDaOrganizacaoDaTelaMinhaConta(String nomedaorganizacao) {
		telaminhaconta.digitoNoCampoNomeDaOrganizacaoDaTelaMinhaConta(nomedaorganizacao);
	}

	@Quando("digito no campo web site da tela minha conta {string}")
	public void digitoNoCampoWebSiteDaTelaMinhaConta(String website) {
		telaminhaconta.digitoNoCampoWebSiteDaTelaMinhaConta(website);
	}

	@Quando("digito no campo pedidos mensais da tela minha conta {string}")
	public void digitoNoCampoPedidosMensaisDaTelaMinhaConta(String pedidosmensais) {
		telaminhaconta.digitoNoCampoPedidosMensaisDaTelaMinhaConta(pedidosmensais);
	}

	@Quando("clico filtro timezone da tela minha conta")
	public void clicoFiltroTimezoneDaTelaMinhaConta() {
		telaminhaconta.clicoFiltroTimezoneDaTelaMinhaConta();
	}

	@Quando("selecione umas das opcoes do filtro timezone")
	public void selecioneUmasDasOpcoesDoFiltroTimezone() {
		telaminhaconta.selecioneUmasDasOpcoesDoFiltroTimezone();
	}

	@Quando("digito no campo email da tela minha conta {string}")
	public void digitoNoCampoEmailDaTelaMinhaConta(String emailminhaconta) {
		telaminhaconta.digitoNoCampoEmailDaTelaMinhaConta(emailminhaconta);
	}

	@Quando("digito no campo telefone da tela minha conta {string}")
	public void digitoNoCampoTelefoneDaTelaMinhaConta(String telefoneminhaconta) {
		telaminhaconta.digitoNoCampoTelefoneDaTelaMinhaConta(telefoneminhaconta);
	}

	@Quando("digito no campo rua da tela minha conta {string}")
	public void digitoNoCampoRuaDaTelaMinhaConta(String rua) {
		telaminhaconta.digitoNoCampoRuaDaTelaMinhaConta(rua);
	}

	@Quando("digito no campo cidade da tela minha conta {string}")
	public void digitoNoCampoCidadeDaTelaMinhaConta(String cidade) {
		telaminhaconta.digitoNoCampoCidadeDaTelaMinhaConta(cidade);
	}

	@Quando("digito no campo estado da tela minha conta {string}")
	public void digitoNoCampoEstadoDaTelaMinhaConta(String estado) {
		telaminhaconta.digitoNoCampoEstadoDaTelaMinhaConta(estado);
	}

	@Quando("digito no campo cep da tela minha conta {string}")
	public void digitoNoCampoCepDaTelaMinhaConta(String cep) {
		telaminhaconta.digitoNoCampoCepDaTelaMinhaConta(cep);
	}

	@Quando("clico botao salvar Alteracoes da tela minha conta")
	public void clicoBotaoSalvarAlteracoesDaTelaMinhaConta() {
		telaminhaconta.clicoBotaoSalvarAlteracoesDaTelaMinhaConta();
	}

	@Entao("sistema devera salvar alteracoes feita")
	public void sistemaDeveraSalvarAlteracoesFeita() {
		telaminhaconta.sistemaDeveraSalvarAlteracoesFeita();
	}
	
	//@minhaconta02
	
	@Quando("nao digito no campo cnpj da tela minha conta{string}")
	public void naoDigitoNoCampoCnpjDaTelaMinhaConta(String cnpj) {
		telaminhaconta.naoDigitoNoCampoCnpjDaTelaMinhaConta(cnpj); 
	}

	@Entao("sistema devera apresentar mensagem preencha todos os campos obrigatorios")
	public void sistemaDeveraApresentarMensagemPreenchaTodosOsCamposObrigatorios() {
		telaminhaconta.sistemaDeveraApresentarMensagemPreenchaTodosOsCamposObrigatorios();
	}
	
	//@minhaconta03
	
	@Quando("nao digito no campo nome da organizacao da tela minha conta {string}")
	public void naoDigitoNoCampoNomeDaOrganizacaoDaTelaMinhaConta(String nomedaorganizacao) {
		telaminhaconta.naoDigitoNoCampoNomeDaOrganizacaoDaTelaMinhaConta(nomedaorganizacao);
	}
	
	//@minhaconta04
	
	@Quando("nao digito no campo web site da tela minha conta {string}")
	public void naoDigitoNoCampoWebSiteDaTelaMinhaConta(String website) {
		telaminhaconta.naoDigitoNoCampoWebSiteDaTelaMinhaConta(website);
	}

	//@minhaconta05
	
	@Quando("nao digito no campo pedidos mensais da tela minha conta {string}")
	public void naoDigitoNoCampoPedidosMensaisDaTelaMinhaConta(String pedidosmensais) {
		telaminhaconta.naoDigitoNoCampoPedidosMensaisDaTelaMinhaConta(pedidosmensais);
	}

	//@minhaconta06
	
	@Quando("nao digito no campo email da tela minha conta {string}")
	public void naoDigitoNoCampoEmailDaTelaMinhaConta(String emailminhaconta) {
		telaminhaconta.naoDigitoNoCampoEmailDaTelaMinhaConta(emailminhaconta);
	}

}
