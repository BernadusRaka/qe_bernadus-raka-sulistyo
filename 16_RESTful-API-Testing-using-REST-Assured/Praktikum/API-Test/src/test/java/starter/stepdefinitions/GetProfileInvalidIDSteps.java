package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetProfileInvalidID;


public class GetProfileInvalidIDSteps {

    @Steps
    GetProfileInvalidID getProfileInvalidID;

    @Given("I set API endpoint with an invalid ID to get user profile")
    public void setApiGetEndInvalidIdProfile(){

        getProfileInvalidID.setApiGetEndInvalidIdProfile();
    }

    @When("I send request to get user profile using invalid ID")
    public void sendGetRequestInvalidIdProfile(){
        getProfileInvalidID.setApiGetEndInvalidIdProfile();
    }

}
