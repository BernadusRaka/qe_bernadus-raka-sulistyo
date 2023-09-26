package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContentFeature {

    @When("I can selects content type")
    public void selectContent(){
    }


    @Then("The post should be created and visible in the user's feed")
    public void postContent() {
    }


    @Then("I redirected to \"upload media\" page")
    public void pageMediaContent() {
    }

    @And("I fills in the event details")
    public void fillEventContent() {
    }

    @Then("the event \"My Networking Event\" should be created")
    public void createdEventContent() {
    }

    @And("I should be redirected to the event page")
    public void pageEventContent() {
    }

    @And("the event details should be accurate")
    public void detailsEventContent() {
    }

    @Then("I redirected to \"upload from computer\" page")
    public void uploadArticleContent() {
    }

    @When("I clicks on \"Create Post\"")
    public void createContent() {
    }


    @And("I clicks on \"Post\"")
    public void uploadContent() {
    }

    @When("I clicks on \"Media\"")
    public void clickMedia() {
    }

    @When("I clicks on \"Event\"")
    public void clickEvent() {
    }


    @And("I clicks on \"Create\"")
    public void createEvent() {
    }

    @When("I clicks on \"Article\"")
    public void clickArticle() {
    }
}
