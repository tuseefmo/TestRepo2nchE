@MyReports
  Feature: My Reports
    Scenario: My Reports
      Given I am on the main web page
      When I click File Center module
      Then I make sure that there is no "Myreports" module
      Then I click the user icon
      And I click the "Start Impersonating" link
      Then I add "bob backline" as a username in the field
      And I click the "Start Impersonating" button
      Then I click on the My Reports button
      And I am in the Myreports module
      #And I should be able to see reports created only by Bob Backline