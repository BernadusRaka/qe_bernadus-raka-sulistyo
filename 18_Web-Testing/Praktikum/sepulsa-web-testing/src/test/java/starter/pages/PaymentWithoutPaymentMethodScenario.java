package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaymentWithoutPaymentMethodScenario extends PageObject {

    private By clickPayment(){
        return By.id("submit_payment");
    }
    @Step
    public void paymentConfirm(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        $(clickPayment()).click();
    }

    private By iReceiveErrorMessage(){
        return By.id("error_select_payment");
    }
    @Step
    public boolean validateErrorMessageIsDisplayed(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return $(iReceiveErrorMessage()).isDisplayed();
    }
    @Step
    public boolean validateEqualErrorMessage(String message) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return $(iReceiveErrorMessage()).getText().equalsIgnoreCase(message);
    }

}
