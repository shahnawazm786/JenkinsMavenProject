package steps;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.example.utils.ICommonValue;
import org.example.utils.SeleniumCommonFunction;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
    @AfterStep
    public void addScreenShot(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

        }
    }

}
