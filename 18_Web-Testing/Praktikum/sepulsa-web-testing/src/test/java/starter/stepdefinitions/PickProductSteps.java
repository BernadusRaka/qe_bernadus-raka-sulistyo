package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.HomePageScenario;
import starter.pages.PickProductScenario;

public class PickProductSteps {

    @Steps
    PickProductScenario pickProductScenario;
    HomePageScenario homePageScenario;

    @And("I must be redirected to the home page")
    public void validateOnHomePage(){
        Assertions.assertTrue(homePageScenario.validateOnHomePage());
    }

    @When("I click \"Pulsa\"")
    public void productPage(){
        pickProductScenario.pickProduct();
    }

    @And("I fill the form with my phone number")
    public void phoneNumber(){
        pickProductScenario.phoneNumber("081323882059");
    }

    @And("I choose \"Rp 5000\"")
    public void pricePulsa(){
        pickProductScenario.pricePulsa();
    }

    @Then("I should be redirected to the payment page")
    public void paymentPage(){
        pickProductScenario.paymentPageValidation();
    }
}
