package com.dbankdemo.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout extends BasePage {


//    @FindBy(className = "dropdown-toggle")
    @FindBy(xpath = "//img[@alt='User Avatar']")
    @CacheLookup
    private WebElement dropDown;

    @FindBy(partialLinkText = "Logout")
    private WebElement logoutButton;

    public Logout(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickDropDown() {
        click(this.dropDown);
    }

    public void clickLogoutButton() {
        click(this.logoutButton);
    }
}
