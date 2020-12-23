package com.selenium.main.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

    @FindBy(how = How.XPATH, using = "//app-root/app-navbar/nav[@class='navbar navbar-light']//ul[@class='nav navbar-nav pull-xs-right']//a[@href='#/login']")
    public static WebElement homePageSignInButton;

    @FindBy(how = How.XPATH, using = "//app-root/app-navbar/nav[@class='navbar navbar-light']//ul[@class='nav navbar-nav pull-xs-right']//a[@href='#/register']")
    public static WebElement homePageSignUpButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
