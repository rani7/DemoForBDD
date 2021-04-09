Feature: Free CRM login feature
# Without Examples keyword - used when one input
# Scenario: Free CRM test scenario

# Given user is already on login page
# When title of login page is Free CRM
# Then user enters "naveenk" and "test123"
# Then user clicks on login button
#Then user is on home page

#with Examples keyword - used when multiple inputs
Scenario Outline: Free CRM test scenario

Given user is already on login page
When title of login page is Free CRM
Then user enters the "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then close the browser

Examples:
|username|password|
|naveenk|test123|
|tom|test456|