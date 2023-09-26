package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MessagingFeature {

    @When("I clicks on \"Messaging\"")
    public void openMessaging(){
    }

    @Then("I should be taken to the \"Messaging\" page")
    public void pageMessaging(){
    }

    @And("I should be able to send and receive messages to and from connections")
    public void sendMessage() {
    }

    @And("I should be able to start new conversations")
    public void talkMessage(){
    }



}
