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
When  The user enter the "standard_user" in username field and "secret_sauce" in password field and click login button
Then  Login is successful


@smoke @products @positive @critical
Scenario: user is on the Products page
Given The user is on Products page
When  The user will click on the ADD TO CART 
And the cart symbol
And navigates to Cart page
And click on Checkout button
And user navigates to Profile page
And user complets the profile data
And user clicks on continue
And user navigates to checkout page
And user verifies the product name , product price
And user calulates the total price by adding the tax
And user Clicks on the finish
Then  User navigates to Complete page


