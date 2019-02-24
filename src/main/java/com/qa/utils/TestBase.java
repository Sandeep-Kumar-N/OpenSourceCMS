package com.qa.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
	
	
}
