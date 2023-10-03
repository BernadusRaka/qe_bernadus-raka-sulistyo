package starter.user;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class DeleteInvalidUser {

    private static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set API endpoint for delete user with invalid id")
    public String setApiDeleteInvalid(){
        return url + "posts/999";
    }

    @Step("I send request to delete user with invalid ID")
    public void sendRequestDeleteInvalid(){
        SerenityRest.given().delete(setApiDeleteInvalid());
    }
}
