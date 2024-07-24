package com.automation.test;

import com.automation.pages.*;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestClass;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public class BaseTest {
    LoginPage loginpage;
    HomePage homePage;
    AdminPage adminPage;
    LeavePage leavePage;
    ApplyLeavePage applyLeavePage;
    private static ExtentReports extentReports;
    public static ExtentTest extentTest;
    private static ExtentSparkReporter sparkReporter;
    @BeforeMethod
    public void setUp(ITestContext context) throws MalformedURLException {
        String reportPath=System.getProperty("user.dir")+"\\reports\\extentreport.html";
        sparkReporter = new ExtentSparkReporter(reportPath);
        sparkReporter.config().setTheme(Theme.DARK);

        extentReports = new ExtentReports();
        extentTest = extentReports.createTest("Verify user can login");
        extentTest.info("Navigating to another page");

        ConfigReader.initConfig();
        DriverManager.createDriver();
        loginpage=new LoginPage();
        homePage=new HomePage();
        adminPage=new AdminPage();
        leavePage=new LeavePage();
        applyLeavePage=new ApplyLeavePage();
    }
    @AfterMethod
    public void tearDown(){
        DriverManager.getDriver().quit();
        extentReports.attachReporter(sparkReporter);
        extentReports.flush();
    }
    public String takeScreenShot() throws IOException {
        TakesScreenshot ts = (TakesScreenshot) DriverManager.getDriver();
        File fl =ts.getScreenshotAs(OutputType.FILE);
        String filePath = "src\\test\\resources"+"\\"+"screenshot.png";
        FileUtils.copyFile(fl, new File(filePath));
        return System.getProperty("user.dir")+"\\"+filePath;

    }

}
