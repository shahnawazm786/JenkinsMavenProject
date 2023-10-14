package org.example.pages;

import org.example.utils.SeleniumCommonFunction;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMSHomePage {
    WebDriver driver;
    public OrangeHRMSHomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    //By loginH5=By.tagName("h5");
    @FindBy(how = How.TAG_NAME,using="h5")
    private WebElement loginH5;
    @FindBy(how=How.XPATH,using="(//p[@class='oxd-text oxd-text--p'])[1]")
    private WebElement pLoginName;
    By userNameLabel=By.xpath(ILocator.userNameLabelByXpath);
    By userNameTextBox=By.name(ILocator.userNameTextBoxByName);
    By passwordLabel=By.xpath(ILocator.passwordLabelByXpath);
    By passwordTextBox=By.name(ILocator.passwordTextBoxByName);
    By loginButton=By.xpath(ILocator.loginButtonByXpath);
    By forgotPasswordLink=By.xpath(ILocator.forgotPasswordLinkByXpath);
    By iconLinkedIn=By.xpath(ILocator.iconLinkedInByXpath);
    By iconFacBook=By.xpath(ILocator.iconFaceBookByXpath);
    By iconTwitter=By.xpath(ILocator.iconTwitterByXpath);
    By iconYoutube=By.xpath(ILocator.iconYoutubeByXpath);

    public void verifyTagName(WebDriver driver){
        Assert.assertTrue(SeleniumCommonFunction.isElementDisplayed(driver,loginH5));
        //SeleniumCommonFunction.findElement(driver, loginH5);
    }
    public void verifyLoginNameDisplayed(WebDriver driver){
        boolean isDisplayed = SeleniumCommonFunction.isElementDisplayed(driver, pLoginName);
        Assert.assertTrue(isDisplayed);
    }
    public void verifyUserNameLabelDisplayed(WebDriver driver){
        Assert.assertTrue(SeleniumCommonFunction.isElementDisplayed(driver,userNameLabel));
    }
    public void verifyUserNameTextDisplayed(WebDriver driver){
        Assert.assertTrue(SeleniumCommonFunction.isElementDisplayed(driver,userNameTextBox));
    }
    public void verifyPasswordLabel(WebDriver driver){
        Assert.assertTrue(SeleniumCommonFunction.isElementDisplayed(driver,passwordLabel));
    }
    public void verifyPasswordTextBox(WebDriver driver){
        Assert.assertTrue(SeleniumCommonFunction.isElementDisplayed(driver,passwordTextBox));
    }
    public void verifyLoginButton(WebDriver driver){
        Assert.assertTrue(SeleniumCommonFunction.isElementDisplayed(driver,loginButton));
    }
    public void verifyForgotPasswordLink(WebDriver driver){
        Assert.assertTrue(SeleniumCommonFunction.isElementDisplayed(driver,forgotPasswordLink));
    }
}
