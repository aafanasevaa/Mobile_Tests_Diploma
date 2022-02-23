package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/browserstack.properties",
})

public interface BrowserstackConfig extends Config {

    @Key("browserstackUser")
    String browserstackUser();

    @Key("browserstackPassword")
    String browserstackPassword();

    @Key("browserstackUrl")
    String browserstackUrl();

    @Key("appUrl")
    String appUrl();

    @Key("device")
    String device();

    @Key("osVersion")
    String osVersion();

}