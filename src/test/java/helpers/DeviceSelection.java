package helpers;


import config.DeviceConfig;
import drivers.BrowserstackMobileDriver;
import drivers.LocalMobileDriver;
import drivers.SelenoidMobileDriver;
import org.aeonbits.owner.ConfigFactory;

public class DeviceSelection {

    private final DeviceConfig config = ConfigFactory.create(DeviceConfig.class, System.getProperties());

    public static String getDeviceDriver(String deviceHost) {

        switch (deviceHost) {
            case "emulation":
                return LocalMobileDriver.class.getName();
            case "browserstack":
                return
                        BrowserstackMobileDriver.class.getName();
            case "selenoid":
                return SelenoidMobileDriver.class.getName();
            default:
                throw new RuntimeException("Please select only " +
                        "emulation / browserstack / selenoid in -DdeviceHost parameter");
        }
    }
}