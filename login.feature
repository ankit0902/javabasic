# new feature
# Tags: optional
    
Feature: A description
    
Scenario: User should be logged in successfully with valid credential
    Given User should be on login page
    When User type valid username 'Raj123'
    And User type valid password Abc123
    And User Click on login button
    Then User should be logged in successfully

Scenario : User should not login with invalid username and valid password
    Given User should be on login page
    When User type invalid username 'John123'
    And User type valid password Abc123
    And User Click on login button
    Then User should not be able to login
    And error messege should be display

Scenario : User should not login with valid username and invalid password
    Given User should be on login page
    When User type valid username 'Raj123'
    And User type invalid password 'Test123'
    And User Click on login button
    Then User should not be able to login
    And error messege should be display

Scenario : User should not login with Invalid username and Invalid password
    Given User should be on login page
    When User type invalid username 'John123'
    And User type Invalid password Test123
    And User Click on login button
    Then User should not be able to login
    And error messege should be display

Scenario : User should not login with Valid username and Blank password
    Given User should be on login page
    When User type valid username 'Raj123'
    And User not enter any password
    And User Click on login button
    Then User should not be able to login
    And error messege should be display

Scenario : User should not login with Blank Username and Valid password
    Given User should be on login page
    When User not type any username
    And User type valid password Abc123
    And User Click on login button
    Then User should not be able to login
    And error messege should be display

Scenario : User should not login with Blank Username and Blank Password
    Given User should be on login page
    When User not type any username
    And User not type any password
    And User Click on login button
    Then Uaer should not be able to login
    And error messege should be display


Scenario : User should not login with Invalid username and Blank password

    Given User should be on login page
    When User type invalid username 'John123'
    And User not type any password
    And User Click on login page
    Then User should not be able to login
    And error messege should be display



