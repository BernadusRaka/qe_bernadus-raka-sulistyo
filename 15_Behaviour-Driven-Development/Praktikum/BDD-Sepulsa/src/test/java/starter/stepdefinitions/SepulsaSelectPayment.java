package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SepulsaSelectPayment {
    @When("I choose the \"Guest\" payment mode")
    public void guestPayment(){
    }

    @And("I proceed with payment without providing buyer details")
    public void outDetailPayment() {
    }

    @Then("I should be able to complete the payment")
    public void completePayment() {
    }

    @And("I apply a promo code without logging in with a registered account")
    public void loginPromo() {
    }

    @Then("I should be able to complete the payment with the applied promo")
    public void completePromo() {
    }

    @And("I enter an invalid email address")
    public void enterInvEmail() {
    }

    @And("I proceed with payment")
    public void proceedPayment() {
    }

    @Then("I should see an error message indicating an invalid email")
    public void errorMessage() {
    }

    @And("I enter a valid email address")
    public void validEmail() {
    }

    @And("I enter an email address that is already registered")
    public void regEmail() {
    }

    @Given("I am logged in with my account")
    public void loginPayment() {
    }

    @When("I choose to continue with the payment")
    public void contPayment() {
    }

    @And("I apply an invalid promo code")
    public void invPromo() {
    }

    @Then("I should see an error message indicating an invalid promo code")
    public void errorInvPromo() {
    }

    @And("I should not be able to complete the payment")
    public void cantPromo() {
    }

    @And("I apply a valid promo code")
    public void validPromo() {
    }

    @And("I select a payment method other than those available on the initial page")
    public void initPage() {
    }

    @Then("I should be able to complete the payment using the selected method")
    public void compMethod() {
    }

    @When("I choose to view the payment details")
    public void detailPayment() {
    }

    @Then("I should be able to see the details of my payment before completing it")
    public void seeDetailPayment() {
    }
}
