package pageObjectReversa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {

	public LoginPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}

	@FindBy(id = "username")
	private WebElement DigitoNoCampoEndereçoDeEMailTelaLogi;
		//=========
	public WebElement getDigitoNoCampoEndereçoDeEMailTelaLogin() {
		
		return DigitoNoCampoEndereçoDeEMailTelaLogi;
	}
	
	@FindBy(id = "password")
	private WebElement DigitoNoCampoSenhaTelaLogin;
		//=========
	public WebElement getDigitoNoCampoSenhaTelaLogin() {
		// TODO Auto-generated method stub
		return DigitoNoCampoSenhaTelaLogin;
	}
	
	@FindBy(xpath = "//*[@id=\"kc-login\"]")
	private WebElement clicoNoBotaoEntrarTelaLogin;
		//=========
	public WebElement getclicoNoBotaoEntrarTelaLogin() {
		// TODO Auto-generated method stub
		return clicoNoBotaoEntrarTelaLogin;
	}
	
	@FindBy(xpath =  "//*[@id=\"root\"]/div[3]/div[1]/h1")
	private WebElement eFeitoLoginComSucesso;
		//=========
	public WebElement geteFeitoLoginComSucesso() {
		// TODO Auto-generated method stub
		return eFeitoLoginComSucesso;
	}
	

	@FindBy(id = "username")
	private WebElement NaoDigitoNoCampoEnderecoDeEMailTelaLogin;
		//=========
	public WebElement getNaoDigitoNoCampoEnderecoDeEMailTelaLogin() {
		
		return NaoDigitoNoCampoEnderecoDeEMailTelaLogin;
	}
	
	@FindBy(id = "input-error")
	private WebElement OSistemaRetornaNomeDeUsuarioOuSenhaInvalida;
		//=========
	public WebElement getOSistemaRetornaNomeDeUsuarioOuSenhaInvalida() {
		
		return OSistemaRetornaNomeDeUsuarioOuSenhaInvalida;
	}
	
	@FindBy(id = "username")
	private WebElement digitoNoCampoEnderecoDeEMailIncorretoTelaLogin;
		//=========
	public WebElement getdigitoNoCampoEnderecoDeEMailIncorretoTelaLogin() {
	
		return digitoNoCampoEnderecoDeEMailIncorretoTelaLogin;
	}
	
	@FindBy(id = "password")
	private WebElement naoDigitoNoCampoSenhaTelaLogin;
		//=========
	public WebElement getnaoDigitoNoCampoSenhaTelaLogin() {
		// TODO Auto-generated method stub
		return naoDigitoNoCampoSenhaTelaLogin;
	}
	
	@FindBy(id = "password")
	private WebElement digitoNoCampoSenhaIncorretoTelaLogin;
		//=========
	public WebElement getdigitoNoCampoSenhaIncorretoTelaLogin() {
		// TODO Auto-generated method stub
		return digitoNoCampoSenhaIncorretoTelaLogin;
	}
	

	//////////////////////// Esqueceu sua Senha //////////////////////////////////////
	
	
	@FindBy(xpath =  "//*[@id=\"kc-form-login\"]/div[3]/div[2]/span/a")
	private WebElement clicoNoLinkEsqueceuSuaSenhaDaTelaLogin;
		//=========
	public WebElement getclicoNoLinkEsqueceuSuaSenhaDaTelaLogin() {
		// TODO Auto-generated method stub
		return clicoNoLinkEsqueceuSuaSenhaDaTelaLogin;
	}
	
	@FindBy(id = "kc-page-title")
	private WebElement exibeTelaEsqueceuSuaSenha;
		//=========
	public WebElement getexibeTelaEsqueceuSuaSenha() {
		// TODO Auto-generated method stub
		return exibeTelaEsqueceuSuaSenha;
	}
	
	@FindBy(id = "username")
	private WebElement digitoNoCampoEnderecoDeEMailTelaEsqueceuSuaSenha;
		//=========
	public WebElement getdigitoNoCampoEnderecoDeEMailTelaEsqueceuSuaSenha() {
		// TODO Auto-generated method stub
		return digitoNoCampoEnderecoDeEMailTelaEsqueceuSuaSenha;
	}
	
	@FindBy(xpath = "//*[@id=\"kc-form-buttons\"]/input")
	private WebElement clicoNoBotaoOKTelaEsqueceuSuaSenha;
		//=========
	public WebElement getclicoNoBotaoOKTelaEsqueceuSuaSenha() {
		// TODO Auto-generated method stub
		return clicoNoBotaoOKTelaEsqueceuSuaSenha;
	}
	
	@FindBy(xpath = "//*[@id=\"kc-content-wrapper\"]/div[1]/span")
	private WebElement NotificacaoPorEmailParaFazerResetDeSenha;
		//=========
	public WebElement getNotificacaoPorEmailParaFazerResetDeSenha() {
		// TODO Auto-generated method stub
		return NotificacaoPorEmailParaFazerResetDeSenha;
	}
	
	@FindBy(id = "username")
	private WebElement NaoDigitoNoCampoEnderecoDeEMail;
		//=========
	public WebElement getNaoDigitoNoCampoEnderecoDeEMail() {
		
		return NaoDigitoNoCampoEnderecoDeEMail;
	}
	
	@FindBy(id = "input-error-username")
	private WebElement sistemaRetornaMensagemPorFavorInformeONomeDeUsuario;
		//=========
	public WebElement getsistemaRetornaMensagemPorFavorInformeONomeDeUsuario() {
		// TODO Auto-generated method stub
		return sistemaRetornaMensagemPorFavorInformeONomeDeUsuario;
	}
	

	

	
	
	
	
	
}
