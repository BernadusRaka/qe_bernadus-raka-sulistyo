package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NotificationFeature {

    @When("I clicks on \"Notifications\"")
    public void myNotif(){
    }

    @Then("I should be taken to the \"Notifications\" page")
    public void pageNotif() {
    }

    @And("I should see notifications related to their network and activity")
    public void networkNotif() {
    }
}
