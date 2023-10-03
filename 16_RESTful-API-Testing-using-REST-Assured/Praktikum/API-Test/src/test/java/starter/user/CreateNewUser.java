package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchemaHelper;
import starter.utils.JsonSchema;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class CreateNewUser {
    private static String url = "https://jsonplaceholder.typicode.com/";
    @Step("I set API endpoint for create new user")
    public String setApiNewUser() {
        return url + "posts";
    }

    @Step("I send request to fill user data with valid id {String}, userId {String}, title {String}, and body {String}")
    public void sendCreateUserRequest(String id, String userId, String title, String body) {
        JSONObject requestBody = new JSONObject();

        requestBody.put("id :", id);
        requestBody.put("userId :", userId);
        requestBody.put("title :", title);
        requestBody.put("body :", body);


        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(setApiNewUser());
            }

    @Step("I receive valid data for create new user")
    public void receiveValidDataForCreateNewUser(String id, String userId, String title, String body) {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.CREATE_USER_RESPONSE_SCHEMA);
        restAssuredThat(response -> response.body("'id'", equalTo(id)));
        restAssuredThat(response -> response.body("'userId'", equalTo(userId)));
        restAssuredThat(response -> response.body("'title'", equalTo(title)));
        restAssuredThat(response -> response.body("'body'", equalTo(body)));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

}
