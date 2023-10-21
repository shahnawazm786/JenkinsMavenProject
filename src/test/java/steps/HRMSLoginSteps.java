package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMSLoginSteps {
    @When("user enter username {string} and password {string}")
    public void userEnterUsernameAdminAndPasswordAdmin(String username,String password) {
    }

    @Then("user should be able to login successfully")
    public void userShouldBeAbleToLoginSuccessfully() {
        
    }

    @When("user enter username as {string} and password as {string}")
    public void userEnterUsernameAsAndPasswordAs(String arg0, String arg1) {
        
    }

    @Then("user should be able to see the error message {string}")
    public void userShouldBeAbleToSeeTheErrorMessage(String arg0) {
    }
}
