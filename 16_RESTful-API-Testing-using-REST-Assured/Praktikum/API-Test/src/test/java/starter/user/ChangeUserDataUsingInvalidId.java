package starter.user;

import net.thucydides.core.annotations.Step;

public class ChangeUserDataUsingInvalidId {

    private static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set API endpoint for change user data using invalid id")
    public String changeInvalidId(){
        return url + "posts/999";
    }

}
