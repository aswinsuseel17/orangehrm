package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeavePage extends BasePage{
    @FindBy(xpath = "//h5")
    WebElement header;
    @FindBy(xpath = "//nav/ul/li[1]")
    WebElement applySection;
    public boolean isLeavePageDisplayed(){
        return header.getText().equals("Leave List");
    }
    public void clickApply(){
        applySection.click();
    }
}
