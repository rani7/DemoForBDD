Feature: test how background works
Background: till user lands on home page
Given user is on the amazon site
When user enters username and password
And user clicks on login
Then user lands on the home page

Scenario: view menu1
When user clicks on menu1
Then menu1 is displayed

Scenario: view menu2
When user clicks on menu2
Then menu2 is displayed

Scenario: view menu3
When user clicks on menu3
Then menu3 is displayed

#Cucumber 6 is latest which needs the cucumber-eclipse plugin to be installed from market place.
#Cucumber 6 supports both cucumber expressions and regular expressions
#Cucumber 6 automatically replaces string/integer values from feature files to cucumber expressions in step defonition file.
#{string}, {int}, {float} -> cucumber expression
#regular expression -> () is called capture group and 0-9 (say) is the range
#([a-zA-Z0-9]+) -> + means one or more occurance
#([0-9]*) -> zero or more occurance
#([0-9]?) ->zero or one occurance
#([0-9]{4}) -> 4 occurances
#(\\d+) -> for integer occurance one or more
#([^\"]+) -> for string occurance one or more 
