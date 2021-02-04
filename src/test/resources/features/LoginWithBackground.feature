#this is copy/past from login.feature just to see how "background" keyword works
  #tag free, no tags

@loginWithBackground
Feature: Login feature
  Agile story: As a user, I should be able to login with correct credentials to
  different accounts. And dashboard should be displayed


  #BEFORE ANNOTATION
Background: Backstory is that user is on the login page
  Given User is  on the login page

  # as we can see each "Given" below is the same, repeating process, so that's why we need background. Now we don't have
  #Given below,only here
  # run first before everything

  Scenario: Librarian login scenario
    When User log in as librarian
    Then User should see dashboard
  #AFTER ANNOTATION RUN HERE

  Scenario: Student login scenario
    When User logs in as student
    Then User should see dashboard
   #AFTER ANNOTATION RUN HERE

  @db
  Scenario: Admin login scenario
    #BEFORESTEP RUN HERE
    When User logs in as admin
    #AFTERSTEP RUN HERE
    #BEFORESTEP RUN HERE
    Then User should see dashboard
    #AFTERSTEP RUN HERE
    #AFTER ANNOTATION RUN HERE
