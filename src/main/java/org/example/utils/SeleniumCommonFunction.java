package org.example.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumCommonFunction {
    static WebDriverWait wait;

    /**
     * @param driver
     */
    public static void pageImplicitWait(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ICommonValue.PAGE_TIME_OUT));
    }
    public static WebElement findElement(WebDriver driver, By locator){
        return driver.findElement(locator);
    }

    /**
     * @param driver
     * @param element
     * @return
     */
    public static WebElement findElement(WebDriver driver, WebElement element){
        return element;
    }

    /**
     * @param driver
     * @param locator
     */
    public static WebElement waitForElementVisibility(WebDriver driver,WebElement locator){
        wait=new WebDriverWait(driver, Duration.ofSeconds(ICommonValue.ELEMENT_TIME_OUT));
        wait.ignoring(ElementClickInterceptedException.class, ElementNotInteractableException.class)
                .until(ExpectedConditions.visibilityOf(locator));
        return locator;

    }
    public static WebElement waitForElementVisibility(WebDriver driver,By locator){
        wait=new WebDriverWait(driver, Duration.ofSeconds(ICommonValue.ELEMENT_TIME_OUT));
        wait.ignoring(ElementClickInterceptedException.class, ElementNotInteractableException.class)
                .until(ExpectedConditions.and(
                        ExpectedConditions.visibilityOfElementLocated(locator),
                        ExpectedConditions.presenceOfAllElementsLocatedBy(locator)
                ));
                return driver.findElement(locator);
    }

    /**
     * @param driver
     * @param element
     * @return
     */
    public static boolean isElementDisplayed(WebDriver driver,By element){
        return new WebDriverWait(driver,Duration.ofSeconds(ICommonValue.ELEMENT_TIME_OUT))
                .until((WebDriver d)->d.findElement(element).isDisplayed());
    }

    /**
     * @param driver
     * @param element
     * @return
     */
    public static boolean isElementDisplayed(WebDriver driver,WebElement element){
        return new WebDriverWait(driver,Duration.ofSeconds(ICommonValue.ELEMENT_TIME_OUT))
                .until((WebDriver d)->element.isDisplayed());
    }

    /**
     * @param driver
     */
    public static  void WebPageMaximize(WebDriver driver){
        driver.manage().window().maximize();
    }

    /**
     * @param driver
     * @param locator
     * @param keys
     */
    public static void SendKeys(WebDriver driver,By locator,String keys){
        wait=new WebDriverWait(driver,Duration.ofSeconds(ICommonValue.ELEMENT_TIME_OUT));
        wait.until(ExpectedConditions.and
                (ExpectedConditions.visibilityOfElementLocated(locator)
                ,(ExpectedConditions.elementToBeClickable(locator))
        ));
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(keys);
    }

    /**
     * @param driver
     */
    public static void WaitTillLoading(WebDriver driver)
    {
        wait=new WebDriverWait(driver,Duration.ofSeconds(ICommonValue.ELEMENT_TIME_OUT));
    }
    public static String getText(WebDriver driver, By locator){
        wait=new WebDriverWait(driver,Duration.ofSeconds(ICommonValue.ELEMENT_TIME_OUT));
        wait.until(ExpectedConditions.and
                (ExpectedConditions.visibilityOfElementLocated(locator)
                        ,(ExpectedConditions.elementToBeClickable(locator))
                ));
        return driver.findElement(locator).getText();
    }
}
