package stepDefinitions;

import base.BaseTest;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.SignInPage;
import pages.SignUpPage;

public class SignInPageSteps extends BaseTest{
	
	SignInPage signInPage;
	SignUpPage signUpPage;
	
	@Then("^the Sign in page is displayed$")
	public void the_Sign_in_page_is_displayed() {
		
		signInPage = new SignInPage();
		String actualSignInText =  signInPage.getSignInText();
		String expectedSignInText = "Sign in";
		Assert.assertEquals(expectedSignInText, actualSignInText);
		System.out.println("SignIn Page text verified");	    

		String actualTitle = signInPage.getTitle();
		String expectedTitle = "Address Book - Sign In";
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("SignIn Page title verified");	    
	}
	
	@When("^User enters the Email address and Password on SignIn page$")
	public void user_enters_the_Email_address_and_Password_on_SignIn_page() {
	    
		signInPage.EnterCredentials();		
		System.out.println("Credentials entered");
	}
	
	@When("^Clicks on the Sign in button$")
	public void clicks_on_the_Sign_in_button() {
		signInPage.ClickSignInBtn();
	}
	
	@When("^User clicks on SignUp link$")
	public void user_clicks_on_SignUp_link() {
	    
		signUpPage = signInPage.gotoSignUp();
				
	}


}
