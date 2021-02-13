package stepDefinitions;

import base.BaseTest;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.HomePage;
import pages.SignInPage;

public class HomePageSteps extends BaseTest{
	
	HomePage homePage;
	SignInPage signInPage;

	
	@Before
	public void openBrowser(){
		BaseTest.initBrowser();
	}
	
	@After 
	public void tearDown(){
		driver.close();
	}

	@Given("^User is already on the TestAddressBook page$")
	public void user_is_already_on_the_TestAddressBook_page() {
	    
		String URL = prop.getProperty("ApplicationURL");
		driver.get(URL);  
		homePage =  new HomePage();
		String actualTitle = homePage.getTitle();
		String expectedTitle = "Address Book";
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("Home Page title verified");
				
		String actualWelcomeText= homePage.getWelcomeText();
		String expectedWelcomeText = "Welcome to Address Book";
		Assert.assertEquals(expectedWelcomeText, actualWelcomeText);
		System.out.println("Home Page Welcome text verified");
	}

	@When("^User clicks on the Sign in link$")
	public void user_clicks_on_the_Sign_in_link() {
		
		signInPage = homePage.gotoSignIn();				
	}

	
	

	

}
