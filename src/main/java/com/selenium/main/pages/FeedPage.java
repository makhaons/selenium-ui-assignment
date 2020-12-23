package com.selenium.main.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FeedPage extends BasePage {

    @FindBy(how = How.XPATH, using = "/html/body/app-root/app-navbar/nav/div/ul/li[2]/a")
    public static WebElement feedPageUsername;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/app-navbar/nav/div/ul/li[3]/a")
    public static WebElement feedPageNewPostButton;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/app-navbar/nav/div/ul/li[4]/a")
    public static WebElement feedPageSettingsButton;

    public FeedPage(WebDriver driver) {
        super(driver);
    }
}
