package starter.user;


import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.core.IsEqual.equalTo;

public class GetProfileByID {

    private static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set API endpoint to get complete user profile")
    public String setApiEndProfile(){
        return url + "users/1";
    }

    @Step("I send request to get user profile")
    public void sendRequestProfile(){
        SerenityRest.given().get(setApiEndProfile());
    }

    @Step("I receive complete user profile")
    public void receiveValidProfile(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_USER_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body("'data'.'id'",equalTo(1)));
        restAssuredThat(response -> response.body("'data'.'name'",notNullValue()));
        restAssuredThat(response -> response.body("'data'.'username'",notNullValue()));
        restAssuredThat(response -> response.body("'data'.'email'",notNullValue()));
        restAssuredThat(response -> response.body("'data'.'address'",notNullValue()));
        restAssuredThat(response -> response.body("'data'.'phone'",notNullValue()));
        restAssuredThat(response -> response.body("'data'.'website'",notNullValue()));
        restAssuredThat(response -> response.body("'data'.'company'",notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));

    }


}
