Feature: Application Login 

Scenario: Home page default login 
Given User is on Netbanking landing page
When User login into application with "jo" and Password "1234"
Then HomePage is populated
And Cards are "True"


Scenario: Home page default login 
Given User is on Netbanking landing page
When User login into application with "John" and Password "4211"
Then HomePage is populated
And Cards are "False"