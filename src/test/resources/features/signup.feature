Feature: Sign-up to the application
  As a user, I should be able to sign-up to the application

  @sign-up @positive
  Scenario: Sign-up when the user provides valid credentials
    Given the user navigates to the bblog application
    And the user clicks sign-up menu item
    And the user enters the sign-up credentials
    When the user clicks sign-up button
    Then the user should display feed page

  @sign-up @negative
  Scenario: Sign-up when the user not provides an email address
    Given the user navigates to the bblog application
    And the user clicks sign-up menu item
    And the user enters the sign-up credentials without email
    When the user clicks sign-up button
    Then the user displays "email can't be blank" on sign up screen

  @sign-up @negative
  Scenario: Sign-up when the user not provides a username
    Given the user navigates to the bblog application
    And the user clicks sign-up menu item
    And the user enters the sign-up credentials without username
    When the user clicks sign-up button
    Then the user displays "username can't be blank" on sign up screen