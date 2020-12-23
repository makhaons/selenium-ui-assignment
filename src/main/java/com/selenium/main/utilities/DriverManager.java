package com.selenium.main.utilities;

import com.selenium.main.pages.*;
import com.selenium.main.support.PropertiesReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.BrowserType.CHROME;
import static org.openqa.selenium.remote.BrowserType.FIREFOX;

public class DriverManager {

    public static WebDriver driver;
    protected static HomePage homePage;
    protected static SignInPage signInPage;
    protected static FeedPage feedPage;
    protected static SignUpPage signUpPage;
    protected static PostPage postPage;
    protected static PostDetailsPage postDetailsPage;
    protected static SettingsPage settingsPage;
    protected static ProfilePage profilePage;
    protected static WaitingActions waitingActions;
    protected static PropertiesReader configReader;

    public WebDriver getDriver() {

        configReader = new PropertiesReader(System.getProperty("user.dir") + "/src/main/java/com/selenium/main/properties/config.properties");

        String browserName = configReader.getData("BROWSER");

        if (browserName.equals(CHROME)) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            driver = new ChromeDriver(options);
        } else if (browserName.equals(FIREFOX)) {
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver(options);
        }

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        homePage = PageFactory.initElements(driver, HomePage.class);
        signInPage = PageFactory.initElements(driver, SignInPage.class);
        feedPage = PageFactory.initElements(driver, FeedPage.class);
        signUpPage = PageFactory.initElements(driver, SignUpPage.class);
        postPage = PageFactory.initElements(driver, PostPage.class);
        postDetailsPage = PageFactory.initElements(driver, PostDetailsPage.class);
        settingsPage = PageFactory.initElements(driver, SettingsPage.class);
        profilePage = PageFactory.initElements(driver, ProfilePage.class);
        waitingActions = PageFactory.initElements(driver, WaitingActions.class);

        return driver;

    }
}
