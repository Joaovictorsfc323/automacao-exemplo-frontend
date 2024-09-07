package br.com.driver;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.util.LerProperties;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverMananger {
	private static WebDriver driver;
	
	public WebDriver getDriver() throws IOException{
		if (driver == null) {
		 driver = createDriver();	
			
		}
		return driver;
	}
	
private WebDriver createDriver() throws IOException{
	
	LerProperties executarproperties = new LerProperties();
	
	String url = executarproperties.RecuperaPropConfig("URL");
	
	String driverurl = executarproperties.RecuperaPropConfig("DRIVER");

	System.setProperty("webdriver.chrome.driver", driverurl);
	BrowserSetup setup = new BrowserSetup();
	driver = new ChromeDriver(setup.getOptions());


	driver.get(url);
	
	return driver;	
	
}


public static void closeDriver() {
	driver.close();
	driver.quit();
	driver = null;
	
}

}
