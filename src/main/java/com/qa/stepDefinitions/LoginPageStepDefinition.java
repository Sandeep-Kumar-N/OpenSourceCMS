package com.qa.stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.utils.TestBase;
import com.qa.utils.TestUtils;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStepDefinition extends TestBase {
	LoginPage loginpage;
	HomePage homepage;

	@Before
	public void before(Scenario scenario) {
	    System.out.println("------------------------------");
	    System.out.println("Starting - " + scenario.getName());
	    System.out.println("------------------------------");
	    Initialization();
	    
	}
	
	@After
	public void after(Scenario scenario) {
		tearDown();
	    System.out.println("------------------------------");
	    System.out.println("Ending - " + scenario.getName());
	    System.out.println("------------------------------");
	}

	@Given("^User is in OpenSourceCMS Login Page$")
	public void user_is_in_OpenSourceCMS_Login_Page() {
		loginpage= new LoginPage();
		loginpage.Open_Applicaiton();
	}

	@When("^User is in LoginPage$")
	public void user_is_in_LoginPage() {
		String title = loginpage.Login_Page_Title();
		System.out.println("Login Page Title = "+ title);
		boolean contains = title.contains(TestUtils.LOGIN_PAGE_TITLE_PART);
		Assert.assertTrue(contains);
	}

	@Then("^User Enters UserName, Password and Clicks on Login Button$")
	public void user_Enters_UserName_Password_and_Clicks_on_Login_Button() throws IOException{
		homepage = loginpage.Pass_Credentials_and_Login();
	}

	@Then("^User Navigates to HomePage$")
	public void user_Navigates_to_HomePage() {
		String title = homepage.Home_Page_Title();
		System.out.println("Home Page Title = "+ title);
		boolean contains = title.contains(TestUtils.HOME_PAGE_TITLE_PART);
		Assert.assertTrue(contains);
	}
}
