package br.com.Action;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import br.com.driver.PageBase;
import pageObjectReversa.PedidoDevolucaoObject;

public class PedidoDevolucaoAction extends PageBase {

	private PedidoDevolucaoObject pedidodevolucao;

	public PedidoDevolucaoAction() throws IOException {
		pedidodevolucao = new PedidoDevolucaoObject(driver);
	}

	public void aguarde(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (Exception e) {

		}

	}

	public boolean existe(WebElement element) {
		Boolean existe = element.isEnabled();
		return existe;
	}

	public void clicoNoMenuPedidosDevolucoes() {
		aguarde(1000);
		pedidodevolucao.getclicoNoMenuPedidosDevolucoes().click();

	}

	public void exibeTelaPedidosDevolucoes() {
		aguarde(2000);
		String capturartexto = pedidodevolucao.getexibeTelaPedidosDevolucoes().getText();
		String valoresperado = "Pedidos/Devolução";
		assertEquals(capturartexto, valoresperado);

	}

	public void clicoNaAbaTodos() {
		aguarde(1000);
		pedidodevolucao.getClicoNaAbaTodos().click();

	}

	public void sistemaRetornaComListaDeTodosStatusDisponiveis() {

		// existe(pedidodevolucao.getstatuscinco());
	}

	public void clicoNaAbaDoStatusPENDENTE() {
		aguarde(1000);
		pedidodevolucao.getClicoNaAbaDoStatusPENDENTE().click();

	}

	public void sistemaRetornaComListaDeTodosStatusPendenteDisponiveis() {
		aguarde(1000);
		existe(pedidodevolucao.getStatusPedidoDevolucao());
	}

	public void clicoNaAbaDoStatusAPROVADO() {
		aguarde(1000);
		pedidodevolucao.getClicoNaAbaDoStatusAPROVADO().click();

	}

	public void sistemaRetornaComListaDeTodosStatusAprovadoDisponiveis() {
		aguarde(1000);
		existe(pedidodevolucao.getStatusPedidoDevolucao());
	}

	public void clicoNaAbaDoStatusENVIADO() {
		aguarde(1000);
		pedidodevolucao.getClicoNaAbaDoStatusENVIADO().click();

	}

	public void sistemaRetornaComListaDeTodosStatusENVIADODisponiveis() {
		aguarde(1000);
		existe(pedidodevolucao.getStatusPedidoDevolucao());
	}

	public void clicoNaAbaDoStatusRECEBIDO() {
		aguarde(1000);
		pedidodevolucao.getClicoNaAbaDoStatusRECEBIDO().click();

	}

	public void sistemaRetornaComListaDeTodosStatusRECEBIDODisponiveis() {
		aguarde(1000);
		existe(pedidodevolucao.getStatusPedidoDevolucao());
	}

	public void clicoNaAbaDoStatusRESOLVIDO() {
		aguarde(1000);
		pedidodevolucao.getClicoNaAbaDoStatusRESOLVIDO().click();

	}

	public void sistemaRetornaComListaDeTodosStatusRESOLVIDODisponiveis() {
		aguarde(1000);
		existe(pedidodevolucao.getStatusPedidoDevolucao());

	}

	public void clicoNaAbaDoStatusREJEITADO() {
		aguarde(1000);
		pedidodevolucao.getClicoNaAbaDoStatusREJEITADO().click();

	}

	public void sistemaRetornaComListaDeTodosStatusREJEITADODisponiveis() {
		aguarde(1000);
		existe(pedidodevolucao.getStatusPedidoDevolucao());

	}

////////////ConsultaPedidosFiltros///////////////////////////////////

	public void clicoNoFiltroDATA() {
		aguarde(1000);
		pedidodevolucao.getClicoNoFiltroDATA().click();

	}

	public void escolherDataEspecificaDoLojistaConformeDesejado(String data) {

	}

	public void clicoEmBuscarFiltros() {

	}

	public void sistemaRetornaComListaDasCombinacaoQueLojistaSelecionouDisponiveis() {

	}

///////Detalhe do Pedido ///////

	// @visualizarpedidodevolucao01
	public void exibeListaComStatusPendenteTelaPedidosDevolucoes() {
		aguarde(1000);
		existe(pedidodevolucao.getStatusPedidoDevolucao());

	}

