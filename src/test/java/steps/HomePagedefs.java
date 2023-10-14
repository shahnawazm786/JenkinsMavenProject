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
        orangeHRMSHomePage.verifyUserNameLabelDisplayed(driver);
    }

    @And("I verify the username text box")
    public void iVerifyTheUsernameTextBox() {
        orangeHRMSHomePage.verifyUserNameTextDisplayed(driver);
    }

    @When("I verify the password label")
    public void iVerifyThePasswordLabel() {
        orangeHRMSHomePage.verifyPasswordLabel(driver);
    }

    @And("I verify the password text box")
    public void iVerifyThePasswordTextBox() {
        orangeHRMSHomePage.verifyPasswordTextBox(driver);
    }

    @And("I verify the login button")
    public void iVerifyTheLoginButton() {
        orangeHRMSHomePage.verifyLoginButton(driver);
    }

    @When("I verify the forgot password link")
    public void iVerifyTheForgotPasswordLink() {
        orangeHRMSHomePage.verifyForgotPasswordLink(driver);
    }

    @When("I verify linkedin icon")
    public void iVerifyLinkedinIcon() {
        orangeHRMSHomePage.verifyIconLinkedInDisplayed(driver);
    }

    @And("I verify facebook icon")
    public void iVerifyFacebookIcon() {
        orangeHRMSHomePage.verifyIconFaceBookDisplayed(driver);
    }

    @And("I verify twitter icon")
    public void iVerifyTwitterIcon() {
        orangeHRMSHomePage.verifyIconTwitterDisplayed(driver);
    }

    @And("I verify youtube icon")
    public void iVerifyYoutubeIcon() {
        orangeHRMSHomePage.verifyIconYoutubeDisplayed(driver);
    }
}
