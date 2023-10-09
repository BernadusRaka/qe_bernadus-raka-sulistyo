package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPageScenario extends PageObject {

    private By usernameField() {
        return By.id("email");
    }
    private By passwordField() {
        return By.id("password");
    }
    private By loginButton() {
        return By.id("submit_login");
    }
    private By loginButtonHomePage() {
        return By.id("button_signin_home");
    }

    @Step
    public boolean validateHomePage(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return $(loginButtonHomePage()).isDisplayed();
    }

    public void goToLoginPage(){
        $(loginButtonHomePage()).click();
    }

    @Step
    public void inputValidEmail(String email){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        $(usernameField()).type(email);
    }
    @Step
    public void inputValidPassword(String password){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        $(passwordField()).type(password);
    }

    @Step
    public void clickLogin(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        $(loginButton()).click();
    }
}
