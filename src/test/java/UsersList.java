import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class UsersList extends BasePage {

    private static String resourcePath = "/users/";

    @Test
    public void obt_An_User (){
        String body = given()
                .get(resourcePath)
                .then()
                    .statusCode(200)
                    .body("[8].name", equalTo("Glenna Reichert"))
                    .extract().body().asString();

        System.out.println(body);
    }

}
