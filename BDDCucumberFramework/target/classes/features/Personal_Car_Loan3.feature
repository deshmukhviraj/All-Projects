# 06.Data driven test in Cucumber with Multi data table
Feature: Calculate EMI for Home loan, Car loan and Personal loan

	Scenario: Calculate EMI for Personal and Car loan
	Given User is already on the Emi calculator page
	When User clicks on the Personal Loan tab
	And User enters Personal_Loan_Amount and Personal_Interest_Rate and Personal_Loan_Tenure 
	| Personal_Loan_Amount | Personal_Interest_Rate | Personal_Loan_Tenure |
	| 1000000 | 7.5 | 08 |
	| 2000000 | 8.5 | 09 |
	| 4000000 | 9.5 | 10 |
	
	And clicks Enter
	Then Loan EMI is displayed
	And Total Interest Payable is displayed
	And Total Payment is displayed
	
	When User clicks on the Car Loan tab
	And User enters Car_Loan_Amount and Car_Interest_Rate and Car_Loan_Tenure
	| Car_Loan_Amount | Car_Interest_Rate | Car_Loan_Tenure |
	| 1000000 | 16.5 | 08 |
	| 2000000 | 17.5 | 10 |
	| 4000000 | 18.5 | 12 |
	
	And clicks Enter
	Then Car Loan EMI is displayed
	And Car Interest Payable is displayed
	And Car Payment is displayed
