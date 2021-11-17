package rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

class MobileBankApiTestV1 {
    @Test
    void shouldReturnDemoAccounts() {
        // Given - When - Then
        // Предусловия

        given()
                .baseUri("http://localhost:9999/api/v1")
                // Выполняемые действия
                .when()
                .get("/demo/accounts")
                // Проверки
                .then()
                .statusCode(200);
//                .body("", hasSize(3))
//                .body("[0].balance", greaterThanOrEqualTo(0))
//                .body("[1].id", equalTo(2))
//                .body("[0].currency", equalTo("RUB"));
//                .contentType(ContentType.JSON);
//                .body("every{ it.balans >=0", is(true));

    }
}
