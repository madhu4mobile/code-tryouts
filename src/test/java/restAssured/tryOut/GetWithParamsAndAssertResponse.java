package restAssured.tryOut;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static  io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

public class GetWithParamsAndAssertResponse {
    String BASE_URI = "http://universities.hipolabs.com";
    String BASE_PATH = "search";
    @Test
    //To pass URL with parameters and then assert the status code to be 200
    public void validate_status_code(){
        given().
                baseUri(BASE_URI).
                        basePath(BASE_PATH).
                        param("name","Andhra").
                        param("country","india").
                //pathParams().
                when().
                        get().
                then().
                        log().all().
                        assertThat().statusCode(200)
                        ;
    }

    @Test
    public void GetWithParamsAndAssertResponseObjects(){
                given().
                        baseUri(BASE_URI).basePath(BASE_PATH).
                        param("name", "Indian Institute of Technology").
                        param("country", "India").

                when().
                        get().
                then().
                        log().all().
                        statusCode(200).
                        body("name",hasItems("Indian Institute of Technology, Delhi", "Indian Institute of Technology, Kharagpur", "Indian Institute of Technology, Roorkee", "Indian Institute of Technology, Madras", "Indian Institute of Technology, Hyderabad", "Indian Institute of Technology, Patna", "Indian Institute of Technology, Kanpur", "Indian Institute of Technology, Indore", "Indian Institute of Technology, Bombay", "Indian Institute of Technology, Gandhinagar", "Indian Institute of Technology, Guwahati", "Indian Institute of Technology, Jodhpur"));
                    ;
    }
}
