package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.OrangeHRMSHomePage;
import org.openqa.selenium.WebDriver;

public class HomePagedefs {
    WebDriver driver=Hooks.driver;
    OrangeHRMSHomePage orangeHRMSHomePage=new OrangeHRMSHomePage(Hooks.driver);
    @Given("open the orange hrms page")
    public void open_the_orange_hrms_page() {
        System.out.println("Welcome to login page");
        orangeHRMSHomePage.verifyTagName(driver);
    }

    @Then("verify the login name")
    public void verify_the_login_name() {
        System.out.println("Verified the login tag");
        orangeHRMSHomePage.verifyLoginNameDisplayed(driver);
    }

    @When("I verify the username label")
    public void iVerifyTheUsernameLabel() {
    }

    @And("I verify the username text box")
    public void iVerifyTheUsernameTextBox() {
    }

    @When("I verify the password label")
    public void iVerifyThePasswordLabel() {
    }

    @And("I verify the password text box")
    public void iVerifyThePasswordTextBox() {
    }

    @And("I verify the login button")
    public void iVerifyTheLoginButton() {
    }

    @When("I verify the forgot password link")
    public void iVerifyTheForgotPasswordLink() {
    }
}