	public void clicoNoPedidoComStatusPendenteTelaPedidosDevolucoes() {
		aguarde(1000);
		pedidodevolucao.getClicoNoPedidoComStatusPendente().click();

	}

	public void sistemaApresentaDetalheDoPedidoComStatusPendente() {
		aguarde(2000);
		String capturartexto = pedidodevolucao.getDetalheDoPedidoComStatusPendente().getText();
		String valoresperado = "Pendente";
		assertEquals(capturartexto, valoresperado);

	}

	// @visualizarpedidodevolucao02
	public void exibeListaComStatusAprovadosTelaPedidosDevolucoes() {
		aguarde(1000);
		existe(pedidodevolucao.getStatusPedidoDevolucao());

	}

	public void clicoNoPedidoComStatusAprovadoTelaPedidosDevolucoes() {
		aguarde(1000);
		pedidodevolucao.getClicoNoPedidoComStatusAprovado().click();

	}

	public void sistemaApresentaDetalheDoPedidoComStatusAprovado() {
		aguarde(2000);
		String capturartexto = pedidodevolucao.getDetalheDoPedidoComStatusAprovado().getText();
		String valoresperado = "Aprovado";
		assertEquals(capturartexto, valoresperado);
	}

	// @visualizarpedidodevolucao03

	public void exibeListaComStatusEnviadoTelaPedidosDevolucoes() {
		aguarde(1000);
		existe(pedidodevolucao.getStatusPedidoDevolucao());

	}

	public void clicoNoPedidoComStatusEnviadoTelaPedidosDevolucoes() {
		aguarde(1000);
		pedidodevolucao.getClicoNoPedidoComStatusEnviado().click();

	}

	public void sistemaApresentaDetalheDoPedidoComStatusEnviado() {
		aguarde(2000);
		String capturartexto = pedidodevolucao.getDetalheDoPedidoComStatusEnviado().getText();
		String valoresperado = "Enviado";
		assertEquals(capturartexto, valoresperado);

	}

	// @visualizarpedidodevolucao04
	public void exibeListaComStatusRecebidoTelaPedidosDevolucoes() {
		aguarde(1000);
		existe(pedidodevolucao.getStatusPedidoDevolucao());

	}

	public void clicoNoPedidoComStatusRecebidoTelaPedidosDevolucoes() {
		aguarde(1000);
		pedidodevolucao.getClicoNoPedidoComStatusRecebido().click();

	}

	public void sistemaApresentaDetalheDoPedidoComStatusRecebido() {
		aguarde(2000);
		String capturartexto = pedidodevolucao.getDetalheDoPedidoComStatusRecebido().getText();
		String valoresperado = "Recebido";
		assertEquals(capturartexto, valoresperado);

	}

	// @visualizarpedidodevolucao05

	public void exibeListaComStatusResolvidoTelaPedidosDevolucoes() {
		aguarde(1000);
		existe(pedidodevolucao.getStatusPedidoDevolucao());

	}

	public void clicoNoPedidoComStatusResolvidoTelaPedidosDevolucoes() {
		aguarde(1000);
		pedidodevolucao.getClicoNoPedidoComStatusResolvido().click();

	}

	public void sistemaApresentaDetalheDoPedidoComStatusResolvido() {
		aguarde(2000);
		String capturartexto = pedidodevolucao.getDetalheDoPedidoComStatusResolvido().getText();
		String valoresperado = "Resolvido";
		assertEquals(capturartexto, valoresperado);

	}

	// @visualizarpedidodevolucao06

	public void exibeListaComStatusRejeitadoTelaPedidosDevolucoes() {
		aguarde(1000);
		existe(pedidodevolucao.getStatusPedidoDevolucao());

	}

	public void clicoNoPedidoComStatusRejeitadoTelaPedidosDevolucoes() {
		aguarde(1000);
		pedidodevolucao.getClicoNoPedidoComStatusRejeitado().click();

	}

	public void sistemaApresentaDetalheDoPedidoComStatusRejeitado() {
		aguarde(2000);
		String capturartexto = pedidodevolucao.getDetalheDoPedidoComStatusRejeitado().getText();
		String valoresperado = "Rejeitado";
		assertEquals(capturartexto, valoresperado);

	}

}
