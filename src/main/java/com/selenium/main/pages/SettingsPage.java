package com.selenium.main.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SettingsPage extends BasePage {

    @FindBy(how = How.XPATH, using = "/html/body/app-root/app-settings/div/div/div/div/app-dynamic-form/form/app-input[1]/fieldset/input")
    public static WebElement settingsPageUserUrl;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/app-settings/div/div/div/div/app-dynamic-form/form/app-input[2]/fieldset/input")
    public static WebElement settingsPageUsernameField;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/app-settings/div/div/div/div/app-dynamic-form/form/app-textarea/fieldset/textarea")
    public static WebElement settingsPageBioField;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/app-settings/div/div/div/div/app-dynamic-form/form/app-textarea/fieldset/textarea")
    public static WebElement settingsPageEmailField;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/app-settings/div/div/div/div/app-dynamic-form/form/app-input[4]/fieldset/input")
    public static WebElement settingsPagePasswordField;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/app-settings/div/div/div/div/div/button")
    public static WebElement updateSettingButton;

    public SettingsPage(WebDriver driver) {
        super(driver);
    }
}
