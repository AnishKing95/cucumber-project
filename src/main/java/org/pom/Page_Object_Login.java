package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Object_Login {

	
	public WebDriver driver;
	
	public  Page_Object_Login(WebDriver driver2) {
		driver2=driver;
		PageFactory.initElements(driver2, this);
	}
	
	@FindBy(id="username")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement passWord;
	
	@FindBy(id="login")
	WebElement login;
	
	
	public void setUsername(String name) {
		
		userName.sendKeys(name);

	}
	
public void setPassword(String pass) {
		
		userName.sendKeys(pass);

	}

public void clickLogin() {

	login.click();
}
	
	
}
