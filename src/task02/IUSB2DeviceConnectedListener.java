package task02;

/**
 * An interface for listeners
 */
public interface IUSB2DeviceConnectedListener {

    /**
     * Should be called, when a device is connected.
     *
     * @param description
     */
    void deviceConnected(String description);

}