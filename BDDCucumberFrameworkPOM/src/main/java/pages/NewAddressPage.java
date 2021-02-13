package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class NewAddressPage extends BaseTest{
	
	@FindBy(xpath="/html/body/div/div/h1")
	WebElement NewAddressText;
	
	@FindBy(id="address_first_name")
	WebElement Firstname;
	
	@FindBy(id="address_last_name")
	WebElement Lastname;
	
	@FindBy(id="address_street_address")
	WebElement Address1;
	
	@FindBy(id="address_secondary_address")
	WebElement Address2;
	
	@FindBy(id="address_city")
	WebElement City;
	
	@FindBy(id="address_state")
	WebElement State;
	
	@FindBy(id="address_zip_code")
	WebElement ZipCode;
	
	@FindBy(id="address_country_us")
	WebElement Country_US;
	
	@FindBy(id="address_country_canada")
	WebElement Country_Canada;
	
	@FindBy(id="address_birthday")
	WebElement Birthday;
	
	@FindBy(id="address_age")
	WebElement Age;
	
	@FindBy(id="address_website")
	WebElement Website;
	
	@FindBy(id="address_picture")
	WebElement Picture;
	
	@FindBy(id="address_phone")
	WebElement Phone;
	
	@FindBy(id="address_interest_climb")
	WebElement Climbing;
	
	@FindBy(id="address_interest_dance")
	WebElement Dancing;
	
	@FindBy(id="address_interest_read")
	WebElement Reading;
	
	@FindBy(id="address_note")
	WebElement Note;	
	
	@FindBy(xpath="//*[@id=\"new_address\"]/div[17]/input")
	WebElement CreateAddressBtn;

	public NewAddressPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle(){
		return driver.getTitle();
	}
	
}
