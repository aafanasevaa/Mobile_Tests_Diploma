package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/selenoid.properties"})

public interface SelenoidConfig extends Config {

    @Key("selenoidUrl")
    String selenoidUrl();

    @Key("platformName")
    String platformName();

    @Key("deviceName")
    String deviceName();

    @Key("version")
    String version();

    @Key("locale")
    String locale();

    @Key("language")
    String language();

    @Key("appPackage")
    String appPackage();

    @Key("appActivity")
    String appActivity();
}