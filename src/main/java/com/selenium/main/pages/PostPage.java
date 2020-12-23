package com.selenium.main.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PostPage extends BasePage {

    @FindBy(how = How.XPATH, using = "/html/body/app-root/app-article-editor/div/div/div/div/app-dynamic-form/form/app-input[1]/fieldset/input")
    public static WebElement articlePageTitle;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/app-article-editor/div/div/div/div/app-dynamic-form/form/app-input[2]/fieldset/input")
    public static WebElement articlePageDescription;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/app-article-editor/div/div/div/div/app-dynamic-form/form/app-textarea/fieldset/textarea")
    public static WebElement articlePageArticle;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/app-article-editor/div/div/div/div/app-dynamic-form/form/app-input[3]/fieldset/input")
    public static WebElement articlePageTags;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/app-article-editor/div/div/div/div/button")
    public static WebElement articlePublishButton;

    public PostPage(WebDriver driver) {
        super(driver);
    }
}
