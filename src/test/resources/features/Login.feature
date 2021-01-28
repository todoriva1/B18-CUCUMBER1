Feature: Login feature
  Agile story: As a user, I should be able to login with correct credentials to
              different accounts. And dashboard should be displayed

  # all above is like regular user story, we can explain here briefly or in details
  # all above is like regular user story, we can explain here briefly or in details


  @Librarian
  Scenario: Librarian login scenario

    # we can put more line her if necessary

      Given User is  on the login page
      When User log in as librarian
      Then User should see dashboard

      # ovo @Librarian mozes nazvati kako hoces, npr @IvanKralj
    # we can put any order When,Given,Then or whatever

