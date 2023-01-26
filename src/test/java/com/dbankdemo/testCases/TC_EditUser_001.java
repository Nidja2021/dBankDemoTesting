package com.dbankdemo.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.dbankdemo.pageObject.EditUser;
import com.dbankdemo.pageObject.Login;

public class TC_EditUser_001 extends BaseTest {

    @Test
    public void editUserTest() {
        // Login Page
        Login login = new Login(driver);

        login.setUsername("john@gmail.com");
        login.setPassword("Pass123#");
        login.clickLoginButton();

        // User menu dropdown
        driver.findElement(By.xpath("//img[@alt='User Avatar']")).click();
        driver.findElement(By.linkText("My Profile")).click();

        // Profile Page for edit or reset data
        EditUser editUser = new EditUser(driver);
        editUser.setLastname("Smith");
        editUser.clickSubmitButton();

        if (driver.getPageSource().contains("Profile Updated Successfully.")) {
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
    }
}
