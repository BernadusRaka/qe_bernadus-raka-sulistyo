package starter.user;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.deser.NullValueProvider;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class NewUserUsingInvalidID {
    private static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set API endpoint for create new invalid user")
    public String setApiInvalid(){
        return url + "posts/999";
    }

    @Step("I send request to create user with empty body")
    public void sendInvalidRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("Id", "999");
        requestBody.put("userId", "999");
        requestBody.put("name", "!!!!");
        requestBody.put("title", "!!!!");

        String token = GenerateToken.generateToken();

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(setApiInvalid());
    }
    @Step("I receive status code 404")
    public void invalidApi(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.CREATE_USER_RESPONSE_SCHEMA);
        restAssuredThat((response -> response.statusCode(404)));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
        }
    }

