package com.selenium.test.teststeps;

import com.github.javafaker.Faker;
import com.selenium.main.support.ThreadLocalMap;
import com.selenium.main.utilities.DriverManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import static com.selenium.main.pages.HomePage.homePageSignUpButton;
import static com.selenium.main.pages.SignUpPage.*;

public class SignUpStepDefinitions extends DriverManager {

    Faker faker = new Faker();

    @And("^the user clicks sign-up menu item$")
    public void theUserClicksSignUpMenuItem() {
        homePage.clickElement(homePageSignUpButton);
    }

    @And("^the user enters the sign-up credentials$")
    public void theUserEntersTheSignUpCredentials() {
        String username = faker.random().hex(15).toLowerCase();
        signUpPage.sendKeysToWebElement(signUpPageUsername, username);
        signUpPage.sendKeysToWebElement(signUpPageEmail, faker.internet().emailAddress());
        signUpPage.sendKeysToWebElement(signUpPagePassword, faker.internet().password());
        ThreadLocalMap.getMap().put("username", username);
    }

    @When("^the user clicks sign-up button$")
    public void theUserClicksSignUpButton() {
        signUpPage.clickElement(signUpButton);
    }

    @And("^the user enters the sign-up credentials without email$")
    public void theUserEntersTheSignUpCredentialsWithoutEmail() {
        signUpPage.sendKeysToWebElement(signUpPageUsername, faker.random().hex(10));
        signUpPage.sendKeysToWebElement(signUpPagePassword, faker.internet().password());
    }

    @Then("^the user displays \"([^\"]*)\" on sign up screen$")
    public void theUserDisplaysOnSignUpScreen(String errorMessage) {
        waitingActions.waitAllRequests();
        Assert.assertEquals(signUpPageError.getText(), errorMessage);
    }

    @And("^the user enters the sign-up credentials without username$")
    public void theUserEntersTheSignUpCredentialsWithoutUsername() {
        signUpPage.sendKeysToWebElement(signUpPageEmail, faker.internet().emailAddress());
        signUpPage.sendKeysToWebElement(signUpPagePassword, faker.internet().password());
    }
}
