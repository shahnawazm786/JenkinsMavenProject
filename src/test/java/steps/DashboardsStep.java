package steps;

import io.cucumber.java.en.When;

public class DashboardsStep {
    @When("I verify the user dashboard")
    public void iVerifyTheUserDashboard() {
        System.out.println("User dashboard");
    }
}
