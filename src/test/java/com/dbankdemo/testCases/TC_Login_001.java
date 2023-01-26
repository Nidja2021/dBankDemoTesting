package com.dbankdemo.testCases;

import com.dbankdemo.pageObject.Login;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Login_001 extends BaseTest {

    @Test(priority = 1)
    public void loginTest() {
        Login login = new Login(driver);

        login.setUsername(username);
        logger.info("Entered username");

        login.setPassword(password);
        logger.info("Entered password");

        login.clickLoginButton();

        if (driver.getTitle().equals("Digital Bank")) {
            logger.info("Login test passed");
            Assert.assertTrue(true);
        } else {
            logger.info("Login test failed");
            Assert.fail();
        }
    }

    @Test
    public void loginUsernameEmptyTest() {
        Login login = new Login(driver);

        login.setUsername("");
        login.setPassword("Pass123#");
        login.clickLoginButton();

        if (login.isErrorMessageDisplayed()) {
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
    }

    @Test
    public void loginPasswordEmptyTest() {
        Login login = new Login(driver);

        login.setUsername("john@gmail.com");
        login.setPassword("");
        login.clickLoginButton();

        if (login.isErrorMessageDisplayed()) {
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
    }

    @Test
    public void loginUsernameAndPasswordEmptyTest() {
        Login login = new Login(driver);

        login.setUsername("");
        login.setPassword("");
        login.clickLoginButton();

        if (login.isErrorMessageDisplayed()) {
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
    }

    @Test
    public void loginInvalidUsernameAndPasswordTest() {
        Login login = new Login(driver);

        login.setUsername("username@gmail.com");
        login.setPassword("InvalidPass3#");
        login.clickLoginButton();

        if (login.isErrorMessageDisplayed()) {
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
    }

    @Test
    public void loginInvalidUsernameTest() {
        Login login = new Login(driver);

        login.setUsername("username@gmail.com");
        login.setPassword("Pass123#");
        login.clickLoginButton();

        if (login.isErrorMessageDisplayed()) {
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
    }

    @Test
    public void loginInvalidPasswordTest() {
        Login login = new Login(driver);

        login.setUsername("john@gmail.com");
        login.setPassword("Pass123##");
        login.clickLoginButton();

        if (login.isErrorMessageDisplayed()) {
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
    }
}
