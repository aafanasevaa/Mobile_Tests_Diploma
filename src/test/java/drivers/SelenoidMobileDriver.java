package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.SelenoidConfig;
import io.appium.java_client.android.AndroidDriver;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class SelenoidMobileDriver implements WebDriverProvider {

    public static SelenoidConfig selenoidConfig = ConfigFactory.create(SelenoidConfig.class, System.getProperties());

    public static URL getSelenoidUrl() {
        try {
            return new URL(selenoidConfig.selenoidUrl());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {

        desiredCapabilities.setCapability("platformName",   selenoidConfig.platformName());
        desiredCapabilities.setCapability("deviceName", selenoidConfig.deviceName());
        desiredCapabilities.setCapability("version", selenoidConfig.version());
        desiredCapabilities.setCapability("locale", selenoidConfig.locale());
        desiredCapabilities.setCapability("language", selenoidConfig.language());
        desiredCapabilities.setCapability("enableVNC", true);
        desiredCapabilities.setCapability("enableVideo", true);
        desiredCapabilities.setCapability("appPackage", selenoidConfig.appPackage());
        desiredCapabilities.setCapability("appActivity", selenoidConfig.appActivity());

        return new AndroidDriver(getSelenoidUrl(), desiredCapabilities);
    }
}