package com.selenium.test.teststeps;

import com.github.javafaker.Faker;
import com.selenium.main.support.ThreadLocalMap;
import com.selenium.main.utilities.DriverManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import static com.selenium.main.pages.PostDetailsPage.articleDetailsPageTitle;
import static com.selenium.main.pages.PostPage.*;
import static com.selenium.main.pages.FeedPage.feedPageNewPostButton;

public class PostStepDefinitions extends DriverManager {

    Faker faker = new Faker();

    @And("^the user clicks new post menu item$")
    public void theUserClicksNewPostMenuItem() {
        feedPage.clickElement(feedPageNewPostButton);
    }

    @Then("^the user enters the article information$")
    public void theUserEntersTheArticleInformation() {
        String articleTitle = faker.lordOfTheRings().character().toLowerCase();
        postPage.sendKeysToWebElement(articlePageTitle, articleTitle);
        postPage.sendKeysToWebElement(articlePageDescription, faker.lordOfTheRings().location());
        postPage.sendKeysToWebElement(articlePageArticle, faker.lorem().paragraph());
        postPage.sendKeysToWebElement(articlePageTags, faker.lorem().word());
        ThreadLocalMap.getMap().put("articletitle", articleTitle.toLowerCase());
    }

    @When("^the user clicks publish article button$")
    public void theUserClicksPublishArticleButton() {
        postPage.clickElement(articlePublishButton);
    }

    @Then("^the user should display article details page$")
    public void theUserShouldDisplayArticleDetailsPage() {
        waitingActions.waitAllRequests();
        Assert.assertEquals(ThreadLocalMap.getItem("articletitle", String.class), articleDetailsPageTitle.getText());
    }
}
