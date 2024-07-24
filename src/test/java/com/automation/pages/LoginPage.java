package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(name = "username")
    WebElement userNameInput;
    @FindBy(name = "password")
    WebElement passwordInput;
    @FindBy(tagName = "button")
    WebElement loginButton;
    public void openWebsite(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    public void doLogin(String userName,String password){
        userNameInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
    public boolean isLoginPageDisplayed(){
        return userNameInput.isDisplayed() && passwordInput.isDisplayed();
    }

}
