package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.OrnageHRMSLoginPage;

public class HRMSLoginSteps {
    OrnageHRMSLoginPage loginPage=new OrnageHRMSLoginPage(Hooks.driver);
    @When("user enter username {string} and password {string}")
    public void userEnterUsernameAdminAndPasswordAdmin(String username,String password) {
        loginPage.enterDataInPasswordTextBox(username);
        loginPage.enterDataInPasswordTextBox(password);
    }

    @Then("user should be able to login successfully")
    public void userShouldBeAbleToLoginSuccessfully() {
    loginPage.verifyDashboardLabelAfterSuccessfulLogin();
    }

    @When("user enter username as {string} and password as {string}")
    public void userEnterUsernameAsAndPasswordAs(String userName, String password) {
        loginPage.enterDataInPasswordTextBox(userName);
        loginPage.enterDataInPasswordTextBox(password);
    }

    @Then("user should be able to see the error message {string}")
    public void userShouldBeAbleToSeeTheErrorMessage(String errorMessage) {
        loginPage.verifyErrorMessageforInvalidCredential(errorMessage);

    }

    @And("user click on login button")
    public void userClickOnLoginButton() {

    }
}
