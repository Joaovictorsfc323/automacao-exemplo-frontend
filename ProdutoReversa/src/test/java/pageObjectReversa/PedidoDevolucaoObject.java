package pageObjectReversa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PedidoDevolucaoObject {

	public PedidoDevolucaoObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/button[2]/div/span")
	private WebElement clicoNoMenuPedidosDevolucoes;

	// =========
	public WebElement getclicoNoMenuPedidosDevolucoes() {

		return clicoNoMenuPedidosDevolucoes;
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div[3]/main/div[1]/h1")
	private WebElement exibeTelaPedidosDevolucoes;

	// =========
	public WebElement getexibeTelaPedidosDevolucoes() {

		return exibeTelaPedidosDevolucoes;
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div[3]/main/div[2]/div[1]/button[1]")
	private WebElement ClicoNaAbaTodos;

	// =========
	public WebElement getClicoNaAbaTodos() {

		return ClicoNaAbaTodos;
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div[3]/main/div[2]/div[2]/div[2]/button")
	private WebElement ClicoNoFiltroDATA;

	// =========
	public WebElement getClicoNoFiltroDATA() {

		return ClicoNoFiltroDATA;
	}

	@FindBy(css = "tr[id=\"row-table\"]>td:nth-of-type(5)")
	private WebElement statuspedidodevolucao;

	public WebElement getStatusPedidoDevolucao() {

		return statuspedidodevolucao;
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div[3]/main/div[2]/div[1]/button[2]")
	private WebElement ClicoNaAbaDoStatusPENDENTE;

	// =========
	public WebElement getClicoNaAbaDoStatusPENDENTE() {

		return ClicoNaAbaDoStatusPENDENTE;
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div[3]/main/div[2]/div[1]/button[3]")
	private WebElement ClicoNaAbaDoStatusAPROVADO;

	// =========
	public WebElement getClicoNaAbaDoStatusAPROVADO() {

		return ClicoNaAbaDoStatusAPROVADO;
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div[3]/main/div[2]/div[1]/button[4]")
	private WebElement ClicoNaAbaDoStatusENVIADO;

	// =========
	public WebElement getClicoNaAbaDoStatusENVIADO() {

		return ClicoNaAbaDoStatusENVIADO;
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div[3]/main/div[2]/div[1]/button[5]")
	private WebElement ClicoNaAbaDoStatusRECEBIDO;

	// =========
	public WebElement getClicoNaAbaDoStatusRECEBIDO() {

		return ClicoNaAbaDoStatusRECEBIDO;
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div[3]/main/div[2]/div[1]/button[6]")
	private WebElement ClicoNaAbaDoStatusRESOLVIDO;

	// =========
	public WebElement getClicoNaAbaDoStatusRESOLVIDO() {

		return ClicoNaAbaDoStatusRESOLVIDO;
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div[3]/main/div[2]/div[1]/button[7]")
	private WebElement ClicoNaAbaDoStatusREJEITADO;

	// =========
	public WebElement getClicoNaAbaDoStatusREJEITADO() {

		return ClicoNaAbaDoStatusREJEITADO;
	}

	@FindBy(css = "tr[id=\"row-table\"]>td:nth-of-type(5)")
	private WebElement ClicoNoPedidoComStatusAprovado;

	// =========
	public WebElement getClicoNoPedidoComStatusAprovado() {

		return ClicoNoPedidoComStatusAprovado;
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div[3]/main/div[1]/div[1]/div")
	private WebElement DetalheDoPedidoComStatusAprovado;

	// =========
	public WebElement getDetalheDoPedidoComStatusAprovado() {

		return DetalheDoPedidoComStatusAprovado;
	}

	@FindBy(css = "tr[id=\"row-table\"]>td:nth-of-type(5)")
	private WebElement ClicoNoPedidoComStatusPendente;

	// =========
	public WebElement getClicoNoPedidoComStatusPendente() {

		return ClicoNoPedidoComStatusPendente;
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div[3]/main/div[1]/div[1]/div")
	private WebElement DetalheDoPedidoComStatusPendente;

	// =========
	public WebElement getDetalheDoPedidoComStatusPendente() {
		// TODO Auto-generated method stub
		return DetalheDoPedidoComStatusPendente;
	}

	@FindBy(css = "tr[id=\"row-table\"]>td:nth-of-type(5)")
	private WebElement ClicoNoPedidoComStatusEnviado;

	// =========
	public WebElement getClicoNoPedidoComStatusEnviado() {

		return ClicoNoPedidoComStatusEnviado;
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div[3]/main/div[1]/div[1]/div")
	private WebElement DetalheDoPedidoComStatusEnviado;

	// =========
	public WebElement getDetalheDoPedidoComStatusEnviado() {

		return DetalheDoPedidoComStatusEnviado;
	}

	@FindBy(css = "tr[id=\"row-table\"]>td:nth-of-type(5)")
	private WebElement ClicoNoPedidoComStatusRecebido;

	// =========
	public WebElement getClicoNoPedidoComStatusRecebido() {

		return ClicoNoPedidoComStatusRecebido;
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div[3]/main/div[1]/div[1]/div")
	private WebElement DetalheDoPedidoComStatusRecebido;

	// =========
	public WebElement getDetalheDoPedidoComStatusRecebido() {

		return DetalheDoPedidoComStatusRecebido;
	}

	@FindBy(css = "tr[id=\"row-table\"]>td:nth-of-type(5)")
	private WebElement ClicoNoPedidoComStatusResolvido;

	// =========
	public WebElement getClicoNoPedidoComStatusResolvido() {
		// TODO Auto-generated method stub
		return ClicoNoPedidoComStatusResolvido;
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div[3]/main/div[1]/div[1]/div")
	private WebElement DetalheDoPedidoComStatusResolvido;
	// =========

	public WebElement getDetalheDoPedidoComStatusResolvido() {
		// TODO Auto-generated method stub
		return DetalheDoPedidoComStatusResolvido;
	}

	@FindBy(css = "tr[id=\"row-table\"]>td:nth-of-type(5)")
	private WebElement ClicoNoPedidoComStatusRejeitado;

	// =========
	public WebElement getClicoNoPedidoComStatusRejeitado() {
		// TODO Auto-generated method stub
		return ClicoNoPedidoComStatusRejeitado;
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div[3]/main/div[1]/div[1]/div")
	private WebElement DetalheDoPedidoComStatusRejeitado;

	// =========
	public WebElement getDetalheDoPedidoComStatusRejeitado() {
		// TODO Auto-generated method stub
		return DetalheDoPedidoComStatusRejeitado;
	}

}
