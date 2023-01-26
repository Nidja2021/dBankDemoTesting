package com.dbankdemo.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BasePage {

    @FindBy(name = "username")
    @CacheLookup
    private WebElement username;

    @FindBy(id = "password")
    @CacheLookup
    private WebElement password;

    @FindBy(xpath = "//button[@id='submit']")
    @CacheLookup
    private WebElement loginButton;

    @FindBy(xpath = "//span[@class='badge badge-pill badge-danger']")
    private WebElement errorMessage;

    @FindBy(linkText = "Sign Up Here")
    private WebElement signUpLink;

    public Login(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void setUsername(String username) {
        writeText(this.username, username);
    }

    public void setPassword(String password) {
        writeText(this.password, password);
    }

    public Boolean isErrorMessageDisplayed() {
        return errorMessage.isDisplayed();
    }

    public void clickLoginButton() {
        click(this.loginButton);
    }

    public void clickSignUpLink() {
        click(signUpLink);
    }
}
