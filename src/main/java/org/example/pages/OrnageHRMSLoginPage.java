package org.example.pages;

import org.example.utils.SeleniumCommonFunction;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class OrnageHRMSLoginPage {
    WebDriver driver;
    public OrnageHRMSLoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    // Locator
    By userNameTextBoxByName =By.name(ILocator.userNameTextBoxByName);
    By passwordTextBoxByName=By.name(ILocator.passwordTextBoxByName);
    By loginButtonByXpath=By.xpath(ILocator.loginButtonByXpath);
    By errorMessageLabelXpath=By.xpath(ILocator.errorMessageLabelXpath);
    By dashboardLabelXpath=By.xpath(ILocator.dashboardLabelXpath);
    By LoginButtonByXpath=By.xpath(ILocator.loginButtonByXpath);

    public void enterDataInUserNameTextBox(){
        SeleniumCommonFunction.waitForElementVisibility(driver, userNameTextBoxByName);
        SeleniumCommonFunction.SendKeys(driver,userNameTextBoxByName,"Admin");
    }

    public void enterDataInUserNameTextBox(String userName){
        SeleniumCommonFunction.waitForElementVisibility(driver, userNameTextBoxByName);
        SeleniumCommonFunction.SendKeys(driver,userNameTextBoxByName,userName);
    }
    public void enterDataInPasswordTextBox(){
        SeleniumCommonFunction.waitForElementVisibility(driver, passwordTextBoxByName);
        SeleniumCommonFunction.SendKeys(driver,passwordTextBoxByName,"admin123");
    }
    public void enterDataInPasswordTextBox(String password){
        SeleniumCommonFunction.waitForElementVisibility(driver, passwordTextBoxByName);
        SeleniumCommonFunction.SendKeys(driver,passwordTextBoxByName,password);
    }
    public void verifyErrorMessageLabelDisplayed(){
        Assert.assertTrue(SeleniumCommonFunction.isElementDisplayed(driver,errorMessageLabelXpath));
    }
    public void verifyErrorMessageforInvalidCredential(String errorMessagge){
    String actualMessage=SeleniumCommonFunction.getText(driver,errorMessageLabelXpath);
    Assert.assertEquals(errorMessagge,actualMessage);
    }
    public void verifyDashboardLabelAfterSuccessfulLogin(){
        SeleniumCommonFunction.isElementDisplayed(driver,dashboardLabelXpath);
    }
    public void clickLoginButton(){
        SeleniumCommonFunction.waitForElementVisibility(driver,loginButtonByXpath);

    }
}
