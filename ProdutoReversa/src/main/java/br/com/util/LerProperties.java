package br.com.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LerProperties {

	
	
	
	public static Properties getPropConfig() throws IOException {
		Properties props = new Properties();
		FileInputStream file = new FileInputStream(
				"src/test/resources/config.properties");
		props.load(file);
		return props;

	}
	
	
	public String RecuperaPropConfig(String x) {
		String aux = null;
		
		try {
			Properties prop = getPropConfig();
			aux = prop.getProperty(x);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aux;
	}
	
	
	
	
	
}
