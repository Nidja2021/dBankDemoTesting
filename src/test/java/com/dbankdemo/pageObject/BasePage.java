package com.dbankdemo.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void waitVisibility(WebElement element) {
        if (element == null) {
            throw new IllegalArgumentException("Element is not displayed!");
        }
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void click(WebElement element) {
        waitVisibility(element);
        element.click();
    }

    public void writeText(WebElement element, String text) {
        waitVisibility(element);
        element.sendKeys(text);
    }

    public String readText(WebElement element) {
        waitVisibility(element);
        return element.getText();
    }
}
