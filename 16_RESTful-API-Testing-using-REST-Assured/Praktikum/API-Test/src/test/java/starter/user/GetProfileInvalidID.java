package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetProfileInvalidID {
    private static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set API endpoint with an invalid ID to get user profile")
    public String setApiGetEndInvalidIdProfile(){

        return url + "users/999";
    }

    @Step("I send request to get user profile using invalid ID")
    public void sendGetRequestInvalidIdProfile(){
        SerenityRest.given().get(setApiGetEndInvalidIdProfile());
    }
}
