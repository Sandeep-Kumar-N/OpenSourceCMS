package com.qa.stepDefinitions;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.WriteNewStoryPage;
import com.qa.utils.TestBase;
import com.qa.utils.TestUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDefinition extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	WriteNewStoryPage newStoryPage;
	
	@Given("^User is in HomePage$")
	public void user_is_in_HomePage() {
		loginpage = new LoginPage();
		loginpage.Open_Applicaiton();
		loginpage.Pass_Credentials_and_Login();
	}

	@When("^User clicks on WriteNewStory$")
	public void user_clicks_on_WriteNewStory() {
		homepage = new HomePage();
		newStoryPage = homepage.Click_New_Story();
	}


	@Then("^Verify HomePage$")
	public void verify_HomePage() {
		String title = homepage.Home_Page_Title();
		System.out.println("Home Page Title = "+ title);
		boolean contains = title.contains(TestUtils.HOME_PAGE_TITLE_PART);
		Assert.assertTrue(contains);
	}
}
