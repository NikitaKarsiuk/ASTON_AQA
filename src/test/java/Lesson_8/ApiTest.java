package Lesson_8;


import org.apache.http.HttpStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import io.restassured.RestAssured;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.notNullValue;

public class ApiTest extends BaseTest {
        @Test
        @DisplayName("GET request test")
        public void getRequestTest() {

            RestAssured
                    .given()
                    .log().all()
                    .when()
                    .get("/get?foo1=bar1&foo2=bar2")
                    .then()
                    .log().all()
                    .statusCode(equalTo(HttpStatus.SC_OK))
                    .body("args.foo1", equalTo("bar1"))
                    .body("args.foo2", equalTo("bar2"))
                    .body("headers", notNullValue())
                    .body("url", equalTo("https://postman-echo.com/get?foo1=bar1&foo2=bar2"));
        }

    @Test
    @DisplayName("POST raw text request test")
    public void postRawTextRequestTest() {

        RestAssured
                .given()
                .log().all()
                .body("This is expected to be sent back as part of response body.")
                .when()
                .post("/post")
                .then()
                .log().all()
                .statusCode(equalTo(HttpStatus.SC_OK))
                .body("args.size()", equalTo(0))
                .body("files.size()", equalTo(0))
                .body("form.size()", equalTo(0))
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .body("headers", notNullValue())
                .body("json", equalTo(null))
                .body("url", equalTo("https://postman-echo.com/post"));
    }

    @Test
    @DisplayName("POST form data request test")
    public void postFormDataRequestTest() {

        RestAssured
                .given()
                .log().all()
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when()
                .post("/post")
                .then()
                .log().all()
                .statusCode(equalTo(HttpStatus.SC_OK))
                .body("args.size()", equalTo(0))
                .body("data.size()", equalTo(0))
                .body("files.size()", equalTo(0))
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"))
                .body("headers", notNullValue())
                .body("url", equalTo("https://postman-echo.com/post"));
    }

    @Test
    @DisplayName("PUT request test")
    public void putRequestTest() {

        RestAssured
                .given()
                .log().all()
                .body("This is expected to be sent back as part of response body.")
                .when()
                .put("/put")
                .then()
                .log().all()
                .statusCode(equalTo(HttpStatus.SC_OK))
                .body("args.size()", equalTo(0))
                .body("files.size()", equalTo(0))
                .body("form.size()", equalTo(0))
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .body("headers", notNullValue())
                .body("json", equalTo(null))
                .body("url", equalTo("https://postman-echo.com/put"));
    }

    @Test
    @DisplayName("PATCH request test")
    public void patchRequestTest() {

        RestAssured
                .given()
                .log().all()
                .body("This is expected to be sent back as part of response body.")
                .when()
                .patch("/patch")
                .then()
                .log().all()
                .statusCode(equalTo(HttpStatus.SC_OK))
                .body("args.size()", equalTo(0))
                .body("files.size()", equalTo(0))
                .body("form.size()", equalTo(0))
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .body("headers", notNullValue())
                .body("json", equalTo(null))
                .body("url", equalTo("https://postman-echo.com/patch"));
    }
    @Test
    @DisplayName("DELETE request test")
    public void deleteRequestTest() {

        RestAssured
                .given()
                .log().all()
                .body("This is expected to be sent back as part of response body.")
                .when()
                .delete("/delete")
                .then()
                .log().all()
                .statusCode(equalTo(HttpStatus.SC_OK))
                .body("args.size()", equalTo(0))
                .body("files.size()", equalTo(0))
                .body("form.size()", equalTo(0))
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .body("headers", notNullValue())
                .body("json", equalTo(null))
                .body("url", equalTo("https://postman-echo.com/delete"));
    }
}
