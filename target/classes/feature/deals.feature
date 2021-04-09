#Uses data table
Feature: Deal data creation               
Scenario: Free CRM create new deal scenario

Given user is already on login page
When title of login page is Free CRM
Then user enters username and password
|naveenk|test123|

Then user clicks on login button
Then user is on home page
Then user moves to new deal page
Then user enters deal details 
|test deal|1000|50|10|

Then close the browser
