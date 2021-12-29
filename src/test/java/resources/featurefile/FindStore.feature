@sanity
Feature: Find Store On Map
As a user I want to browse store on map and take screenshot for future reference
  Background:
    Given I am in home page

    Scenario: Verify user able to browse the store on map
      When I select On "Our stores"
      And I click on OK button
      And I scroll on map
      And I click On zoomOut
      Then I take screenshot


