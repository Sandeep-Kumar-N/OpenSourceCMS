package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.TestBase;
import com.qa.utils.TestUtils;

public class WriteNewStoryPage extends TestBase{
	TestUtils utils;
	
	@FindBy(xpath="//input[@id=\"title\"]")
	WebElement titlePrompt;
	
	@FindBy(xpath="//body[@id='tinymce']/p")
	WebElement paraPrompt;	
	
	
	@FindBy(id="content_ifr")
	WebElement iframe;
	
	@FindBy(xpath="//input[@id='publish']")
	WebElement publishBtn;
	
	@FindBy(xpath="//li[@id=\"menu-dashboard\"]/a/div[3]")
	WebElement dashboard;
	
	@FindBy(xpath="//li[@id='menu-dashboard']/ul/li[2]/a")
	WebElement homeBtn;
	
	public WriteNewStoryPage() {
		PageFactory.initElements(driver, this);
		utils = new TestUtils();
	}
	
	public String NewStory_Page_Title() {
		return driver.getTitle();
	}
	
	public void enter_title() {
		titlePrompt.sendKeys(TestUtils.TITLE_NAME);
	}
	
	public void enter_Paragraph() {
		utils.swith_Frame(iframe);
//		paraPrompt.sendKeys(TestUtils.PARAGRAPH_TEXT);
		utils.Set_InterHTML_With_JavaScript(paraPrompt,utils.PARAGRAPH_TEXT);
		utils.swith_Default_Frame();
	}
	
	public HomePage enter_title_and_description_and_publish() {
		titlePrompt.sendKeys(TestUtils.TITLE_NAME);
		utils.swith_Frame(iframe);
		utils.Set_InterHTML_With_JavaScript(paraPrompt,TestUtils.PARAGRAPH_TEXT);
//		paraPrompt.sendKeys(TestUtils.PARAGRAPH_TEXT);
		utils.swith_Default_Frame();
		publishBtn.click();
		return new HomePage();
	}
	
	public void Publish() {
//		publishBtn.click();
		utils.Click_With_JavaScript(publishBtn);
	}
	
	public HomePage HomeButtonClick() {
		utils.MouseOver(dashboard);
		homeBtn.click();
		return new HomePage();
	}


}
