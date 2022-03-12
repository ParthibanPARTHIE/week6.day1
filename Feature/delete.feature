Feature: Lead Deleting functonality

Background: 
Given Open the chrome browser
And Load the application URL 'http://leaftaps.com/opentaps/'
Given Enter the username as "DemoSalesManager"
And Enter the password as "crmsfa"
And Click on Login button
And Click CRM link
And Click on Leads link
	
Scenario Outline: Delete lead scenario
Given Click on Find Leads button
And Click on the phone tab
And Enter the phone number as <phonenumber>
And Click on Find the Leads button 
And Save the Lead ID as leadId
And Click on the Lead ID from the result
And Click on the Delete Lead button
And Click on Find Leads 
And Enter the leadID in Lead ID tab
And Click on Find the Leads button
Then Validate the result

Examples:
|phonenumber|
|9|


