package com.dbankdemo.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EditUser extends BasePage {

    @FindBy(id = "title")
    private WebElement title;

    @FindBy(id = "firstName")
    private WebElement firstname;

    @FindBy(id = "lastName")
    private WebElement lastname;

    @FindBy(id = "homePhone")
    private WebElement homePhone;

    @FindBy(id = "mobilePhone")
    private WebElement mobilePhone;

    @FindBy(id = "workPhone")
    private WebElement workPhone;

    @FindBy(id = "address")
    private WebElement address;

    @FindBy(id = "locality")
    private WebElement locality;

    @FindBy(id = "region")
    private WebElement region;

    @FindBy(id = "postalCode")
    private WebElement postalCode;

    @FindBy(id = "country")
    private WebElement country;

    @FindBy(xpath = "//button[normalize-space()='Submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//button[normalize-space()='Reset']")
    private WebElement resetButton;


    public EditUser (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void selectOption(String option) {
        Select select = new Select(title);
        select.selectByVisibleText(option);
    }

    public void setFirstname(String firstname) {
        this.firstname.clear();
        writeText(this.firstname, firstname);
    }

    public void setLastname(String lastname) {
        this.lastname.clear();
        writeText(this.lastname, lastname);
    }

    public void setAddress(String address) {
        this.address.clear();
        writeText(this.address, address);
    }

    public void setLocality(String locality) {
        this.locality.clear();
        writeText(this.locality, locality);
    }

    public void setRegion(String region) {
        this.region.clear();
        writeText(this.region, region);
    }

    public void setPostalCode(String postalCode) {
        this.postalCode.clear();
        writeText(this.postalCode, postalCode);
    }

    public void setCountry(String country) {
        this.country.clear();
        writeText(this.country, country);
    }

    public void setHomePhone(String homePhone) {
        this.homePhone.clear();
        writeText(this.homePhone, homePhone);
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone.clear();
        writeText(this.mobilePhone, mobilePhone);
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone.clear();
        writeText(this.workPhone, workPhone);
    }

    public void clickSubmitButton() {
        click(this.submitButton);
    }

    public void clickResetButton() {
        click(this.resetButton);
    }
}
