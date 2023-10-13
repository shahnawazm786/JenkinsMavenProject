package steps;

import io.cucumber.java.Before;
import org.example.utils.ICommonValue;
import org.example.utils.SeleniumCommonFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
public class Hooks {
    static WebDriver driver;
    @Before
    public void setup(){
        System.setProperty("driver.chrome.webdriver", ICommonValue.CHROME_PATH);
        driver=new ChromeDriver();
        SeleniumCommonFunction.pageImplicitWait(driver);
        driver.get(ICommonValue.WEB_URL);
        SeleniumCommonFunction.WebPageMaximize(driver);
    }
    @After
    public void tearUp(){
        if(driver!=null){
           driver.close();
            //driver.quit();
        }

    }
}
