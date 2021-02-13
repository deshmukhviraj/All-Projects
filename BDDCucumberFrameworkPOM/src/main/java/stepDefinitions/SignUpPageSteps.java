package stepDefinitions;

import base.BaseTest;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.SignUpPage;
import pages.WelcomePage;

public class SignUpPageSteps extends BaseTest{
	
	SignUpPage signUpPage;
	WelcomePage welcomePage;
	
	@Then("^the Sign Up page is displayed$")
	public void the_Sign_Up_page_is_displayed() {
	   
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		signUpPage = new SignUpPage();
		String actualSignUpText =  signUpPage.getSignUpText();
		String expectedSignUpText = "Sign up";
		Assert.assertEquals(expectedSignUpText, actualSignUpText);
		System.out.println("SignUp Page text verified");
		
		String actualTitle = signUpPage.getTitle();
		String expectedTitle = "Address Book - Sign Up";
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("SignUp Page title verified");		
	}

	@When("^User enters the Email address and Password on SignUp page$")
	public void User_enters_the_Email_address_and_Password_on_SignUp_page() {
	    
		signUpPage.EnterCredentials();		
		System.out.println("Credentials entered");
	}

	@When("^Clicks on the Sign up button$")
	public void clicks_on_the_Sign_up_button() {
	    
		signUpPage.DoSignUp();
		System.out.println("Sign In button clicked");
		welcomePage = signUpPage.gotoWelcome();
	}

}
