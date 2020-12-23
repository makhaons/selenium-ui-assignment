package com.selenium.main.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PostDetailsPage extends BasePage {

    @FindBy(how = How.XPATH, using = "/html/body/app-root/app-article/div/div[1]/div/h1")
    public static WebElement articleDetailsPageTitle;

    public PostDetailsPage(WebDriver driver) {
        super(driver);
    }
}
