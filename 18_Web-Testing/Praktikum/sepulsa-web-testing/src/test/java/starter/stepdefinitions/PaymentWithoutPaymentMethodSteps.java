package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.PaymentWithoutPaymentMethodScenario;
import starter.pages.PickProductScenario;

public class PaymentWithoutPaymentMethodSteps {

    @Steps
    PickProductScenario pickProductScenario;

    @Steps
    PaymentWithoutPaymentMethodScenario paymentWithoutPaymentMethodScenario;

    @And("I must be redirected to the payment page")
    public void paymentPage(){
        pickProductScenario.paymentPageValidation();
    }

    @And("I click \"payment\"")
    public void clickPayment(){
        paymentWithoutPaymentMethodScenario.paymentConfirm();
    }


    @Then("I see error message {string}")
    public void validErrorMessageIsDisplayed(String message){
        Assertions.assertTrue(paymentWithoutPaymentMethodScenario.validateErrorMessageIsDisplayed());
        Assertions.assertTrue(paymentWithoutPaymentMethodScenario.validateEqualErrorMessage(message));
    }
}
