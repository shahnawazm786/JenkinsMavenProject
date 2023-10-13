package org.example.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumCommonFunction {
    static WebDriverWait wait;
    public static WebElement findElement(WebDriver driver, By locator){
        return driver.findElement(locator);
    }
    public static WebElement findElement(WebDriver driver, WebElement element){
        return element;
    }
    public static void waitForElementVisibility(WebDriver driver,WebElement locator){
        wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.ignoring(ElementClickInterceptedException.class, ElementNotInteractableException.class)
                .until(ExpectedConditions.visibilityOf(locator));

    }
    public static boolean isElementDisplayed(WebDriver driver,By element){
        return new WebDriverWait(driver,Duration.ofSeconds(20))
                .until((WebDriver d)->d.findElement(element).isDisplayed());
    }
}
