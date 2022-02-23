package tests.browserstack;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

public class WikiTestBrowserstack extends TestBase {

    @Test
    @DisplayName("Search Wikipedia in Wikipedia app")
    @Tag("browserstack")
    void searchWikipediaInWikipedia() throws MalformedURLException, InterruptedException {
        step("Click on search field", () ->
                $(MobileBy.AccessibilityId("Search Wikipedia")).click());
        step("Fill the input field and execute the search", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Wikipedia"));
        step("Check the search results", () -> {
            $$(byClassName("android.widget.TextView")).shouldHave(sizeGreaterThan(0));
        });
    }
}