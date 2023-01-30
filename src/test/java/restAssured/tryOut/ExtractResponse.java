package restAssured.tryOut;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static  io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

@Test
public class ExtractResponse {
    String BASE_URI = "https://reqres.in/api";
    String BASE_PATH = "user";

    public void extract_response_to_print(){

        Response response = given().
                    baseUri(BASE_URI).
                    basePath(BASE_PATH).
                when().
                    get().
                then().
                    assertThat().
                    statusCode(200).
                    extract().
                    response();

        System.out.println("Response : ");
        System.out.println(response.asString());  // dont use toString() but use asString()

/*        //Now to extact a path of the response we  have use response.path()  - first method
        System.out.println("Id of the third user : "+response.path("data[2].id"));*/

/*        // second way to extract an element of json using JsonPath is:
        JsonPath jsonPath = new JsonPath(response.asString());
        System.out.println("Value of the ID of third user from JsonPath : "+jsonPath.getString("data[2].id"));
        */

        //Third way is without initiating JsonPath's object but directly using it.
        // for this, the response is to be taken as sting and used in JsonPath.from so creating a new method for it.

        JsonPath jsonPath = new JsonPath(response.asString());
        System.out.println("Value of the ID of third user from JsonPath : "+jsonPath.getString("data[2].id"));

        // NOw this can be assigned to a parametetr and can be used as next path
    }

    @Test
    public void to_extract_response_using_JsonPath(){
        String myUserId = given().
                baseUri(BASE_URI).
                basePath(BASE_PATH).
                when().
                get().
                then().
                assertThat().
                statusCode(200).
                extract().
                response().asString();

        //Now use JsonPath.from
        int userId = Integer.parseInt(JsonPath.from(myUserId).getString("data[2].id"));

        System.out.println("User ID obtained from the third method which is converted from string to Int : "+userId);
    }

    public void extract_response_object_as_path(){
        int sameUserIdInOtherWay =
                given().
                    baseUri(BASE_URI).
                    basePath(BASE_PATH).
                when().
                    get().
                then().
                    assertThat().
                    statusCode(200).
                    extract().
                    response().
                        path("data[2].id");

        System.out.println("User ID extracted from response.path() which is directly returned as int : "+sameUserIdInOtherWay);
    }

}
