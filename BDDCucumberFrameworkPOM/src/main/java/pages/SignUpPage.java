package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.BaseTest;

public class SignUpPage extends BaseTest {

	@FindBy(xpath = "//*[@id='clearance']/h2")
	WebElement SignUp_text;

	@FindBy(id = "user_email")
	WebElement SignUp_email_txtbx;

	@FindBy(id = "user_password")
	WebElement SignUp_password_txtbx;

	@FindBy(xpath = "//*[@id='new_user']/div[3]/input")
	WebElement SignUp_btn;

	@FindBy(xpath = "//*[@id='new_user']/div[4]/a")
	WebElement SignIn_link;

	@FindBy(xpath = "//*[@id='navbar']/div[1]/a[1]")
	WebElement Home;

	@FindBy(xpath = "//*[@id='sign-in']")
	WebElement SignIn;

	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public SignInPage gotoSignIn() {
		SignIn.click();
		return new SignInPage();
	}

	public HomePage gotoHome() {
		Home.click();
		return new HomePage();
	}
	
	public WelcomePage gotoWelcome() {
		return new WelcomePage();
	}

	public void EnterCredentials() {
		SignUp_email_txtbx.sendKeys(prop.getProperty("email"));
		SignUp_password_txtbx.sendKeys(prop.getProperty("password"));
		
	}
	public void DoSignUp() {
		//SignUp_btn.click();
		SignUp_password_txtbx.sendKeys(Keys.ENTER);
		
	}
	
	public String getSignUpText(){
		return SignUp_text.getText();
		
	}
}
