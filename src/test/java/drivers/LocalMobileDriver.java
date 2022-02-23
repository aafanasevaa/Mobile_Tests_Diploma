package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.LocalConfig;
import io.appium.java_client.android.AndroidDriver;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static utils.FileUtils.getAbsolutePath;

public class LocalMobileDriver implements WebDriverProvider {

    private static final LocalConfig localConfig = ConfigFactory.create(LocalConfig.class, System.getProperties());

    public static URL getBrowserstackUrl() {
        try {
            return new URL(localConfig.url());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {

        desiredCapabilities.setCapability("platformName", localConfig.platformName());
        desiredCapabilities.setCapability("deviceName", localConfig.deviceName());
        desiredCapabilities.setCapability("version", localConfig.version());
        desiredCapabilities.setCapability("locale", "en");
        desiredCapabilities.setCapability("language", "en");
        desiredCapabilities.setCapability("appPackage", "org.wikipedia.alpha");
        desiredCapabilities.setCapability("appActivity", "org.wikipedia.main.MainActivity");
        desiredCapabilities.setCapability("app",
                getAbsolutePath(localConfig.appPath()));

        return new AndroidDriver(getBrowserstackUrl(), desiredCapabilities);
    }
}