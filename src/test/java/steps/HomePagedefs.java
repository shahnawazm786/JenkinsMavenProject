package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePagedefs {
    @Given("open the orange hrms page")
    public void open_the_orange_hrms_page() {
        System.out.println("Welcome to login page");
    }

    @Then("verify the login name")
    public void verify_the_login_name() {
        System.out.println("Verified the login tag");
    }
}
