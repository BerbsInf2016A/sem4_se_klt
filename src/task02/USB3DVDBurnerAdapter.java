package task02;

/**
 * Adapter for a usb 3 dvd burner, to connect as a usb 2 device.
 */
public class USB3DVDBurnerAdapter extends USB3DVDBurner implements IUSB2Device {
    /**
     * Get the description for the usb 2 device.
     *
     * @return The description of the device.
     */
    public String getUSB2Description() {
        return this.getUSB3Description();
    }
}