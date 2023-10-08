//package starter.hooks;
//import io.cucumber.java.Before;
//import org.json.JSONObject;
//
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class AddNewUserHook {
//    @Before(value = "@AddNewUser")
//    public static void beforetesting(String email, String username, String password, String firstname, String lastname,
//                                     String city, String street, int number, String zipcode, String lat, String longitude,
//                                     String phone) {
//        JSONObject requestBody = new JSONObject();
//        JSONObject name = new JSONObject();
//        requestBody.put("firstname", firstname);
//        requestBody.put("lastname", lastname);
//
//        JSONObject geolocation = new JSONObject();
//        requestBody.put("lat", lat);
//        requestBody.put("longitude", longitude);
//
//        JSONObject address = new JSONObject();
//        requestBody.put("city", city);
//        requestBody.put("street", street);
//        requestBody.put("number", number);
//        requestBody.put("zipcode", zipcode);
//        requestBody.put("geolocation", geolocation);
//
//
//
//        requestBody.put("email", email);
//        requestBody.put("username", username);
//        requestBody.put("password", password);
//
//        requestBody.put("name", name);
//        requestBody.put("address", address);
////        requestBody.put("geolocation", geolocation);
//
//        requestBody.put("phone", phone);
//
//        String filePath = "src/test/resources/sample/requestbody.json";
//
//        try {
//            String jsonString = requestBody.toString();
//
//            FileWriter fileWriter = new FileWriter(filePath);
//            fileWriter.write(jsonString);
//            fileWriter.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}