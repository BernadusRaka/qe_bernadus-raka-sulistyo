package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetUserInvalidID {
    private static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set API endpoint with an invalid ID")
    public String setApiEndInvalidId(){
        return url + "posts/999";
    }

    @Step("I send request using invalid ID")
    public void sendRequestInvalidId(){
        SerenityRest.given().get(setApiEndInvalidId());
    }

    @Step("I receive error message and \"404 Not Found\" response")
    public void receive404() {
        restAssuredThat(response -> response.statusCode(404));
    }

}
