package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplyLeavePage extends BasePage{
    @FindBy(xpath = "//div[@class='oxd-select-text--after']")
    WebElement leaveTypeSelect;
    @FindBy(xpath = "//div[@class='oxd-select-option'][2]")
    WebElement leaveType;
    @FindBy(xpath = "(//div[@class='oxd-date-input'])[1]/input")
    WebElement fromDateInput;
    @FindBy(xpath = "(//p[@class='oxd-text oxd-text--p'])[1]")
    WebElement fromMonth;
    @FindBy(xpath = "(//button[@class='oxd-icon-button'])[3]")
    WebElement fromMonthNext;
    @FindBy(xpath = "(//div[@class='oxd-date-input'])[2]/input")
    WebElement toDateInput;
    @FindBy(xpath = "(//p[@class='oxd-text oxd-text--p'])[1]")
    WebElement toMonth;
    @FindBy(xpath = "(//button[@class='oxd-icon-button'])[3]")
    WebElement toMonthNext;
    @FindBy(xpath = "(//div[@class='oxd-select-text--after'])[2]")
    WebElement partialDaysSelect;
    @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[2]/div[2]/div[2]")
    WebElement partialDay;
    @FindBy(xpath = "(//div[@class='oxd-select-text--after'])[3]")
    WebElement durationSelect;
    @FindBy(xpath = "(//div[@class='oxd-select-option'])[2]")
    WebElement duartion;
    public void clickLeaveType(){
        leaveTypeSelect.click();
    }
    public void selectLeaveType(){
        leaveType.click();
    }
    public void clickPartialDays(){
        partialDaysSelect.click();
    }
    public void selectPartialDay(){
        partialDay.click();
    }
    public void clickDuration(){
        durationSelect.click();
    }
    public void selectDuration(){
        duartion.click();
    }
    public void selectDate(String fromDate,String toDate){
        fromDateInput.click();
        while(!fromDate.split("-")[1].equals(fromMonth.getText())){
            fromMonthNext.click();
        }
        driver.findElement(By.xpath("//div[@class='oxd-calendar-dates-grid']/div[3]")).click();
        toDateInput.click();
//        while(!toDate.split("-")[1].equals(toMonth.getText())){
//            toMonthNext.click();
//        }
        driver.findElement(By.xpath("//div[@class='oxd-calendar-dates-grid']/div[5]")).click();
    }
}
