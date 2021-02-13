package stepDefinitions;

import base.BaseTest;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.WelcomePage;

public class WelcomePageSteps extends BaseTest{
	
	WelcomePage welcomePage;
	
	@Then("^User navigates to the Welcome page$")
	public void user_navigates_to_the_Welcome_page() {
	    
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		welcomePage = new WelcomePage();
		String actualTitle = welcomePage.getTitle();
		String expectedTitle = "Address Book";
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("WelcomePage title verified");	
	}
	
	@When("^User clicks on the Sign out link$")
	public void user_clicks_on_the_Sign_out_link() {
		welcomePage.gotoSignOut();
		
	}	

}
