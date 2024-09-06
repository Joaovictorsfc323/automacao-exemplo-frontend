package pageObjectReversa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CriarUsuarioPageObject {

	public CriarUsuarioPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "kc-page-title")
	private WebElement ExibeTelaLogin;
		//=========
	public WebElement getExibeTelaLogin() {
		
		return ExibeTelaLogin;
	}

	@FindBy(xpath = "//*[@id=\"kc-registration\"]/span/a")
	private WebElement CadastreSe;
		//=========
	public WebElement getCadastreSe() {
		
		return CadastreSe;
	}
	
	@FindBy(id = "kc-page-title")
	private WebElement exibeTelaDeRegistreSe;
	public WebElement getexibeTelaDeRegistreSe() {
		
		return exibeTelaDeRegistreSe;
	}
	
	@FindBy(id = "firstName")
	private WebElement DigitoNoCampoPrimeiroNome;
		//=========
	public WebElement getDigitoNoCampoPrimeiroNome() {
		
		return DigitoNoCampoPrimeiroNome;
	}
	
	@FindBy(id = "lastName")
	private WebElement digitoNoCampoSobrenome;
		//=========
	public WebElement getdigitoNoCampoSobrenome() {
		
		return digitoNoCampoSobrenome;
	}
	
	
	@FindBy(id = "email")
	private WebElement digitoNoCampoEnderecoDeEMail;
		//=========
	public WebElement getdigitoNoCampoEnderecoDeEMail() {
		
		return digitoNoCampoEnderecoDeEMail;
	}
	
	
	@FindBy(id = "password")
	private WebElement digitoNoCampoSenha;
		//=========
	public WebElement getdigitoNoCampoSenha() {
		
		return digitoNoCampoSenha;
	}
	
	@FindBy(id = "password-confirm")
	private WebElement digitoNoCampoConfirmeASenha;
		//=========
	public WebElement getdigitoNoCampoConfirmeASenha() {
		
		return digitoNoCampoConfirmeASenha;
	}
	
	@FindBy(id = "kc-form-buttons")
	private WebElement clicoNoBotaoCadastreSe;
		//=========
	public WebElement getclicoNoBotaoCadastreSe() {
		
		return clicoNoBotaoCadastreSe;
	}
	
	@FindBy(id = "kc-page-title")
	private WebElement ExibeTelaVerificacaoEmail;
		//=========
	public WebElement getExibeTelaVerificacaoEmail() {
		
		return ExibeTelaVerificacaoEmail;
	}
	
	@FindBy(id = "firstName")
	private WebElement NaoDigitoNoCampoPrimeiroNome;
		//=========
	public WebElement getNaoDigitoNoCampoPrimeiroNome() {
		
		return NaoDigitoNoCampoPrimeiroNome;
	}
	
	@FindBy(id = "input-error-firstname")
	private WebElement InformePrimeiroNome;
		//=========
	public WebElement getInformePrimeiroNome() {
		
		return InformePrimeiroNome;
	}
	
	@FindBy(id = "lastName")
	private WebElement NaoDigitoNoCampoSobrenome;
		//=========
	public WebElement getNaoDigitoNoCampoSobrenome() {
		
		return NaoDigitoNoCampoSobrenome;
	}
	
	@FindBy(id = "input-error-lastname")
	private WebElement InformeSobrenome;
		//=========
	public WebElement getInformeSobrenome() {
		// TODO Auto-generated method stub
		return InformeSobrenome;
	}
	
	@FindBy(id = "email")
	private WebElement NaoDigitoNoCampoEnderecoDeEMail;
		//=========
	public WebElement getNaoDigitoNoCampoEnderecoDeEMail() {
		
		return NaoDigitoNoCampoEnderecoDeEMail;
	}
	
	@FindBy(id = "input-error-email")
	private WebElement InformeEnderecoDeEMail;
		//=========
	public WebElement getInformeEnderecoDeEMail() {
		
		return InformeEnderecoDeEMail;
	}
	
	@FindBy(id = "password")
	private WebElement NaoDigitoNoCampoSenha;
		//=========
	public WebElement getNaoDigitoNoCampoSenha() {
		
		return NaoDigitoNoCampoSenha;
	}
	
	@FindBy(id = "input-error-password")
	private WebElement InformeSenha;
		//=========
	public WebElement getInformeSenha() {
		// TODO Auto-generated method stub
		return InformeSenha;
	}
	
	@FindBy(id = "password-confirm")
	private WebElement NaoDigitoNoCampoConfirmeASenha;
		//=========
	public WebElement getNaoDigitoNoCampoConfirmeASenha() {
		// TODO Auto-generated method stub
		return NaoDigitoNoCampoConfirmeASenha;
	}
	
	@FindBy(id = "input-error-password-confirm")
	private WebElement InformeConfirmeSenha;
		//=========
	public WebElement getInformeConfirmeSenha() {
		// TODO Auto-generated method stub
		return InformeConfirmeSenha;
	}
	
	@FindBy(id = "input-error-email")
	private WebElement InformeEMailJaExiste;
		//=========
	public WebElement getInformeEMailJaExiste() {
		// TODO Auto-generated method stub
		return InformeEMailJaExiste;
	}
	
	
	


	
	
	
	



}

