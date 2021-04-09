Feature: Free CRM hook test

Scenario: Free CRM create deal test
Given user is on deal page
Then user fills the Deals form
Then deal is created

Scenario: Free CRM create contact test
Given user is on contact page
Then user fills the Contacts form
Then contact is created