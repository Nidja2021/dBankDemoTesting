package com.dbankdemo.testCases;

import com.dbankdemo.pageObject.Login;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.dbankdemo.pageObject.Logout;

public class TC_Logout_001 extends BaseTest {

    private final String URL = "http://dbankdemo.com/bank/login";

    @Test
    public void logout() {
        driver.get(URL);

        Login login = new Login(driver);
        login.setUsername("john@gmail.com");
        login.setPassword("Pass123#");
        login.clickLoginButton();

        Logout logout = new Logout(driver);

        logout.clickDropDown();
        logout.clickLogoutButton();

        if (driver.getTitle().equals("Digital Bank"))
            Assert.assertTrue(true);
        else
            Assert.fail();
    }
}
