package in.co.gorest.myfirsttest;


import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;



public class MyFirstTest extends TestBase {

    @Test
    public void getAllGoRestInfo() {

        Response response = given()
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();


    }
}
