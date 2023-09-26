package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JobsFeature {
    @When("I clicks on \"Jobs\"")
    public void clickJobs(){
    }

    @Then("I should be taken to the \"Jobs\" page")
    public void pageJobs(){
    }

    @And("I should be able to search for job listings")
    public void searchJobs(){
    }

    @And("I should be able to view job details and apply for jobs")
    public void detailsJobs(){
    }

}
