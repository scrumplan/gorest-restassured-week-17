package in.co.gorest.gorestinfo;

import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteTheUserRecord extends TestBase {

    @Test
    public void deleteUsersRecord(){
        Response response = given()
                .header("Authorization","Bearer fed48509a2bb2e115c9c41ac772f879581b596b832c55a0a1ce8a1df3ff8ca4b")
                .pathParam("id",3226)
                .when()
                .delete("/users/{id}");
        response.then().statusCode(204);
        response.prettyPrint();

    }

}
