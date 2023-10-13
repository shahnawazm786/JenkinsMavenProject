package org.example.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeleniumCommonFunction {
    public static WebElement findElement(WebDriver driver, By locator){
        return driver.findElement(locator);
    }
    public static WebElement findElement(WebDriver driver, WebElement element){
        return element;
    }
    public static void waitForElementVisiblity(WebDriver driver){

    }
}
