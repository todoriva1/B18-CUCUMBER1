
Feature: Wiki title and search verifications

  Background: User is on the Wiki home page
    Given User is on the Wikipedia home page

  Scenario: Search functionality title verification
    When User types "Steve Jobs" in the wiki search box
    Then User should see "Steve Jobs" in the wiki title


  @wiki
  Scenario: Search functionality header verification
    When User types "Steve Jobs" in the wiki search box
    Then User should see "Steve Jobs" in the main header














