#Using Tags annotations - customised annotations to segregate the test cases
@FunctionalTag
Feature: Free CRM aplication testing

@SmokeTest @RegressionTest 
Scenario: Login with correct username and correct password
Given This is a valid login test

@RegressionTest
Scenario: Login with incorrect username and incorrect password
Given This is an invalid login test

@SmokeTest
Scenario: Create a contact
Given This is a contact test case

@SmokeTest @RegressionTest 
Scenario: Create a deal
Given This is a deal test case

@RegressionTest
Scenario: Create a task
Given This is a task test case

@SmokeTest
Scenario: Create a case
Given This is a case test case

@SmokeTest @RegressionTest
Scenario: Verify left panel links
Given clicking on left panel links

@SmokeTest
Scenario: Search a deal
Given This is a search deal test

@SmokeTest
Scenario: Search a contact
Given This is a search contact test

@SmokeTest @RegressionTest 
Scenario: Search a case
Given This is a search case test

@SmokeTest @RegressionTest 
Scenario: Search a task
Given This is a search task test

@SmokeTest @End2End
Scenario: Search a call
Given This is a search call test

@SmokeTest @End2End
Scenario: Search an email
Given This is a search email test

@SmokeTest @End2End
Scenario: Search a doc
Given This is a search doc test

@SmokeTest @End2End
Scenario: Search a form
Given This is a search form test

@End2End
Scenario: Validate a report
Given This is a report test

@End2End
Scenario: Application logout
Given This is a logout test

Scenario: close browser
Given This is a browser logout test