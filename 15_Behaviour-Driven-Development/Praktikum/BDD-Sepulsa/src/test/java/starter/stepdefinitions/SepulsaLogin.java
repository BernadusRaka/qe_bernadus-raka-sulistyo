package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SepulsaLogin {

    @Given("I am on the login page")
    public void loginPage() {
    }


    @When("I enter my valid username \"myusername\" and password \"mypassword\"")
    public void validLogin() {
    }

    @And("I click the \"Login\" button")
    public void clickLogin() {
    }

    @Then("I should be logged in successfully")
    public void successLogin() {
    }


    @When("I enter my invalid username \"invaliduser\" and password \"wrongpass\"")
    public void invUserLogin() {
    }


    @Then("I should see an error message \"Invalid username or password\"")
    public void errorLogin() {
    }

    @When("I click the \"Forgot Password\" link")
    public void clickForgot() {
    }

    @Then("I should be redirected to the password reset page")
    public void resetLogin() {
    }

    @When("I enter my valid username \"myusername\" and password \"lockedpassword\"")
    public void validCred() {
    }

    @Then("I should see an error message")
    public void cantLogin() {
    }

    @When("I enter my valid username \"myusername\" and password \"inactivepass\"")
    public void invPassword() {
    }

    @When("I choose to log in as a guest")
    public void guestLogin() {
    }

    @Then("I should be logged in as a guest user")
    public void guestUser() {
    }


    @And("I click the eye button")
    public void eyeButton() {
    }

    @Then("I should see my password displayed in plain text")
    public void plainPassword() {
    }

}
