package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.CreateNewUser;

public class CreateNewUserSteps {

    @Steps
    CreateNewUser createNewUserSteps;

    @Given("I set API endpoint for create new user")
    public void setApiNewUser() {
        createNewUserSteps.setApiNewUser();
    }


    @And("I receive valid data for create new user")
    public void receiveValidDataForCreateNewUser(String id, String userId, String title, String body) {
        createNewUserSteps.receiveValidDataForCreateNewUser(id, userId, title, body);
    }

    @When("I send request to fill user data with valid id {string}, userId {string}, title {string}, and body {string}")
    public void sendCreateUserRequest(String id, String userId, String title, String body) {
        createNewUserSteps. sendCreateUserRequest(id, userId, title, body);
    }
}
