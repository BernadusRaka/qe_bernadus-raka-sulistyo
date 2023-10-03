package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteValidUser {

    private static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set API endpoint for delete user with valid id")
    public String setApiDeleteEndpoint() {
        return url + "posts/1";
    }

    @Step("I send request to delete user with valid ID")
    public void sendDeleteUserRequest() {

        SerenityRest.given().delete(setApiDeleteEndpoint());
    }

    @Step("I receive status code 200")
    public void receiveStatusCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

}
