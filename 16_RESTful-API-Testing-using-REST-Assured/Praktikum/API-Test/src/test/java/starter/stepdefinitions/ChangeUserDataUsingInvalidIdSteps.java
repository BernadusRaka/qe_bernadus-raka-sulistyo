package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import starter.user.ChangeUserDataUsingInvalidId;

public class ChangeUserDataUsingInvalidIdSteps {

    @Steps
    ChangeUserDataUsingInvalidId changeUserDataUsingInvalidId;

    @Given("I set API endpoint for change user data using invalid id")
    public void changeInvalidId(){
        changeUserDataUsingInvalidId.changeInvalidId();
    }
}
