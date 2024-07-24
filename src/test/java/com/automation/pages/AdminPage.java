package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class AdminPage extends BasePage {
    @FindBy(xpath = "(//div[@class='oxd-select-text--after'])[1]")
    WebElement userRoleDropdown;
    @FindBy(xpath = "//div[2]/div/div[2]/div/div[2]/div[2]")
    WebElement dropDownAdmin;
    @FindBy(xpath = "//div[@class='oxd-form-actions']/button[2]")
    WebElement searchButton;
    @FindBy(xpath = "//div[@class='oxd-table-card']")
    List<WebElement> searchList;
    public void clickDropdown(){
        userRoleDropdown.click();
    }
    public void selectAdmin(){
        dropDownAdmin.click();
    }
    public void search(){
        searchButton.click();
    }
    public int listCount(){
        return searchList.size();
    }
}
