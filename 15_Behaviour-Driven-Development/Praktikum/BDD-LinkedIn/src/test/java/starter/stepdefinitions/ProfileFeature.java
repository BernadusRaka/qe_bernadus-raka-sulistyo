package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileFeature {

    @When("I clicks on the profile picture")
    public void openProfile(){
    }

    @Then("I should be taken to their own profile page")
    public void pageProfile() {
    }

    @And("I should be able to edit their profile information")
    public void editProfile() {
    }

}
