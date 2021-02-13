# 01. Simple test in Cucumber with feature file
Feature: Calculate EMI for Home loan, Car loan and Personal loan

Scenario: Calculate EMI for Home loan
	Given User is already on the Emi calculator page
	When User clicks on the Home Loan tab
	And Enters the Home Loan Amount
	And Enters the Interest Rate
	And Enters the Loan Tenure
	And clicks Enter
	Then Loan EMI is displayed
	And Total Interest Payable is displayed
	And Total Payment is displayed
