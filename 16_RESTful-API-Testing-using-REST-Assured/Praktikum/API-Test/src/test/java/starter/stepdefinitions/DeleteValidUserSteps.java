package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DeleteValidUserSteps {
    @Steps
    DeleteValidUserSteps deleteValidUser;

    @Given("I set API endpoint for delete user with valid id")
    public void setDeleteValidUserSteps(){

        deleteValidUser.setDeleteValidUserSteps();
    }

    @When("I send request to delete user with valid ID")
    public void sendDeleteUserRequest(){
        deleteValidUser.sendDeleteUserRequest();
    }

    @Then("I receive status code 200")
    public void receiveStatusCode200(){
        deleteValidUser.receiveStatusCode200();
    }
}
