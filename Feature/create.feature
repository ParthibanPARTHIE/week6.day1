Feature: Lead creation functonality
Background: 
Given Open the chrome browser
And Load the application URL 'http://leaftaps.com/opentaps/'
And Enter the username as "DemoSalesManager"
And Enter the password as "crmsfa"
And Click on Login button
And Click CRM link
And Click on Leads link
	
Scenario Outline: Create lead scenario
Given Click on Create Leads button
And Enter CompanyName as <companyname>
And Enter FirstName as <firstname>
And Enter LastName as <lastname>
And Click on Create Lead button
	
Examples:
|companyname|firstname|lastname|
|'TestLeaf'|'parthi'|'s'|