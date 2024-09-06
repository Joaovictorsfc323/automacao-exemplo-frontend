package br.com.stepDefinition;

import java.io.IOException;

import br.com.Action.PedidoDevolucaoAction;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class PedidoDevolucaoStep {

	private PedidoDevolucaoAction pedidodevolucao;

	public PedidoDevolucaoStep() throws IOException {
		pedidodevolucao = new PedidoDevolucaoAction();
	}

	// @visualizarStatus01
	@Quando("clico no menu pedidos devolucoes")
	public void clicoNoMenuPedidosDevolucoes() {
		pedidodevolucao.clicoNoMenuPedidosDevolucoes();
	}

	@Quando("exibe tela pedidos devolucoes")
	public void exibeTelaPedidosDevolucoes() {
		pedidodevolucao.exibeTelaPedidosDevolucoes();
	}

	@Quando("clico na aba todos")
	public void clicoNaAbaTodos() {
		pedidodevolucao.clicoNaAbaTodos();
	}

	@Entao("sistema retorna com lista de todos status disponiveis")
	public void sistemaRetornaComListaDeTodosStatusDisponiveis() {
		pedidodevolucao.sistemaRetornaComListaDeTodosStatusDisponiveis();
	}

	// @visualizarStatus02

	@Quando("clico na aba do status PENDENTE")
	public void clicoNaAbaDoStatusPENDENTE() {
		pedidodevolucao.clicoNaAbaDoStatusPENDENTE();
	}

	@Entao("sistema retorna com lista de todos status pendente disponiveis")
	public void sistemaRetornaComListaDeTodosStatusPendenteDisponiveis() {
		pedidodevolucao.sistemaRetornaComListaDeTodosStatusPendenteDisponiveis();
	}

	// @visualizarStatus03

	@Quando("clico na aba do status APROVADO")
	public void clicoNaAbaDoStatusAPROVADO() {
		pedidodevolucao.clicoNaAbaDoStatusAPROVADO();
	}

	@Entao("sistema retorna com lista de todos status aprovado disponiveis")
	public void sistemaRetornaComListaDeTodosStatusAprovadoDisponiveis() {
		pedidodevolucao.sistemaRetornaComListaDeTodosStatusAprovadoDisponiveis();
	}

	// @visualizarStatus04
	@Quando("clico na aba do status ENVIADO")
	public void clicoNaAbaDoStatusENVIADO() {
		pedidodevolucao.clicoNaAbaDoStatusENVIADO();
	}

	@Entao("sistema retorna com lista de todos status ENVIADO disponiveis")
	public void sistemaRetornaComListaDeTodosStatusENVIADODisponiveis() {
		pedidodevolucao.sistemaRetornaComListaDeTodosStatusENVIADODisponiveis();
	}

	// @visualizarStatus05
	@Quando("clico na aba do status RECEBIDO")
	public void clicoNaAbaDoStatusRECEBIDO() {
		pedidodevolucao.clicoNaAbaDoStatusRECEBIDO();
	}

	@Entao("sistema retorna com lista de todos status RECEBIDO disponiveis")
	public void sistemaRetornaComListaDeTodosStatusRECEBIDODisponiveis() {
		pedidodevolucao.sistemaRetornaComListaDeTodosStatusRECEBIDODisponiveis();
	}

	// @visualizarStatus06
	@Quando("clico na aba do status RESOLVIDO")
	public void clicoNaAbaDoStatusRESOLVIDO() {
		pedidodevolucao.clicoNaAbaDoStatusRESOLVIDO();
	}

	@Entao("sistema retorna com lista de todos status RESOLVIDO disponiveis")
	public void sistemaRetornaComListaDeTodosStatusRESOLVIDODisponiveis() {
		pedidodevolucao.sistemaRetornaComListaDeTodosStatusRESOLVIDODisponiveis();
	}
	// @visualizarStatus07

	@Quando("clico na aba do status REJEITADO")
	public void clicoNaAbaDoStatusREJEITADO() {
		pedidodevolucao.clicoNaAbaDoStatusREJEITADO();
	}

	@Entao("sistema retorna com lista de todos status REJEITADO disponiveis")
	public void sistemaRetornaComListaDeTodosStatusREJEITADODisponiveis() {
		pedidodevolucao.sistemaRetornaComListaDeTodosStatusREJEITADODisponiveis();
	}

	//////////// ConsultaPedidosFiltros///////////////////////////////////

	// @filtrosPedidos01
	@Quando("clico no filtro DATA")
	public void clicoNoFiltroDATA() {
		pedidodevolucao.clicoNoFiltroDATA();
	}

	@Quando("escolher data especifica do lojista conforme desejado {string}")
	public void escolherDataEspecificaDoLojistaConformeDesejado(String data) {
		pedidodevolucao.escolherDataEspecificaDoLojistaConformeDesejado(data);
	}

	@Quando("clico em buscar filtros")
	public void clicoEmBuscarFiltros() {
		pedidodevolucao.clicoEmBuscarFiltros();
	}

	@Entao("sistema retorna com lista das combinacao que lojista selecionou disponiveis")
	public void sistemaRetornaComListaDasCombinacaoQueLojistaSelecionouDisponiveis() {
		pedidodevolucao.sistemaRetornaComListaDasCombinacaoQueLojistaSelecionouDisponiveis();
	}

	/////// Detalhe do Pedido ///////

	// @visualizardetalhepedido01

	@Quando("exibe lista com status pendente tela pedidos devolucoes")
	public void exibeListaComStatusPendenteTelaPedidosDevolucoes() {
		pedidodevolucao.exibeListaComStatusPendenteTelaPedidosDevolucoes();
	}

	@Quando("clico no pedido com status pendente tela pedidos devolucoes")
	public void clicoNoPedidoComStatusPendenteTelaPedidosDevolucoes() {
		pedidodevolucao.clicoNoPedidoComStatusPendenteTelaPedidosDevolucoes();
	}

	@Entao("sistema apresenta detalhe do pedido com status pendente")
	public void sistemaApresentaDetalheDoPedidoComStatusPendente() {
		pedidodevolucao.sistemaApresentaDetalheDoPedidoComStatusPendente();
	}

	// @visualizardetalhepedido02

	@Quando("exibe lista com status aprovados tela pedidos devolucoes")
	public void exibeListaComStatusAprovadosTelaPedidosDevolucoes() {
		pedidodevolucao.exibeListaComStatusAprovadosTelaPedidosDevolucoes();

	}

	@Quando("clico no pedido com status aprovado tela pedidos devolucoes")
	public void clicoNoPedidoComStatusAprovadoTelaPedidosDevolucoes() {
		pedidodevolucao.clicoNoPedidoComStatusAprovadoTelaPedidosDevolucoes();
	}

	@Entao("sistema apresenta detalhe do pedido com status aprovado")
	public void sistemaApresentaDetalheDoPedidoComStatusAprovado() {
		pedidodevolucao.sistemaApresentaDetalheDoPedidoComStatusAprovado();
	}

	// @visualizardetalhepedido03

	@Quando("exibe lista com status enviado tela pedidos devolucoes")
	public void exibeListaComStatusEnviadoTelaPedidosDevolucoes() {
		pedidodevolucao.exibeListaComStatusEnviadoTelaPedidosDevolucoes();
	}

	@Quando("clico no pedido com status enviado tela pedidos devolucoes")
	public void clicoNoPedidoComStatusEnviadoTelaPedidosDevolucoes() {
		pedidodevolucao.clicoNoPedidoComStatusEnviadoTelaPedidosDevolucoes();
	}

	@Entao("sistema apresenta detalhe do pedido com status enviado")
	public void sistemaApresentaDetalheDoPedidoComStatusEnviado() {
		pedidodevolucao.sistemaApresentaDetalheDoPedidoComStatusEnviado();
	}

	// @visualizardetalhepedido04
	@Quando("exibe lista com status recebido tela pedidos devolucoes")
	public void exibeListaComStatusRecebidoTelaPedidosDevolucoes() {
		pedidodevolucao.exibeListaComStatusRecebidoTelaPedidosDevolucoes();
	}

	@Quando("clico no pedido com status recebido tela pedidos devolucoes")
	public void clicoNoPedidoComStatusRecebidoTelaPedidosDevolucoes() {
		pedidodevolucao.clicoNoPedidoComStatusRecebidoTelaPedidosDevolucoes();
	}

	@Entao("sistema apresenta detalhe do pedido com status recebido")
	public void sistemaApresentaDetalheDoPedidoComStatusRecebido() {
		pedidodevolucao.sistemaApresentaDetalheDoPedidoComStatusRecebido();
	}

	// @visualizardetalhepedido05

	@Quando("exibe lista com status resolvido tela pedidos devolucoes")
	public void exibeListaComStatusResolvidoTelaPedidosDevolucoes() {
		pedidodevolucao.exibeListaComStatusResolvidoTelaPedidosDevolucoes();
	}

	@Quando("clico no pedido com status resolvido tela pedidos devolucoes")
	public void clicoNoPedidoComStatusResolvidoTelaPedidosDevolucoes() {
		pedidodevolucao.clicoNoPedidoComStatusResolvidoTelaPedidosDevolucoes();
	}

	@Entao("sistema apresenta detalhe do pedido com status resolvido")
	public void sistemaApresentaDetalheDoPedidoComStatusResolvido() {
		pedidodevolucao.sistemaApresentaDetalheDoPedidoComStatusResolvido();
	}

	// @visualizardetalhepedido06

	@Quando("exibe lista com status rejeitado tela pedidos devolucoes")
	public void exibeListaComStatusRejeitadoTelaPedidosDevolucoes() {
		pedidodevolucao.exibeListaComStatusRejeitadoTelaPedidosDevolucoes();
	}

	@Quando("clico no pedido com status rejeitado tela pedidos devolucoes")
	public void clicoNoPedidoComStatusRejeitadoTelaPedidosDevolucoes() {
		pedidodevolucao.clicoNoPedidoComStatusRejeitadoTelaPedidosDevolucoes();
	}

	@Entao("sistema apresenta detalhe do pedido com status rejeitado")
	public void sistemaApresentaDetalheDoPedidoComStatusRejeitado() {
		pedidodevolucao.sistemaApresentaDetalheDoPedidoComStatusRejeitado();
	}

}
