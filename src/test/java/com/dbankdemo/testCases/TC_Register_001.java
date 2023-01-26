package com.dbankdemo.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.dbankdemo.pageObject.Login;
import com.dbankdemo.pageObject.Register;

public class TC_Register_001 extends BaseTest {

    private final String URL = "http://dbankdemo.com/bank/login";

    @Test
    public void registerTest() throws InterruptedException {
        driver.get(URL);

        // Login Page
        Login login = new Login(driver);
        login.clickSignUpLink();

        // Register Page
        Register register = new Register(driver);
        register.selectOption("Mr.");
        register.setFirstname("Joe");
        register.setLastname("Doe");
//        Thread.sleep(3000);
        register.setGender("M");
        register.setDob("02/06/1986");
        register.setSsn("486-48-6996");
        register.setEmail("doe@gmail.com");
        register.setPassword("Pass123#");
        register.setConfirmPassword("Pass123#");
        register.clickNextButton();

        // Next Page
        register.setAddress("567 Digital Lane");
        register.setLocality("Browser City");
        register.setRegion("CA");
        register.setPostalCode("94302");
        register.setCountry("US");
        register.setHomePhone("(547) 392-5436");
        register.setMobilePhone("(547) 392-5436");
        register.setWorkPhone("(547) 392-5436");
        register.clickAgreeTerms();
        register.clickRegisterButton();

        if (driver.getPageSource().contains("Registration Successful. Please Login.")) {
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
    }
}
