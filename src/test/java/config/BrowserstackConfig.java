package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"system:properties",
        "classpath:browserstack.properties"})

public interface BrowserstackConfig extends Config {

    String app();

    String user();

    String key();

    String device();

    String osVersion();

}