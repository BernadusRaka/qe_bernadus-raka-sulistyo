package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.HomePageScenario;

public class CartStepsDef {
    @Steps
    HomePageScenario homePageScenario;

    @When("I add item to the cart")
    public void addItemToTheCart() {
        Assertions.assertTrue(homePageScenario.addProductToCartButtonIsDisplayed());
        homePageScenario.clickAddToCartButton();
    }

    @Then("Product is added to the cart")
    public void productAddedToCart(){
        Assertions.assertTrue(homePageScenario.validateCartCountIsDisplayed());
        Assertions.assertTrue(homePageScenario.validateCartCount());

    }
}
