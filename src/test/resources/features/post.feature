Feature: Create an article
  As a user, I should be able to create an article

  Background: Sign-in with valid credentials
    Given the user navigates to the bblog application
    And the user clicks sign-in menu item
    And the user enters the sign-in credentials
      | USERNAME       | EMAIL                             | PASSWORD |
      | bbloguser12345 | bbloguser12345@bbloguser12345.com | 123456   |
    When the user clicks sign-in button
    Then the user should display feed page

  @create_article @positive
  Scenario: Create an article when the user provides valid information
    And the user clicks new post menu item
    And the user enters the article information
    When the user clicks publish article button
    Then the user should display article details page
