package starter.user;

import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class ChangeUserData {

    private static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set API endpoint for change user data")
    public String setApiChangeUser() {
        return url + "posts/1";
    }

    @Step("I receive valid data for changed user data")
    public void changeDataUser(String id, String userId, String title, String body){
    JsonSchemaHelper helper = new JsonSchemaHelper();
    String schema = helper.getResponseSchema(JsonSchema.UPDATE_USER_RESPONSE_SCHEMA);

    restAssuredThat(response -> response.body("'id'",equalTo(id)));
    restAssuredThat(response -> response.body("'userId'",equalTo(userId)));
    restAssuredThat(response -> response.body("'title'",equalTo(title)));
    restAssuredThat(response -> response.body("'body'",equalTo(body)));
    restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
