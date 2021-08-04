Feature: Logout feature

  @Logout
  Scenario: Logout
    When I click the Icon on top right side
    And I select "sign out"
    Then I should be able to logout


