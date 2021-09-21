Feature: Login into Application 

Scenario Outline: Positive login testcase 
	Given Initialize the browser with chrome 
	And Navigate to the "http://www.qaclickacademy.com/" site 
	And Click on Login link in home page to land on secure sign in page 
	When User enters <username> and <password> and logs in 
	Then Verify user is successfully Logged In 
	And close browsers
	
	Examples: 
		|username|password|
		|ganeshs99@gmail.com|876756768|
		|errr99@gmail.com|878656756768|
	    |dasfsfsshs99@gmail.com|876756787668|