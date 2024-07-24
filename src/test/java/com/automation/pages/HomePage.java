package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
    WebElement userDropDown;
    @FindBy(xpath = "(//a[@class='oxd-main-menu-item'])[1]")
    WebElement adminButton;
    @FindBy(xpath = "(//a[@class='oxd-main-menu-item'])[3]")
    WebElement leaveButton;
    public void clickAdmin(){
        adminButton.click();
    }
    public void clickLeave(){
        leaveButton.click();
    }
    public boolean isHomePageDisplayed(){
        return userDropDown.isDisplayed();
    }

}
