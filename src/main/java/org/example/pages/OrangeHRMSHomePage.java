package org.example.pages;

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
    public void verifyTagName(){

    }

}
