package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePageScenario extends PageObject {

    private By title(){
        return By.className("title");
    }
    private By addProductToCartButton() {
        return By.id("add-to-cart-sauce-labs-backpack");
    }

    private By cartCount() {
        return By.className("shopping_cart_badge");
    }

    @Step
    public boolean validateOnHomePage(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       return $(title()).isDisplayed();
    }

    @Step
    public boolean addProductToCartButtonIsDisplayed() {
        return $(addProductToCartButton()).isDisplayed();
    }

    @Step
    public void clickAddToCartButton() {
        $(addProductToCartButton()).click();
    }

    @Step
    public boolean validateCartCountIsDisplayed() {
        return $(cartCount()).isDisplayed();
    }

    @Step
    public boolean validateCartCount() {
        return $(cartCount()).getText().equals("1");
    }
}
