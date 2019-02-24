package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//li[@id='menu-posts']")
	WebElement subjectElem;

	@FindBy(xpath="//li[@id='menu-posts']/ul/li[3]/a")
	WebElement Write_new_story;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String Home_Page_Title() {
		return driver.getTitle();
	}
	
	public WriteNewStoryPage Click_New_Story() {		
		MouseOver(subjectElem);
		Write_new_story.click();
		return new WriteNewStoryPage();
	}

}
