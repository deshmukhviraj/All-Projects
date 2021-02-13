# 04. Data driven test in Cucumber with Complex Data Set
Feature: Calculate EMI for Home loan, Car loan and Personal loan

	Scenario Outline: Calculate EMI for Car loan
	Given User is already on the Emi calculator page
	When User clicks on the Home Loan tab
	And Enters the Home Loan Amount as "<Home_Loan_Amount>"
	And Enters the Home Interest Rate as "<Home_Interest_Rate>"
	And Enters the Home Loan Tenure as "<Home_Loan_Tenure>"
	And clicks Enter
	Then Loan EMI is displayed
	And Total Interest Payable is displayed
	And Total Payment is displayed
	When User clicks on the Car Loan tab
	And Enters the Car Loan Amount as "<Car_Loan_Amount>"
	And Enters the Car Interest Rate as "<Car_Interest_Rate>"
	And Enters the Car Loan Tenure as "<Car_Loan_Tenure>"
	And clicks Enter
	Then Car Loan EMI is displayed
	And Car Interest Payable is displayed
	And Car Payment is displayed

Examples:
		| Home_Loan_Amount | Home_Interest_Rate | Home_Loan_Tenure | Car_Loan_Amount | Car_Interest_Rate | Car_Loan_Tenure |
		| 1000000 | 7.5 | 08 | 1000000 | 16.5 | 08 |
		| 2000000 | 8.5 | 09 | 2000000 | 17.5 | 10 |
		| 4000000 | 9.5 | 10 | 4000000 | 18.5 | 12 |