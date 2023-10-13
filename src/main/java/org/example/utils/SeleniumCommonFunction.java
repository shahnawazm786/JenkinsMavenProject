package org.example.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumCommonFunction {
    public static WebElement findElement(WebDriver driver, By locator){
        return driver.findElement(locator);
    }

}
