package org.example.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumCommonFunction {
    static WebDriverWait wait;
    public static void pageImplicitWait(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ICommonValue.PAGE_TIME_OUT));
    }
    public static WebElement findElement(WebDriver driver, By locator){
        return driver.findElement(locator);
    }
    public static WebElement findElement(WebDriver driver, WebElement element){
        return element;
    }
    public static void waitForElementVisibility(WebDriver driver,WebElement locator){
        wait=new WebDriverWait(driver, Duration.ofSeconds(ICommonValue.ELEMENT_TIME_OUT));
        wait.ignoring(ElementClickInterceptedException.class, ElementNotInteractableException.class)
                .until(ExpectedConditions.visibilityOf(locator));

    }
    public static boolean isElementDisplayed(WebDriver driver,By element){
        return new WebDriverWait(driver,Duration.ofSeconds(ICommonValue.ELEMENT_TIME_OUT))
                .until((WebDriver d)->d.findElement(element).isDisplayed());
    }
    public static boolean isElementDisplayed(WebDriver driver,WebElement element){
        return new WebDriverWait(driver,Duration.ofSeconds(ICommonValue.ELEMENT_TIME_OUT))
                .until((WebDriver d)->element.isDisplayed());
    }
    public static  void WebPageMaximize(WebDriver driver){
        driver.manage().window().maximize();
    }
}
