package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.BaseTest;

public class AddressesPage extends BaseTest {
		
	@FindBy(xpath="/html/body/div/div/h1")
	WebElement WelcomeText;
	
	@FindBy(xpath="//*[@id='navbar']/div[1]/a[1]")
	WebElement Home;
	
	@FindBy(xpath="//*[@id='navbar']/div[1]/a[2]")
	WebElement Addresses;
	
	@FindBy(xpath="//*[@id='navbar']/div[1]/a[3]")
	WebElement SignOut;
	
	@FindBy(xpath="//*[@id='navbar']/div[2]/span")
	WebElement LogInEmail;
	
	@FindBy(xpath="/html/body/div/a")
	WebElement NewAddress_Link;
	
	public AddressesPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle(){
		return driver.getTitle();
	}
	
	public void clickShowLink(String firstname){
		String Fname1 = "//tr[text()='";
		String Fname2 = firstname;
		String Fname3 = "']/td[5]/a";
		String Fname4 = Fname1+Fname2+Fname3;
		WebElement Show_Link = driver.findElement(By.xpath(Fname4));
		Show_Link.click();
	}
	
	public void clickEditLink(String firstname){
		String Fname1 = "//tr[text()='";
		String Fname2 = firstname;
		String Fname3 = "']/td[6]/a";
		String Fname4 = Fname1+Fname2+Fname3;
		WebElement Show_Link = driver.findElement(By.xpath(Fname4));
		Show_Link.click();
	}
	
	public void clickDestroyLink(String firstname){
		String Fname1 = "//tr[text()='";
		String Fname2 = firstname;
		String Fname3 = "']/td[7]/a";
		String Fname4 = Fname1+Fname2+Fname3;
		WebElement Show_Link = driver.findElement(By.xpath(Fname4));
		Show_Link.click();
	}
	
	public HomePage gotoHome(){
		Home.click();
		return new HomePage();
	}
	
	public AddressesPage gotoAddresses(){
		Addresses.click();
		return new AddressesPage();
	}
	
	public SignInPage gotoSignOut(){
		SignOut.click();
		return new SignInPage();
	}


}
