import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BasePage {

    @Parameters("baseUrl")
    @BeforeClass
    public void setup(@Optional("https://jsonplaceholder.typicode.com") String baseUrl ) {

        RestAssured.baseURI = baseUrl;
    }

}
