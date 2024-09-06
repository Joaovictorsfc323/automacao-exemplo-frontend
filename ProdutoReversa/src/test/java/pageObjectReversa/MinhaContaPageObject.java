package pageObjectReversa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MinhaContaPageObject {

	public MinhaContaPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(css = "div[id=\"container-user\"]>div>svg")
	private WebElement ClicoNaAbaDireitaDaTelaInicio;
        // =========
	public WebElement getClicoNaAbaDireitaDaTelaInicio() {
		
		return ClicoNaAbaDireitaDaTelaInicio;
	}
	
	@FindBy(css =  "div[class=\"sc-eCYdqJ jFSEnj animate__animated animate__fadeIn\"]>button:nth-child(1)")
	private WebElement clicoMenuSuaContaDaAba;
		//=========
	public WebElement getclicoMenuSuaContaDaAba() {
		
		return clicoMenuSuaContaDaAba;
	}
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[1]/div/h1")
	private WebElement exibeTelaMinhaConta;
	//=========
	public WebElement getexibeTelaMinhaConta() {
		
		return exibeTelaMinhaConta;
	}
	
	@FindBy(css = "div[class=\"MuiCardContent-root css-1qw96cp\"]>div:nth-child(1)>div>input")
	private WebElement digitoNoCampoCnpj;
	//=========
	public WebElement getdigitoNoCampoCnpj() {
		
		return digitoNoCampoCnpj;
	}
	
	@FindBy(css = "div[class=\"MuiCardContent-root css-1qw96cp\"]>div:nth-child(2)>div>input")
	private WebElement digitoNoCampoNomeDaOrganizacao;
	//=========
	public WebElement getdigitoNoCampoNomeDaOrganizacao() {
		
		return digitoNoCampoNomeDaOrganizacao;
	}
	
	@FindBy(css = "div[class=\"MuiCardContent-root css-1qw96cp\"]>div:nth-child(3)>div>input")
	private WebElement digitoNoCampoWebSite;
	//=========
	public WebElement getdigitoNoCampoWebSite() {
		
		return digitoNoCampoWebSite;
	}

	@FindBy(css = "div[class=\"MuiCardContent-root css-1qw96cp\"]>div:nth-child(4)>div>input")
	private WebElement digitoNoCampoPedidosMensais;
	//=========
	public WebElement getdigitoNoCampoPedidosMensais() {
		
		return digitoNoCampoPedidosMensais;
	}
	
	@FindBy(css = "div[class=\"MuiCardContent-root css-1qw96cp\"]>div:nth-child(5)>div>input")
	private WebElement clicoFiltroTimezone;
	//=========
	public WebElement getclicoFiltroTimezone() {
		
		return clicoFiltroTimezone;
	}
      
	@FindBy(css = "div[class=\"MuiCardContent-root css-1qw96cp\"]>div:nth-child(6)>div>input")
	private WebElement digitoNoCampoEmailDaTelaMinhaConta;
	//=========
	public WebElement getdigitoNoCampoEmailDaTelaMinhaConta() {
		
		return digitoNoCampoEmailDaTelaMinhaConta;
	}
     
	@FindBy(css = "div[class=\"MuiCardContent-root css-1qw96cp\"]>div:nth-child(7)>div>input")
	private WebElement digitoNoCampoTelefone;
	//=========
	public WebElement getdigitoNoCampoTelefone() {
		
		return digitoNoCampoTelefone;
	}
    
	@FindBy(css = "div[class=\"sc-cxabCf JGygT\"]>div:nth-child(3)>div>div:nth-child(1)>div>input")
	private WebElement digitoNoCampoRua;
	//=========
	public WebElement getdigitoNoCampoRua() {
		// TODO Auto-generated method stub
		return digitoNoCampoRua;
	}
      
	@FindBy(css = "div[class=\"sc-cxabCf JGygT\"]>div:nth-child(3)>div>div:nth-child(2)>div>input")
	private WebElement digitoNoCampoCidade;
	//=========
	public WebElement getdigitoNoCampoCidade() {
		// TODO Auto-generated method stub
		return digitoNoCampoCidade;
	}

	@FindBy(css = "div[class=\"sc-cxabCf JGygT\"]>div:nth-child(3)>div>div:nth-child(3)>div>input")
	private WebElement digitoNoCampoEstado;
	//=========
	public WebElement getdigitoNoCampoEstado() {
		// TODO Auto-generated method stub
		return digitoNoCampoEstado;
	}

	@FindBy(css = "div[class=\"sc-cxabCf JGygT\"]>div:nth-child(3)>div>div:nth-child(4)>div>input")
	private WebElement digitoNoCampoCep;
	//=========
	public WebElement getdigitoNoCampoCep() {
		// TODO Auto-generated method stub
		return digitoNoCampoCep;
	}

	@FindBy(css = "div[class=\"sc-llJcti bmQFog\"]>div>button:nth-child(2)")
	private WebElement BotaoSalvarAlteracoesDaTelaMinhaConta;
	//=========
	public WebElement getBotaoSalvarAlteracoesDaTelaMinhaConta() {
		// TODO Auto-generated method stub
		return BotaoSalvarAlteracoesDaTelaMinhaConta;
	}

	public WebElement getSalvarAlteracoesMinhaconta() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getMensagemPreenchaTodosOsCamposObrigatorios() {
		// TODO Auto-generated method stub
		return null;
	}



	

	

	
}
