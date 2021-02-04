@login
Feature: Login feature
  Agile story: As a user, I should be able to login with correct credentials to
              different accounts. And dashboard should be displayed

  # all above is like regular user story, we can explain here briefly or in details
  # all above is like regular user story, we can explain here briefly or in details


  @librarian
  Scenario: Librarian login scenario
    # we can put more line her if necessary
    Given User is  on the login page
      When User log in as librarian
      Then User should see dashboard

      # ovo @Librarian mozes nazvati kako hoces, npr @IvanKralj
    # we can put any order When,Given,Then or whatever
    # code will be run in feature file order here, not in step definition file
    # command button on mac hold and point cursor on fro example " Given User is  on the login page" and you can click


  @student
  Scenario: Student login scenario
    Given User is  on the login page
    When User logs in as student
    Then User should see dashboard


  @admin
  Scenario: Admin login scenario
    Given User is  on the login page
    When User logs in as admin
    Then User should see dashboard

