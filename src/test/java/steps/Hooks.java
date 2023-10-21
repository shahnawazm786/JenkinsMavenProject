package steps;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
public class Hooks {
    static WebDriver driver;
    @Before
    public void setup(){
        driver=new SetupDriverManager().setDriver(System.getProperty("browser"));
        }
    @After
    public void tearUp(){
        if(driver!=null){
           //driver.close();
            driver.quit();
        }
    }
    /*@After
    public void addScreenShot(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

        }
    }*/

}
