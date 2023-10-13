package org.example.pages;

import org.example.utils.SeleniumCommonFunction;
import org.junit.Assert;
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
    public void verifyTagName(WebDriver driver){
        Assert.assertTrue(SeleniumCommonFunction.isElementDisplayed(driver,loginH5));
        //SeleniumCommonFunction.findElement(driver, loginH5);
    }
    public void verifyLoginNameDisplayed(WebDriver driver){
        boolean isDisplayed = SeleniumCommonFunction.isElementDisplayed(driver, pLoginName);
        Assert.assertTrue(isDisplayed);
    }
}
