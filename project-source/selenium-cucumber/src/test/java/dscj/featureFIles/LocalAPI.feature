Feature: Local API Call to Nginx/Node
	Existing Nginx and Node for simple API call
	
Scenario: Invoke API call to get 200 status
	Given API call to dummy endpoint
	Then Status code of 200 should be returned