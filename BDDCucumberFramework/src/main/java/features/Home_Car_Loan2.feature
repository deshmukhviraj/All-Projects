# 05.Data driven test in Cucumber with Complex Data Set
Feature: Calculate EMI for Home loan, Car loan and Personal loan

	Scenario: Calculate EMI for Home and Car loan
	Given User is already on the Emi calculator page
	When User clicks on the Home Loan tab
	And enters Home Loan Amount and Home_Interest_Rate and Home_Loan_Tenure
	| 1000000 | 7.5 | 08 |
	
	And clicks Enter
	Then Loan EMI is displayed
	And Total Interest Payable is displayed
	And Total Payment is displayed
	
	When User clicks on the Car Loan tab
	And enters Car Loan Amount as "<Car_Loan_Amount>" and Car Interest Rate as "<Car_Interest_Rate>" and Car Loan Tenure as "<Car_Loan_Tenure>"
	| 1000000 | 16.5 | 08 |
	
	And clicks Enter
	Then Car Loan EMI is displayed
	And Car Interest Payable is displayed
	And Car Payment is displayed
