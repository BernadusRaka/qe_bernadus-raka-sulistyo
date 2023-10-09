package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPageScenario extends PageObject {

    private By usernameField() {
        return By.id("user-name");
    }
    private By passwordField() {
        return By.id("password");
    }
    private By loginButton() {
        return By.id("login-button");
    }

    @Step
    public boolean validateLoginPage(){
        return $(loginButton()).isDisplayed();
    }

    @Step
    public void openLoginPage(){
        open();
    }
    @Step
    public void inputValidUsername(String username){
        $(usernameField()).type(username);
    }
    @Step
    public void inputValidPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLogin(){
        $(loginButton()).click();
    }


    @Step
    public boolean validateErrorMessageIsDisplayed() {
        return $(errorMessage()).isDisplayed();
    }

    @Step
    public boolean validateEqualErrorMessage(String message) {
        return $(errorMessage()).getText().equalsIgnoreCase(message);
    }

    private By errorMessage() {
        return By.xpath("//h3[@data-test='error']");
    }
}
