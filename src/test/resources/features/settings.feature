Feature: User settings
  As a user, I should be able to update the user information

  Background: Sign-in with valid credentials
    Given the user navigates to the bblog application
    And the user clicks sign-up menu item
    And the user enters the sign-up credentials
    When the user clicks sign-up button
    Then the user should display feed page

  @update_user @positive
  Scenario: Update user profile
    And the user clicks settings menu item
    And the user enters the updated profile information
    When the user clicks update setting button
    Then the user should display the profile page