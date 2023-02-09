#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature:  Checkout Module
Background: Login and go to Products page
Given The user is on login page
When  The user enter the the following credentails
|Username|Password|
|standard_user|secret_sauce|
Then  User should be landed on the Products Page

@smoke @checkout @positive @critical
Scenario: user is on the Products page

When  User landed at Product page after logged in successfully
Then User should be able to notice the Shopping Cart icon badge changed
    And User should be able examine the item in Shopping cart
    And user clicks on checkout
    And User provides profile info clicks on Continue button
    And User is on products overview page clciks on Finish
