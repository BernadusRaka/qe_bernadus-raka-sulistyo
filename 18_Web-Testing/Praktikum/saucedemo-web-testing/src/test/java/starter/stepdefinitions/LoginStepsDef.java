package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.HomePageScenario;
import starter.pages.LoginPageScenario;

public class LoginStepsDef {

    @Steps
    LoginPageScenario loginPageScenario;
    @Steps
    HomePageScenario homePageScenario;

//    @Given("I am on the login page")
//    public void onTheLoginPage() {
//        loginPageScenario.openLoginPage();
//        loginPageScenario.validateLoginPage();
//    }
    @Given("I am on the login page")
    public void onTheLoginPage() {
        loginPageScenario.openUrl("https://www.saucedemo.com/");
        Assertions.assertTrue(loginPageScenario.validateLoginPage());
    }

    @When("I fill the form with valid username")
    public void inputValidUsername() {
        loginPageScenario.inputValidUsername("standard_user");
    }

    @When("I fill the form with locked username")
    public void inputLockedUsername() {
        loginPageScenario.inputValidUsername("locked_out_user");
    }

    @And("I fill the form with valid password")
    public void inputValidPassword(){
        loginPageScenario.inputValidPassword("secret_sauce");
    }

    @And("I click on the \"Login\" button")
    public void clickLogin(){
        loginPageScenario.clickLogin();

    }

    @Then("I should be redirected to the home page")
    public void validateOnHomePage(){
        Assertions.assertTrue(homePageScenario.validateOnHomePage());
    }

    @Then("I received error message {string}")
    public void validErrorMessageIsDisplayed(String message) {
        Assertions.assertTrue(loginPageScenario.validateErrorMessageIsDisplayed());
        Assertions.assertTrue(loginPageScenario.validateEqualErrorMessage(message));
    }
}
