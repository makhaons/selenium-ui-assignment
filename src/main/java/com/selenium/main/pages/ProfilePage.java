package com.selenium.main.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProfilePage extends BasePage {

    @FindBy(how = How.XPATH, using = "/html/body/app-root/app-profile/div/div[1]/div/div/div/h4")
    public static WebElement profileDetailsPageTitle;

    public ProfilePage(WebDriver driver) {
        super(driver);
    }
}
