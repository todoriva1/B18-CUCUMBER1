Feature:  Example of how to implment data table

  @dataTable
  Scenario: Something happens
    # Given User does something
    Then User should see below words displayed
      | apple    |
      | Kiwi     |
      | Orange   |
      | Cucumber |
      | Broccoli |

  #we use this above data table if we want more then one data in one step

    # command + option + l  --> poredja samo lepo linije da budu jednake
