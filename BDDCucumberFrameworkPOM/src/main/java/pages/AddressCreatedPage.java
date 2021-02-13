package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class AddressCreatedPage extends BaseTest{

	@FindBy(xpath="/html/body/div/div[1]")
	WebElement AddressCreatedSuccess;

	@FindBy(xpath="/html/body/div/div[2]/a[2]")
	WebElement ListLink;
	
	public AddressCreatedPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle(){
		return driver.getTitle();
	}
}
