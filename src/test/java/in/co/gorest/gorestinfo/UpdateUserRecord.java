package in.co.gorest.gorestinfo;

import in.co.gorest.model.GorestPojo;
import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class UpdateUserRecord extends TestBase {

    @Test
    public void updateUserRecord(){
        GorestPojo gorestPojo = new GorestPojo();
        gorestPojo.setName("Tena");
        gorestPojo.setGender("female");
        gorestPojo.setEmail("rep_desai_atreyee@hermiston.net");
        gorestPojo.setStatus("active");

        Response response = given()
                .header("Authorization","Bearer fed48509a2bb2e115c9c41ac772f879581b596b832c55a0a1ce8a1df3ff8ca4b")
                .header("Content-Type","application/json")
                .pathParam("id",3222)
                .body(gorestPojo)
                .when()
                .patch("/users/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }

}
