package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/browserstack.properties",
})

public interface BrowserstackConfig extends Config {

    @Key("user")
    String user();

    @Key("key")
    String key();

    @Key("url")
    String url();

    @Key("appUrl")
    String appUrl();

    @Key("device")
    String device();

    @Key("osVersion")
    String osVersion();

}