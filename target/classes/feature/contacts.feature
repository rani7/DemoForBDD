Feature: Free new contact scenario
Scenario Outline: Free CRM create contact scenario

Given user is already on login page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user moves to new contact page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then close the browser

Examples:
|username|password|firstname|lastname|position|
| naveenk|test123|   Tom   |  Peter | Manager|
| naveenk|test123|   David |  Dsouza|Director|