package com.selenium.test.teststeps;

import com.github.javafaker.Faker;
import com.selenium.main.support.ThreadLocalMap;
import com.selenium.main.utilities.DriverManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import static com.selenium.main.pages.FeedPage.feedPageSettingsButton;
import static com.selenium.main.pages.ProfilePage.profileDetailsPageTitle;
import static com.selenium.main.pages.SettingsPage.*;

public class SettingsStepDefinitions extends DriverManager {

    Faker faker = new Faker();

    @And("^the user clicks settings menu item$")
    public void theUserClicksSettingsMenuItem() {
        feedPage.clickElement(feedPageSettingsButton);
    }

    @And("^the user enters the updated profile information$")
    public void theUserEntersTheUpdatedProfileInformation() {
        String username = faker.name().lastName().toLowerCase();
        settingsPageUserUrl.clear();
        settingsPage.sendKeysToWebElement(settingsPageUserUrl, faker.internet().avatar());
        settingsPageUsernameField.clear();
        settingsPage.sendKeysToWebElement(settingsPageUsernameField, username);
        settingsPageBioField.clear();
        settingsPage.sendKeysToWebElement(settingsPageBioField, faker.lorem().paragraph());
        settingsPageEmailField.clear();
        settingsPage.sendKeysToWebElement(settingsPageEmailField, faker.internet().emailAddress());
        settingsPagePasswordField.clear();
        settingsPage.sendKeysToWebElement(settingsPagePasswordField, faker.internet().password());
        ThreadLocalMap.getMap().put("username", username);
    }

    @When("^the user clicks update setting button$")
    public void theUserClicksUpdateSettingButton() {
        settingsPage.clickElement(updateSettingButton);
    }

    @Then("^the user should display the profile page$")
    public void theUserShouldDisplayTheProfilePage() {
        waitingActions.waitAllRequests();
        Assert.assertEquals(ThreadLocalMap.getItem("username", String.class), profileDetailsPageTitle.getText());
    }
}
