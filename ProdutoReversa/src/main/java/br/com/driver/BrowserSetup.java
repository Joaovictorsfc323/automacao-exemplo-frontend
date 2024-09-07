package br.com.driver;

import org.openqa.selenium.chrome.ChromeOptions;

import br.com.util.LerProperties;

public class BrowserSetup {
	
	private ChromeOptions options;
	

	
	public BrowserSetup() {
		
		LerProperties executarproperties = new LerProperties();
		
		String exesegundoplano = executarproperties.RecuperaPropConfig("EXESEGUNDOPLANO");
		
		
		
	options = new ChromeOptions();	
	options.addArguments("--start-maximized");
	options.addArguments("--remote-allow-origins=*");
	options.addArguments("--ignore-certificate-errors");
	options.addArguments("--disable-popup-blocking");
	options.addArguments("--incognito");
	if(exesegundoplano.equalsIgnoreCase("true")) {
		options.addArguments("--headless");
	}
	
	
	}
	
public ChromeOptions getOptions() {
	return options;
	
	
}
	
}
