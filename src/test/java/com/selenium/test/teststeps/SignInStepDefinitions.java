package com.selenium.test.teststeps;

import com.selenium.main.support.ThreadLocalMap;
import com.selenium.main.utilities.DriverManager;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import static com.selenium.main.pages.FeedPage.feedPageUsername;
import static com.selenium.main.pages.HomePage.homePageSignInButton;
import static com.selenium.main.pages.SignInPage.*;

public class SignInStepDefinitions extends DriverManager {

    @Given("^the user navigates to the bblog application$")
    public void theUserNavigatesToTheBblogApplication() {
        driver.navigate().to("https://candidatex:qa-is-cool@qa-task.backbasecloud.com/");
    }

    @And("^the user clicks sign-in menu item$")
    public void theUserClicksSignInMenuItem() {
        homePage.clickElement(homePageSignInButton);
    }

    @And("^the user enters the sign-in credentials$")
    public void theUserEntersTheSignInCredentials(DataTable data) {
        String username = data.raw().get(1).get(1);
        signInPage.sendKeysToWebElement(signInPageUsername, username);
        signInPage.sendKeysToWebElement(signInPagePassword, data.raw().get(1).get(2));
        ThreadLocalMap.getMap().put("username", data.raw().get(1).get(0));
    }

    @When("^the user clicks sign-in button$")
    public void theUserClicksSignInButton() {
        signInPage.clickElement(signInButton);
    }

    @Then("^the user should display feed page$")
    public void theUserShouldDisplayFeedPage() {
        waitingActions.waitAllRequests();
        Assert.assertEquals(ThreadLocalMap.getItem("username", String.class), feedPageUsername.getText());
    }

    @Then("^the user displays \"([^\"]*)\" on sign in screen$")
    public void theUserShouldDisplayTheErrorMessage(String errorMessage) {
        waitingActions.waitAllRequests();
        Assert.assertEquals(signInPageErrorMessage.getText(), errorMessage);
    }
}
