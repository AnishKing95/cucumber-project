package org.pom;

import org.openqa.selenium.WebDriver;

public class Pom_Manager {
	
	public WebDriver driver;

	public Page_Object_Login getlp() {
		
		Page_Object_Login lp = new Page_Object_Login(driver);
        return lp;
	}
	
	
}
