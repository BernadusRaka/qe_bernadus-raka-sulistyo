package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PickProductScenario extends PageObject {

    private By ProductPulsa(){
        return By.id("Pulsa");
    }

    @Step
    public void pickProduct(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        $(ProductPulsa()).click();
    }

    private By fillPhoneNumber(){
        return By.id("phone_number");
    }
    @Step
    public void phoneNumber(String Phone){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        $(fillPhoneNumber()).type(Phone);
    }

    private By clickPulsa(){
        return By.id("Telkomsel Rp5.000");
    }
    @Step
    public void pricePulsa(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        $(clickPulsa()).click();
    }

    private By validatePaymentPage(){
        return By.id("submit_payment");
    }
    @Step
    public void paymentPageValidation(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        $(validatePaymentPage()).isDisplayed();
    }
}
