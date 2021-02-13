# 03. Data driven test in Cucumber with Examples Annotation
Feature: Calculate EMI for Home loan, Car loan and Personal loan

	Scenario Outline: Calculate EMI for Car loan
	Given User is already on the Emi calculator page
	When User clicks on the Car Loan tab
	And Enters the Car Loan Amount as "<Car_Loan_Amount>"
	And Enters the Car Interest Rate as "<Car_Interest_Rate>"
	And Enters the Car Loan Tenure as "<Car_Loan_Tenure>"
	And clicks Enter
	Then Car Loan EMI is displayed
	And Car Interest Payable is displayed
	And Car Payment is displayed

Examples:
		| Car_Loan_Amount | Car_Interest_Rate | Car_Loan_Tenure |
		| 1000000 | 16.5 | 08 |
		| 2000000 | 17.5 | 10 |
		| 4000000 | 18.5 | 12 |