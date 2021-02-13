# 02. Data driven test in Cucumber with feature file
Feature: Calculate EMI for Home loan, Car loan and Personal loan

Scenario: Calculate EMI for Personal loan
	Given User is already on the Emi calculator page
	When User clicks on the Personal Loan tab
	And Enters the Personal Loan Amount as "1000000"
	And Enters the Interest Rate as "16"
	And Enters the Loan Tenure as "10"
	And clicks Enter
	Then Loan EMI is displayed as "16,751"
	And Total Interest Payable is displayed as "10,10,157"
	And Total Payment is displayed as "20,10,157"