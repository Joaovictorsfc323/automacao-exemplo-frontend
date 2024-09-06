package br.com.driver;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class PageBase {
	protected static WebDriver driver;
	WebDriverMananger driverManager;
	
	public PageBase() throws  IOException{
		driverManager = new WebDriverMananger();
		driver = driverManager.getDriver();
	}

}
