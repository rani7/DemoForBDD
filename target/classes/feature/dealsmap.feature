# Using map - removes disadvantage of multiple inputs using data table
Feature: Deal data creation using map               
Scenario: Free CRM create new deal scenario using map

Given user is already on login page
When title of login page is Free CRM
Then user enters username and password
|username|password|
|naveenk|test123|

Then user clicks on login button
Then user is on home page
Then user moves to new deal page
Then user enters deal details 
|title     |amount|probability|commission|
|test deal1|1000  |50         |10        |
|test deal2|2000  |60         |20        |
|test deal3|3000  |70         |30        |

Then close the browser