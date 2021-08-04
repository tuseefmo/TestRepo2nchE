@Login
  Feature: As a valid user, I should be able to login

    Scenario: Client Center login verification
      Given I am on the website
      When I enter the correct credentials
      Then I should be able to login successfully








 # @Canada
  #Scenario: Go to <search module> and verify: <column>
  #Given I am on the search box
  #When I search in as "Canada"
  #Then I should verify the result shows Canada data sources

  #@CheckBox
  #Scenario: CheckBox
   # When I view the first Run Daemon checkbox
    #Then I should verify that the first checkbox is selected
    #And I click the second Run Daemon button to uncheck the box
    #Then I should verify that second Run Daemon check box is selected