package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.DeleteInvalidUser;

public class DeleteInvalidUserSteps {

    @Steps
    DeleteInvalidUser deleteInvalidUser;

    @Given("I set API endpoint for delete user with invalid id")
    public void setApiDeleteInvalid(){
        deleteInvalidUser.setApiDeleteInvalid();
    }

    @When("I send request to delete user with invalid ID")
    public void sendRequestDeleteInvalid(){
        deleteInvalidUser.sendRequestDeleteInvalid();
    }
}
