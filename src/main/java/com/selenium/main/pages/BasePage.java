package com.selenium.main.pages;

import com.selenium.main.utilities.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage extends DriverManager {

    public WebDriverWait wait;

    BasePage(WebDriver driver) {
        this.wait = new WebDriverWait(DriverManager.driver, 15);
        JavascriptExecutor jsExecutor = ((JavascriptExecutor) DriverManager.driver);
    }

    public void clickElement(WebElement element) {
        waitingActions.pageLoadComplete();
        element.click();
    }

    public void elementPresent(WebElement element, int duration) {
        try {
            new WebDriverWait(driver, duration).until(ExpectedConditions.visibilityOf(element));
        } catch (NoSuchElementException | TimeoutException ignore) {
        }
    }

    public void sendKeysToWebElement(WebElement element, String textToSend) {
        try {
            this.WaitUntilWebElementIsVisible(element);
            element.clear();
            element.sendKeys(textToSend);
            System.out.println("Successfully Sent the following keys: '" + textToSend + "' to element: " + "<" + element.toString() + ">");
        } catch (Exception e) {
            System.out.println("Unable to locate WebElement: " + "<" + element.toString() + "> and send the following keys: " + textToSend);
            Assert.fail("Unable to send keys to WebElement, Exception: " + e.getMessage());
        }
    }

    private void WaitUntilWebElementIsVisible(WebElement element) {
        try {
            this.wait.until(ExpectedConditions.visibilityOf(element));
            System.out.println("WebElement is visible using locator: " + "<" + element.toString() + ">");
        } catch (Exception e) {
            System.out.println("WebElement is NOT visible, using locator: " + "<" + element.toString() + ">");
            Assert.fail("WebElement is NOT visible, Exception: " + e.getMessage());
        }
    }
}
