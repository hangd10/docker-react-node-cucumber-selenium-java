Feature: API Get Invokation
	Simple API call to https://jsonplaceholder.typicode.com/posts
	
Scenario: Invoke API call to get 200 status
	Given API call to https://jsonplaceholder.typicode.com/posts endpoint
	Then Status code of 200 should be returned