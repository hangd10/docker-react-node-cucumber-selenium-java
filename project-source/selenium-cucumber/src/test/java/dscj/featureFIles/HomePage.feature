Feature: HomePage
	Should be able to open the home page and click on all navigation in header
	
Scenario: Open the home page and click on Features
	Given User navigates to http://node-alb-1956066652.us-west-2.elb.amazonaws.com/
	When User clicks on Features tab
	Then User should be taken to the Features page successfully

Scenario: Open the home page and click on Menu Items
	Given User navigates to http://node-alb-1956066652.us-west-2.elb.amazonaws.com/
	When User clicks on MenuItems tab
	Then User should be taken to the MenuItems page successfully	