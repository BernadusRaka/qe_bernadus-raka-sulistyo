package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyNetworkFeature {


    @Given("I is logged in to my LinkedIn account")
    public void userLoggedIn (){
    }

    @And("I does not have LinkedIn Premium")
    public void nonPremium(){
    }

    @And("I should see suggestions for connecting with other LinkedIn members")
    public void suggestNetwork(){
    }

    @And("I should be able to send connection requests")
    public void connectNetwork(){
    }

    @When("I clicks on \"My Network\"")
    public void clickNetwork() {
    }

    @Then("I should be taken to the \"My Network\" pages")
    public void pageNetwork() {
    }
}
