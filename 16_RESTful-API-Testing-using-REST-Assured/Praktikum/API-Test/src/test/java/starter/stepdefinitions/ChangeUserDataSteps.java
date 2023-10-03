package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.user.ChangeUserData;

public class ChangeUserDataSteps {

    @Steps
    ChangeUserData changeUserData;

    @Given("I set API endpoint for change user data")
    public void setApiChangeUser(){
        changeUserData.setApiChangeUser();
    }

    @Then("I receive valid data for changed user data")
    public void changeDataUser(String id, String userId, String title, String body){
        changeUserData.changeDataUser(id, userId, title, body);
    }
}
