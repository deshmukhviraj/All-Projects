package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.BaseTest;

public class SignInPage extends BaseTest {
	
	@FindBy(xpath="//*[@id='clearance']/h2")
	WebElement SignIn_text;
	
	@FindBy(id="session_email")
	WebElement email_txtbx;
	
	@FindBy(id="session_password")
	WebElement password_txtbx	;
	
	@FindBy(xpath="//*[@id='clearance']/div/div/form/div[3]/input")
	WebElement SignIn_btn;
	
	@FindBy(xpath="//*[@id='clearance']/div/div/form/div[4]/a")
	WebElement SignUp_link;
	
	@FindBy(xpath="//*[@id='navbar']/div[1]/a[1]")
	WebElement Home;
	
	@FindBy(xpath="//*[@id='sign-in']")
	WebElement SignIn;
	
	public SignInPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle(){
		return driver.getTitle();
	}
	
	public String getSignInText(){
		return SignIn_text.getText();
		
	}
	
	public void ClickSignInBtn(){
		SignIn_btn.click();
		
	}
	
	public void EnterCredentials() {
		email_txtbx.sendKeys(prop.getProperty("email"));
		password_txtbx.sendKeys(prop.getProperty("password"));
		
	}
	
	public SignInPage gotoSignIn(){
		SignIn.click();
		return new SignInPage();
	}
	
	public HomePage gotoHome(){
		Home.click();
		return new HomePage();
	}
	
	public SignUpPage gotoSignUp(){
		SignUp_link.click();
		return new SignUpPage();
	}

}
