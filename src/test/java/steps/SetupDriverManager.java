package steps;

import org.example.utils.ICommonValue;
import org.example.utils.SeleniumCommonFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SetupDriverManager {
     WebDriver driver;
    public WebDriver setDriver(String browserName){
        //System.out.println(EBrowserName.CHROME);
        //System.out.println(browserName.equalsIgnoreCase(String.valueOf(EBrowserName.CHROME)));
        if(browserName.toUpperCase().equals(String.valueOf(EBrowserName.CHROME))){
            System.setProperty("driver.chrome.webdriver", ICommonValue.CHROME_PATH);
            driver=new ChromeDriver();
            SeleniumCommonFunction.pageImplicitWait(driver);
            driver.get(ICommonValue.WEB_URL);
            SeleniumCommonFunction.WebPageMaximize(driver);

        } else if(browserName.toUpperCase().equals(EBrowserName.FIREFOX)){
            driver=new FirefoxDriver();
        }
        else if(browserName.toUpperCase().equals(EBrowserName.EDGE)){
            driver=new EdgeDriver();
        }
        else if(browserName.toUpperCase().equals(EBrowserName.SAFARI)){
            driver=new SafariDriver();
        }else if(browserName.toUpperCase().equals(EBrowserName.INTERNET_EXPLORER)){
            driver=new InternetExplorerDriver();
        }

        return driver;
    }
}
