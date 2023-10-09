package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.HomePageScenario;
import starter.pages.LoginPageScenario;

public class LoginSteps {

    @Steps
    LoginPageScenario loginPageScenario;
    @Steps
    HomePageScenario homePageScenario;

    @Given("I am on the home page")
    public void onTheLoginPage() {
        loginPageScenario.openUrl("https://www.sepulsa.com/");
        Assertions.assertTrue(loginPageScenario.validateHomePage());
    }

    @When("I click on the \"Login\" button in home page")
    public void clickOnTheButtonInHomePage() {
        loginPageScenario.goToLoginPage();
    }

    @When("I fill the form with valid email")
    public void inputValidEmail() {
        loginPageScenario.inputValidEmail("bernadusraka@mail.ugm.ac.id");
    }

    @And("I fill the form with valid password")
    public void inputValidPassword(){
        loginPageScenario.inputValidPassword("Bigbang4ever");
    }

    @And("I click on the \"Login\" button")
    public void clickLogin(){
        loginPageScenario.clickLogin();

    }

    @Then("I should be redirected to the home page")
    public void validateOnHomePage(){
        Assertions.assertTrue(homePageScenario.validateOnHomePage());
    }
}
