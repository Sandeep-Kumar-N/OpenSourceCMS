package com.qa.stepDefinitions;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.WriteNewStoryPage;
import com.qa.utils.TestBase;
import com.qa.utils.TestUtils;

import cucumber.api.java.en.Then;

public class NewStoryStepDefinition  extends TestBase{

	WriteNewStoryPage newStoryPage;
	HomePage homepage;
	
	@Then("^Verify AddNewPost Page$")
	public void verify_AddNewPost_Page() {
		newStoryPage = new WriteNewStoryPage();
		String title = newStoryPage.NewStory_Page_Title();
		System.out.println("NewStory Page Title = "+ title);
		boolean contains = title.contains(TestUtils.NEWSTORY_PAGE_TITLE_PART);
		Assert.assertTrue(contains);

	}

	@Then("^Enter Title and Paragraph$")
	public void enter_Title_and_Paragraph() {
		newStoryPage.enter_title();
		newStoryPage.enter_Paragraph();
	}

	@Then("^Click on publish$")
	public void click_on_publish() {
			newStoryPage.Publish();
	}
	
	@Then("^Go Back to HomePage$")
	public HomePage go_Back_to_HomePage(){
		
		return newStoryPage.HomeButtonClick();
	}
}
