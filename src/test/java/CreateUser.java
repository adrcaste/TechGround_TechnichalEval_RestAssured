import model.User;
import org.testng.annotations.Test;

import static helpers.DataHelper.*;
import static io.restassured.RestAssured.given;

public class CreateUser extends BasePage{

    private static String resourcePath = "/users";

    @Test
    public void Test_Create_User (){

        User user = new User(generateRandomName(), generateRandomUserName(),generateRandomEmail());
        System.out.println("Test Created" + " " + user.getEmail() + " " + user.getName()+ " " + user.getUsername() );

        given()
                .body(user)
                .log().all()
                .when()
                .post(String.format(resourcePath))
                .then()
                .log().all()
                .and()
                .statusCode(201);

    }




}
