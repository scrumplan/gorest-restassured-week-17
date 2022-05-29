package in.co.gorest.gorestinfo;

import in.co.gorest.model.GorestPojo;
import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CreateTheUserRecord extends TestBase {

    @Test
    public void createUserPage() {
        GorestPojo gorestPojo = new GorestPojo();
        gorestPojo.setName("Tena");
        gorestPojo.setGender("female");
        gorestPojo.setEmail("Tena1234@gmail.com");
        gorestPojo.setStatus("active");

        Response response = given()
                .header("Authorization","Bearer fed48509a2bb2e115c9c41ac772f879581b596b832c55a0a1ce8a1df3ff8ca4b")
                .header("Content-Type","application/json")
                .body(gorestPojo)
                .when()
                .post("/users");
        response.then().statusCode(201);
        response.prettyPrint();

    }
}
