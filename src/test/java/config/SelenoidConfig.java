package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:selenoid.properties"
})
public interface SelenoidConfig extends Config {

    String selenoidUrl();

    String selenoidAppUrl();

    String platformName();

    String deviceName();

    String version();

    String locale();

    String language();

    String appPackage();

    String appActivity();
}