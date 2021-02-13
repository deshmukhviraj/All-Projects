package stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeLoanSteps {

	WebDriver driver;

	@Given("^User is already on the Emi calculator page$")
	public void user_is_already_on_the_Emi_calculator_page() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://emicalculator.net/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^User clicks on the Home Loan tab$")
	public void user_clicks_on_the_Home_Loan_tab() {
		driver.findElement(By.xpath("//*[@id=\"home-loan\"]/a")).click();
	}

	@And("^Enters the Home Loan Amount$")
	public void enters_the_Home_Loan_Amount() {
		WebElement loanAmount = driver.findElement(By.id("loanamount"));
		loanAmount.click();
		loanAmount.sendKeys(Keys.CONTROL, "a");
		loanAmount.sendKeys(Keys.DELETE);
		loanAmount.sendKeys("100000");
	}

	@And("^Enters the Interest Rate$")
	public void enters_the_Interest_Rate() {
		WebElement loanInterest = driver.findElement(By.id("loaninterest"));
		loanInterest.click();
		loanInterest.sendKeys(Keys.CONTROL, "a");
		loanInterest.sendKeys(Keys.DELETE);
		loanInterest.sendKeys("9.5");
	}

	@And("^Enters the Loan Tenure$")
	public void enters_the_Loan_Tenure() {
		WebElement loanTerm = driver.findElement(By.id("loanterm"));
		loanTerm.click();
		loanTerm.sendKeys(Keys.CONTROL, "a");
		loanTerm.sendKeys(Keys.DELETE);
		loanTerm.sendKeys("10");
	}

	@And("^clicks Enter$")
	public void clicks_Enter() {
		WebElement loanTerm = driver.findElement(By.id("loanterm"));
		loanTerm.sendKeys(Keys.ENTER);
	}

	@Then("^Loan EMI is displayed$")
	public void loan_EMI_is_displayed() {
		WebElement emiAmount = driver.findElement(By.xpath("//*[@id=\"emiamount\"]/p/span"));
		String actualEmiAmount = emiAmount.getText();
		System.out.println("The Emi amount for Home loan is " + actualEmiAmount);

	}

	@And("^Total Interest Payable is displayed$")
	public void total_Interest_Payable_is_displayed() {
		WebElement emiTotalInterest = driver.findElement(By.xpath("//*[@id=\"emitotalinterest\"]/p/span"));
		String actualemiTotalInterest = emiTotalInterest.getText();
		System.out.println("The Interest amount for Home loan is " + actualemiTotalInterest);

	}

	@And("^Total Payment is displayed$")
	public void total_Payment_is_displayed() {
		WebElement emitotalamount = driver.findElement(By.xpath("//*[@id=\"emitotalamount\"]/p/span"));
		String actualemitotalamount = emitotalamount.getText();
		System.out.println("The total amount for Home loan is " + actualemitotalamount);
		// driver.close();
	}

	// ***********************************************************************************************************************//

	@When("^User clicks on the Personal Loan tab$")
	public void user_clicks_on_the_Personal_Loan_tab() {
		driver.findElement(By.xpath("//*[@id=\"personal-loan\"]/a")).click();
	}

	@And("^Enters the Personal Loan Amount as \"([^\"]*)\"$")
	public void enters_the_Personal_Loan_Amount_as(String PerLoanAmt) {
		WebElement loanAmount = driver.findElement(By.id("loanamount"));
		loanAmount.click();
		loanAmount.sendKeys(Keys.CONTROL, "a");
		loanAmount.sendKeys(Keys.DELETE);
		loanAmount.sendKeys(PerLoanAmt);
	}

	@And("^Enters the Interest Rate as \"([^\"]*)\"$")
	public void enters_the_Interest_Rate_as(String IntRate) {
		WebElement loanAmount = driver.findElement(By.id("loaninterest"));
		loanAmount.click();
		loanAmount.sendKeys(Keys.CONTROL, "a");
		loanAmount.sendKeys(Keys.DELETE);
		loanAmount.sendKeys(IntRate);
	}

	@And("^Enters the Loan Tenure as \"([^\"]*)\"$")
	public void enters_the_Loan_Tenure_as(String Tenure) {
		WebElement loanAmount = driver.findElement(By.id("loanterm"));
		loanAmount.click();
		loanAmount.sendKeys(Keys.CONTROL, "a");
		loanAmount.sendKeys(Keys.DELETE);
		loanAmount.sendKeys(Tenure);
	}

	@Then("^Loan EMI is displayed as \"([^\"]*)\"$")
	public void loan_EMI_is_displayed_as(String expEMI) {
		WebElement emiAmount = driver.findElement(By.xpath("//*[@id=\"emiamount\"]/p/span"));
		String actualEmiAmount = emiAmount.getText();
		Assert.assertEquals(expEMI, actualEmiAmount);
	}

	@And("^Total Interest Payable is displayed as \"([^\"]*)\"$")
	public void total_Interest_Payable_is_displayed_as(String expIntrest) {
		WebElement emiTotalInterest = driver.findElement(By.xpath("//*[@id=\"emitotalinterest\"]/p/span"));
		String actualemiTotalInterest = emiTotalInterest.getText();
		Assert.assertEquals(expIntrest, actualemiTotalInterest);
	}

	@And("^Total Payment is displayed as \"([^\"]*)\"$")
	public void total_Payment_is_displayed_as(String expPayment) {
		WebElement emitotalamount = driver.findElement(By.xpath("//*[@id=\"emitotalamount\"]/p/span"));
		String actualemitotalamount = emitotalamount.getText();
		Assert.assertEquals(expPayment, actualemitotalamount);
		driver.close();
	}

//***********************************************************************************************************************//

	@When("^User clicks on the Car Loan tab$")
	public void user_clicks_on_the_Car_Loan_tab() {
		driver.findElement(By.xpath("//*[@id=\"car-loan\"]/a")).click();
	}

	@And("^Enters the Car Loan Amount as \"([^\"]*)\"$")
	public void enters_the_Car_Loan_Amount_as(String Car_Loan_Amount) {
		WebElement loanAmount = driver.findElement(By.id("loanamount"));
		loanAmount.click();
		loanAmount.sendKeys(Keys.CONTROL, "a");
		loanAmount.sendKeys(Keys.DELETE);
		loanAmount.sendKeys(Car_Loan_Amount);
	}

	@And("^Enters the Car Interest Rate as \"([^\"]*)\"$")
	public void enters_the_Car_Interest_Rate_as(String Car_Interest_Rate) {
		WebElement loanInterest = driver.findElement(By.id("loaninterest"));
		loanInterest.click();
		loanInterest.sendKeys(Keys.CONTROL, "a");
		loanInterest.sendKeys(Keys.DELETE);
		loanInterest.sendKeys(Car_Interest_Rate);
	}

	@And("^Enters the Car Loan Tenure as \"([^\"]*)\"$")
	public void enters_the_Car_Loan_Tenure_as(String Car_Loan_Tenure) {
		WebElement loanTerm = driver.findElement(By.id("loanterm"));
		loanTerm.click();
		loanTerm.sendKeys(Keys.CONTROL, "a");
		loanTerm.sendKeys(Keys.DELETE);
		loanTerm.sendKeys(Car_Loan_Tenure);
	}

	@Then("^Car Loan EMI is displayed$")
	public void car_Loan_EMI_is_displayed() {
		WebElement emiAmount = driver.findElement(By.xpath("//*[@id=\"emiamount\"]/p/span"));
		String actualEmiAmount = emiAmount.getText();
		System.out.println("The Emi amount  for car loan is " + actualEmiAmount);
	}

	@And("^Car Interest Payable is displayed$")
	public void car_Interest_Payable_is_displayed() {
		WebElement emiTotalInterest = driver.findElement(By.xpath("//*[@id=\"emitotalinterest\"]/p/span"));
		String actualemiTotalInterest = emiTotalInterest.getText();
		System.out.println("The Interest amount  for car loan is " + actualemiTotalInterest);
	}

	@And("^Car Payment is displayed$")
	public void car_Payment_is_displayed() {
		WebElement emitotalamount = driver.findElement(By.xpath("//*[@id=\"emitotalamount\"]/p/span"));
		String actualemitotalamount = emitotalamount.getText();
		System.out.println("The Total amount  for car loan is " + actualemitotalamount);
		driver.close();
	}

	// ***********************************************************************************************************************//

	@And("^Enters the Home Loan Amount as \"([^\"]*)\"$")
	public void enters_the_Home_Loan_Amount_as(String Home_Loan_Amount) {
		WebElement loanAmount = driver.findElement(By.id("loanamount"));
		loanAmount.click();
		loanAmount.sendKeys(Keys.CONTROL, "a");
		loanAmount.sendKeys(Keys.DELETE);
		loanAmount.sendKeys(Home_Loan_Amount);
	}

	@And("^Enters the Home Interest Rate as \"([^\"]*)\"$")
	public void enters_the_Home_Interest_Rate_as(String Home_Interest_Rate) {
		WebElement loanInterest = driver.findElement(By.id("loaninterest"));
		loanInterest.click();
		loanInterest.sendKeys(Keys.CONTROL, "a");
		loanInterest.sendKeys(Keys.DELETE);
		loanInterest.sendKeys(Home_Interest_Rate);
	}

	@And("^Enters the Home Loan Tenure as \"([^\"]*)\"$")
	public void enters_the_Home_Loan_Tenure_as(String Home_Loan_Tenure) {
		WebElement loanTerm = driver.findElement(By.id("loanterm"));
		loanTerm.click();
		loanTerm.sendKeys(Keys.CONTROL, "a");
		loanTerm.sendKeys(Keys.DELETE);
		loanTerm.sendKeys(Home_Loan_Tenure);
	}

	// **************************************Data driven test with data
	// table************************************************//

	@And("^enters Home Loan Amount and Home_Interest_Rate and Home_Loan_Tenure$")
	public void enters_Home_Loan_Amount_and_Home_Interest_Rate_and_Home_Loan_Tenure(DataTable HomeLoan) {

		List<List<String>> testData = HomeLoan.raw();

		WebElement loanAmount = driver.findElement(By.id("loanamount"));
		loanAmount.click();
		loanAmount.sendKeys(Keys.CONTROL, "a");
		loanAmount.sendKeys(Keys.DELETE);
		loanAmount.sendKeys(testData.get(0).get(0));

		WebElement loanInterest = driver.findElement(By.id("loaninterest"));
		loanInterest.click();
		loanInterest.sendKeys(Keys.CONTROL, "a");
		loanInterest.sendKeys(Keys.DELETE);
		loanInterest.sendKeys(testData.get(0).get(1));

		WebElement loanTerm = driver.findElement(By.id("loanterm"));
		loanTerm.click();
		loanTerm.sendKeys(Keys.CONTROL, "a");
		loanTerm.sendKeys(Keys.DELETE);
		loanTerm.sendKeys(testData.get(0).get(2));

	}

	@When("^enters Car Loan Amount as \"([^\"]*)\" and Car Interest Rate as \"([^\"]*)\" and Car Loan Tenure as \"([^\"]*)\"$")
	public void enters_Car_Loan_Amount_as_and_Car_Interest_Rate_as_and_Car_Loan_Tenure_as(String Car_Loan_Amount,
			String Car_Interest_Rate, String Car_Loan_Tenure, DataTable CarLoan) {

		List<List<String>> testData = CarLoan.raw();

		WebElement loanAmount = driver.findElement(By.id("loanamount"));
		loanAmount.click();
		loanAmount.sendKeys(Keys.CONTROL, "a");
		loanAmount.sendKeys(Keys.DELETE);
		loanAmount.sendKeys(testData.get(0).get(0));

		WebElement loanInterest = driver.findElement(By.id("loaninterest"));
		loanInterest.click();
		loanInterest.sendKeys(Keys.CONTROL, "a");
		loanInterest.sendKeys(Keys.DELETE);
		loanInterest.sendKeys(testData.get(0).get(1));

		WebElement loanTerm = driver.findElement(By.id("loanterm"));
		loanTerm.click();
		loanTerm.sendKeys(Keys.CONTROL, "a");
		loanTerm.sendKeys(Keys.DELETE);
		loanTerm.sendKeys(testData.get(0).get(2));
	}

	// **************************************Data driven test with Multi data table************************************************//

	@When("^User enters Personal_Loan_Amount and Personal_Interest_Rate and Personal_Loan_Tenure$")
	public void user_enters_Personal_Loan_Amount_and_Personal_Interest_Rate_and_Personal_Loan_Tenure(
			DataTable PersonalLoan) {

		for (Map<String, String> dataMap : PersonalLoan.asMaps(String.class, String.class)) {

			WebElement loanAmount = driver.findElement(By.id("loanamount"));
			loanAmount.click();
			loanAmount.sendKeys(Keys.CONTROL, "a");
			loanAmount.sendKeys(Keys.DELETE);
			loanAmount.sendKeys(dataMap.get("Personal_Loan_Amount"));

			WebElement loaninterest = driver.findElement(By.id("loaninterest"));
			loaninterest.click();
			loaninterest.sendKeys(Keys.CONTROL, "a");
			loaninterest.sendKeys(Keys.DELETE);
			loaninterest.sendKeys(dataMap.get("Personal_Interest_Rate"));

			WebElement loanterm = driver.findElement(By.id("loanterm"));
			loanterm.click();
			loanterm.sendKeys(Keys.CONTROL, "a");
			loanterm.sendKeys(Keys.DELETE);
			loanterm.sendKeys(dataMap.get("Personal_Loan_Tenure"));

		}
	}

	@When("^User enters Car_Loan_Amount and Car_Interest_Rate and Car_Loan_Tenure$")
	public void user_enters_Car_Loan_Amount_and_Car_Interest_Rate_and_Car_Loan_Tenure(DataTable CarLoan) {

		for (Map<String, String> dataMap : CarLoan.asMaps(String.class, String.class)) {

			WebElement loanAmount = driver.findElement(By.id("loanamount"));
			loanAmount.click();
			loanAmount.sendKeys(Keys.CONTROL, "a");
			loanAmount.sendKeys(Keys.DELETE);
			loanAmount.sendKeys(dataMap.get("Car_Loan_Amount"));

			WebElement loaninterest = driver.findElement(By.id("loaninterest"));
			loaninterest.click();
			loaninterest.sendKeys(Keys.CONTROL, "a");
			loaninterest.sendKeys(Keys.DELETE);
			loaninterest.sendKeys(dataMap.get("Car_Interest_Rate"));

			WebElement loanterm = driver.findElement(By.id("loanterm"));
			loanterm.click();
			loanterm.sendKeys(Keys.CONTROL, "a");
			loanterm.sendKeys(Keys.DELETE);
			loanterm.sendKeys(dataMap.get("Car_Loan_Tenure"));

		}
	}
}
