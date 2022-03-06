package config;

import org.aeonbits.owner.Config;

public interface DeviceConfig extends Config {

    @DefaultValue("selenoid")
    String deviceHost();
}