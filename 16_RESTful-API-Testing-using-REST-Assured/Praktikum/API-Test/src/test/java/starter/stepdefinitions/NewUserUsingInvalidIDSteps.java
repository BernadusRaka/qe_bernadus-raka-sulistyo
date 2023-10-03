package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.NewUserUsingInvalidID;

public class NewUserUsingInvalidIDSteps {
    @Steps
    NewUserUsingInvalidID newUserUsingInvalidID;

    @Given("I set API endpoint for create new invalid user")
    public void setApiInvalid(){

        newUserUsingInvalidID.setApiInvalid();
    }

    @When("I send request to create user with empty body")
    public void sendInvalidRequest(){
        newUserUsingInvalidID.sendInvalidRequest();
    }


}
