package com.selenium.main.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUpPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//body/app-root/app-register//app-dynamic-form/form/app-input[1]//input[@placeholder='Username']")
    public static WebElement signUpPageUsername;

    @FindBy(how = How.XPATH, using = "//body/app-root/app-register//app-dynamic-form/form/app-input[2]//input[@placeholder='Email']")
    public static WebElement signUpPageEmail;

    @FindBy(how = How.XPATH, using = "//body/app-root/app-register//app-dynamic-form/form/app-input[3]//input[@placeholder='Password']")
    public static WebElement signUpPagePassword;

    @FindBy(how = How.XPATH, using = "//body/app-root/app-register/div[@class='auth-page']//button[@class='btn btn-lg btn-primary pull-xs-right']")
    public static WebElement signUpButton;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/app-register/div/div/div/div/app-list-errors/ul/li")
    public static WebElement signUpPageError;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }
}
