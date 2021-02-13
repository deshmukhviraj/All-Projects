package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.BaseTest;

public class WelcomePage extends BaseTest {
	
	@FindBy(xpath="/html/body/div/div/h1")
	WebElement WelcomeText;
	
	@FindBy(xpath="//*[@id='navbar']/div[1]/a[1]")
	WebElement Home;
	
	@FindBy(xpath="//*[@id='navbar']/div[1]/a[2]")
	WebElement Addresses;
	
	@FindBy(xpath="//*[@id='sign-in']")
	WebElement SignIn;
	
	@FindBy(xpath="//*[@id='navbar']/div[1]/a[3]")
	WebElement SignOut;
	
	@FindBy(xpath="//*[@id='navbar']/div[2]/span")
	WebElement LogInEmail;
	
	public WelcomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle(){
		return driver.getTitle();
	}
	
	public SignInPage gotoSignIn(){
		SignIn.click();
		return new SignInPage();
	}
	
	public HomePage gotoHome(){
		Home.click();
		return new HomePage();
	}
	
	public SignInPage gotoSignOut(){
		SignOut.click();
		return new SignInPage();
	}

}
