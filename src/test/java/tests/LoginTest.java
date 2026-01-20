package tests;


import org.testng.annotations.Test;

import base.BaseTest;
import dev.failsafe.internal.util.Assert;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {
        LoginPage login = new LoginPage(driver);
        login.login("Admin", "admin123");
        Assert.isTrue(driver.getTitle().equals("OrangeHRM"), "Login failed - Title does not match");
    }
}
