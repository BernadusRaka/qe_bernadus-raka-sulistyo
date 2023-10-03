package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetProfileByID;

public class GetProfileByIDSteps {
    @Steps
    GetProfileByID getProfileByID;

    @Given("I set API endpoint to get complete user profile")
    public void setApiEndProfile(){
        getProfileByID.setApiEndProfile();
    }

    @When("I send request to get user profile")
    public void sendUserRequest(){
        getProfileByID.sendRequestProfile();
    }

    @And("I receive complete user profile")
    public void receiveValidProfile(){
        getProfileByID.receiveValidProfile();
    }
}
