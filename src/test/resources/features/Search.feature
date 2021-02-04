Feature: Search
  Agile Story: As a user, I should be able to search when I am Google search


  Background: User should be on Google search page
    Given User is on the google search page

  Scenario: Google default title verification
    Then User should see title is Google

  @wip #work in progress, just example annotation --> @wip
  Scenario: Google title verification after search
    When User searches apple
    Then User should see apple in the title

  @paramet
  Scenario: Google title verification after search
    When User searches "onion"
    Then User should see "onion" in the title



    #data table example below

  @googleTable
  Scenario: Google search page footer link verification
    Then User can see five links in the footer
      | Advertising      |
      | Business         |
      | How Search Works |
      | Privacy          |
      | Terms            |

