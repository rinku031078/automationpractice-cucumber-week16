Feature: Create Account Test

  As a user i should able to create account successfully

  Background:
    Given I am in home page


  Scenario: User should create account successfully
    When I click On "Sign in"
    And I enter "Email"
    Then I click on create account button
    And I select gender
    And I enter customer first name
    And I enter customer last name
    And I enter password
    And I select day of Birth
    And I select month of Birth
    And I select year of Birth
    And I enter first name
    And I enter last name
    And I enter Company
    And I enter Address One
    And I enter Address Two
    And I enter City
    And I enter State
    And I enter Post Code
    And I enter Country
    And I enter other details
    And I enter phone no
    And I enter mobile no
    And I enter alia
    And I click on register button
    And I should see My Account
Then I should see message my name on homePage

