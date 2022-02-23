package helpers;

import static io.restassured.RestAssured.given;

public class Browserstack {

    public static BrowserstackConfig browserstackConfig = ConfigFactory.create(
            BrowserstackConfig.class, System.getProperties());

    public static String videoUrl(String sessionId) {
        return given()
                .auth().basic(browserstackConfig.user(), browserstackConfig.key())
                .when()
                .get("https://api-cloud.browserstack.com/app-automate/sessions/" + sessionId +".json")
                .then()
                .statusCode(200)
                .log().body()
                .extract()
                .path("automation_session.video_url");
    }
}