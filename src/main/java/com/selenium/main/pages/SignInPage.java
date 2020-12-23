package com.selenium.main.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//body/app-root/app-login//app-dynamic-form/form/app-input[1]//input[@placeholder='Username']")
    public static WebElement signInPageUsername;

    @FindBy(how = How.XPATH, using = "//body/app-root/app-login//app-dynamic-form/form/app-input[2]//input[@placeholder='Password']")
    public static WebElement signInPagePassword;

    @FindBy(how = How.CSS, using = ".btn.btn-lg.btn-primary.pull-xs-right")
    public static WebElement signInButton;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/app-login/div/div/div/div/app-list-errors/ul/li")
    public static WebElement signInPageErrorMessage;

    public SignInPage(WebDriver driver) {
        super(driver);
    }
}
