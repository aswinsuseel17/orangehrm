package com.automation.test;

import com.automation.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {
    @Test
    public void validateNumberOfAdminGreaterThanOrEqualToOne(){
        loginpage.openWebsite();
        loginpage.doLogin(ConfigReader.getConfigValue("login.username"),ConfigReader.getConfigValue("login.password"));
        homePage.clickAdmin();
        adminPage.clickDropdown();
        adminPage.selectAdmin();
        adminPage.search();
        Assert.assertTrue(adminPage.listCount()>=1,"There's no admin user");
        leavePage.clickApply();
    }
    @Test
    public void verifyUserCanApplyForLeave(){
        loginpage.openWebsite();
        loginpage.doLogin(ConfigReader.getConfigValue("login.username"),ConfigReader.getConfigValue("login.password"));
        homePage.clickLeave();
        Assert.assertTrue(leavePage.isLeavePageDisplayed(),"Leave page is not displayed");
        leavePage.clickApply();
        applyLeavePage.clickLeaveType();
        applyLeavePage.selectLeaveType();
        applyLeavePage.selectDate(ConfigReader.getConfigValue("leave.fromdate"),ConfigReader.getConfigValue("leave.todate"));
        applyLeavePage.clickPartialDays();
        applyLeavePage.selectPartialDay();
        applyLeavePage.clickDuration();
        applyLeavePage.selectDuration();

    }

}
