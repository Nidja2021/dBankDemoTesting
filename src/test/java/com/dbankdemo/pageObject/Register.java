package com.dbankdemo.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Register extends BasePage {

    private WebDriver driver;

    @FindBy(id = "title")
    private WebElement title;

    @FindBy(id = "firstName")
    private WebElement firstname;

    @FindBy(id = "lastName")
    private WebElement lastname;

    @FindAll(
            @FindBy(id = "gender")
    )
    private List<WebElement> genders;

    @FindBy(id = "dob")
    private WebElement dob;

    @FindBy(id = "ssn")
    private WebElement ssn;

    @FindBy(id = "emailAddress")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "confirmPassword")
    private WebElement confirmPassword;

    @FindBy(xpath = "//button[normalize-space()='Next']")
    private WebElement nextButton;

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

    @FindBy(id = "homePhone")
    private WebElement homePhone;

    @FindBy(id = "mobilePhone")
    private WebElement mobilePhone;

    @FindBy(id = "workPhone")
    private WebElement workPhone;

    @FindBy(id = "agree-terms")
    private WebElement agreeTerms;

    @FindBy(xpath = "//button[normalize-space()='Register']")
    private WebElement registerButton;

    public Register(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void selectOption(String option) {
        Select select = new Select(title);
        select.selectByVisibleText(option);
    }

    public void setFirstname(String firstname) {
        writeText(this.firstname, firstname);
    }

    public void setLastname(String lastname) {
        writeText(this.lastname, lastname);
    }

    public void setGender(String value) {
        for (WebElement element : genders)
            if (element.getAttribute("value").equals(value)) {
                System.out.println(element.getText());
                element.click();
            }
//            System.out.println(element);
    }

    public void setDob(String date) {
        writeText(this.dob, date);
    }

    public void setSsn(String ssn) {
        writeText(this.ssn, ssn);
    }

    public void setEmail(String email) {
        writeText(this.email, email);
    }

    public void setPassword(String password) {
        writeText(this.password, password);
    }

    public void setConfirmPassword(String confirmPassword) {
        writeText(this.confirmPassword, confirmPassword);
    }

    public void clickNextButton() {
        click(this.nextButton);
    }

    public void setAddress(String address) {
        writeText(this.address, address);
    }

    public void setLocality(String locality) {
        writeText(this.locality, locality);
    }

    public void setRegion(String region) {
        writeText(this.region, region);
    }
    public void setPostalCode(String postalCode) {
        writeText(this.postalCode, postalCode);
    }

    public void setCountry(String country) {
        writeText(this.country, country);
    }

    public void setHomePhone(String homePhone) {
        writeText(this.homePhone, homePhone);
    }

    public void setMobilePhone(String mobilePhone) {
        writeText(this.mobilePhone, mobilePhone);
    }

    public void setWorkPhone(String workPhone) {
        writeText(this.workPhone, workPhone);
    }

    public void clickAgreeTerms() {
        click(agreeTerms);
    }

    public void clickRegisterButton() {
        click(registerButton);
    }
}
