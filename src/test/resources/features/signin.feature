Feature: Sign-in to the application
  As a user, I should be able to sign-in to the application

  @sign-in @positive
  Scenario: Sign-in with valid credentials
    Given the user navigates to the bblog application
    And the user clicks sign-in menu item
    And the user enters the sign-in credentials
      | USERNAME       | EMAIL                             | PASSWORD |
      | bbloguser12345 | bbloguser12345@bbloguser12345.com | 123456   |
    When the user clicks sign-in button
    Then the user should display feed page

  @sign-in @negative
  Scenario: Sign-in with invalid credentials
    Given the user navigates to the bblog application
    And the user clicks sign-in menu item
    And the user enters the sign-in credentials
      | USERNAME    | EMAIL                        | PASSWORD |
      | invaliduser | invalidmail@userdummy001.com | 123456   |
    When the user clicks sign-in button
    Then the user displays "email or password is invalid" on sign in screen

  @sign-in @negative
  Scenario: Sign-in without providing password
    Given the user navigates to the bblog application
    And the user clicks sign-in menu item
    And the user enters the sign-in credentials
      | USERNAME    | EMAIL                        | PASSWORD |
      | invaliduser | invalidmail@userdummy001.com |          |
    When the user clicks sign-in button
    Then the user displays "password can't be blank" on sign in screen

  @sign-in @negative
  Scenario: Sign-in without providing e-mail
    Given the user navigates to the bblog application
    And the user clicks sign-in menu item
    And the user enters the sign-in credentials
      | USERNAME    | EMAIL | PASSWORD |
      | invaliduser |       | 123456   |
    When the user clicks sign-in button
    Then the user displays "email can't be blank" on sign in screen
