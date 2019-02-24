package com.qa.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestBase {
	public static Properties prop;
	public static WebDriver driver;

	public TestBase() {
		FileInputStream inStream = null;
		prop = new Properties();
		try {
			inStream = new FileInputStream("src/main/java/com/qa/config/config.properties");
		} catch (IOException e) {
			e.getMessage();
		}
		try {
			prop.load(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Initialization() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sande\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public void tearDown() {
		driver.close();
	}
	
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
