package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.BaseTest;

public class HomePage extends BaseTest {
	
	@FindBy(xpath="/html/body/div/div/h1")
	WebElement HomeWelcomeText;
	
	@FindBy(xpath="//*[@id='navbar']/div[1]/a[1]")
	WebElement Home;
	
	@FindBy(xpath="//*[@id='sign-in']")
	WebElement SignIn;
	
	public HomePage(){
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
	
	public String getWelcomeText(){
		String HomeWelcmTxt = HomeWelcomeText.getText();
		return HomeWelcmTxt;
	}
}
