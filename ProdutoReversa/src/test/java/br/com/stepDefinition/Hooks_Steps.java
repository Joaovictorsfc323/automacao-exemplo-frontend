package br.com.stepDefinition;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import br.com.driver.WebDriverMananger;
public class Hooks_Steps {

	@Before
	public void beforeScenario(Scenario scenario) throws Exception{
		
	}
	
	  @After
	public void afterScenario(Scenario scenario) throws Exception{

		//WebDriverMananger.closeDriver();
	}
	
	
	
}
