package com.qa.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestUtils extends TestBase{
	public static int PAGE_LOAD_TIMEOUT = 30;
	public static int IMPLICIT_WAIT_TIMEOUT = 30;
	public static String HOME_PAGE_TITLE_PART = "Dashboard";
	public static String LOGIN_PAGE_TITLE_PART = "Log In";
	public static String NEWSTORY_PAGE_TITLE_PART = "Add New Post";
	public static String TITLE_NAME = "Automation Created";
	public static String PARAGRAPH_TEXT = "Automated with Cucumber Selenium POM model";
	

	public static void MouseOver(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	
	public void swith_Frame(WebElement iframe) {
		driver.switchTo().frame(iframe);
		
	}
	
	public void swith_Default_Frame() {
		driver.switchTo().parentFrame();
		
	}
	
	public void Set_InterHTML_With_JavaScript(WebElement element, String text) {
		element.click();
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
//		javascriptExecutor.executeScript("arguments[0].innerhtml='"+text+"';", element);
		javascriptExecutor.executeScript("document.getElementsByTagName('p')[0].innerHTML='"+text+"';");
	}
	
	public void Click_With_JavaScript(WebElement element) {
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
		javascriptExecutor.executeScript("arguments[0].click();", element);
		
	}

}
