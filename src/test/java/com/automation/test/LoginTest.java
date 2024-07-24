package com.automation.test;

import com.automation.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends BaseTest{
    @Test
    public void verifyUserCanLoginWithValidCredentials() throws IOException {
        loginpage.openWebsite();
        loginpage.doLogin(ConfigReader.getConfigValue("login.username"),ConfigReader.getConfigValue("login.password"));
        extentTest.addScreenCaptureFromPath(takeScreenShot());
        Assert.assertTrue(homePage.isHomePageDisplayed(),"User Didn't Login SuccessFully");
    }
}
