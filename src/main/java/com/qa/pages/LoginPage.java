package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.TestBase;

public class LoginPage extends TestBase{
	
	
//	PageFactory
	@FindBy(xpath="//input[@id='user_login']")
	WebElement username;

	@FindBy(xpath="//input[@id='user_pass']")
	WebElement password;

	@FindBy(xpath="//input[@id='wp-submit']")
	WebElement loginBtn;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void Open_Applicaiton() {
		driver.get(prop.getProperty("url"));
	}
	
	public HomePage Pass_Credentials_and_Login() {
		username.sendKeys(prop.getProperty("userName"));
		password.sendKeys(prop.getProperty("password"));
		loginBtn.click();
		return new HomePage();
	}
	
	
	public String Login_Page_Title() {
		return driver.getTitle();
	}
	

}
