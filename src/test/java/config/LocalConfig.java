package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:local.properties"
})
public interface LocalConfig extends Config {

    String platformName();

    String deviceName();

    String url();

    String version();

}