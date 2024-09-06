package pageObjectReversa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class InicioPageObject {

	public InicioPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(css = "div[style=\"min-height: 95%;\"]>h1")
	private WebElement exibeTelaInicio;
		//=========
	public WebElement getexibeTelaInicio() {
		
		return exibeTelaInicio;
	}
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[1]/button")
	private WebElement clicoNoBotaoLogoutDaTelaInicio;
		//=========
	public WebElement getclicoNoBotaoLogoutDaTelaInicio() {
		
		return clicoNoBotaoLogoutDaTelaInicio;



	}
	@FindBy(css = "div[class=\"sc-eCYdqJ jFSEnj animate__animated animate__fadeIn\"]>button:nth-child(4)")
	private WebElement clicoMenuSairDaAba;
		//=========
	public WebElement getclicoMenuSairDaAba() {
		// TODO Auto-generated method stub
		return clicoMenuSairDaAba;
	}
	
	@FindBy(id = "kc-page-title")
	private WebElement exibeTelaLogin;
		//=========
	public WebElement getexibeTelaLogin() {
		// TODO Auto-generated method stub
		return exibeTelaLogin;
	}



}
