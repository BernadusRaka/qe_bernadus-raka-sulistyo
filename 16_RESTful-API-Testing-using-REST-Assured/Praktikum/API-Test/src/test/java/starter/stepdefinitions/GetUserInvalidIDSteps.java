package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetUserInvalidID;

public class GetUserInvalidIDSteps {
    @Steps
    GetUserInvalidID getUserInvalidID;

    @Given("I set API endpoint with an invalid ID")
    public void setApiEndInvalidId(){
        getUserInvalidID.setApiEndInvalidId();
    }

    @When("I send request using invalid ID")
    public void sendRequestInvalidId(){
        getUserInvalidID.sendRequestInvalidId();
    }

    @Then("I receive error message and \"404 Not Found\" response")
    public void receive404(){
        getUserInvalidID.receive404();
    }
}
