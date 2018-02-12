package task02;

/**
 * A system process, observing usb connections.
 */
public class SystemProcess implements IUSB2DeviceConnectedListener {

    /**
     * Called, when a device is connected.
     *
     * @param description The description of the device.
     */
    public void deviceConnected(String description) {
        this.printConnectedDeviceDescription(description);
    }

    /**
     * Prints out the description of the connected device.
     *
     * @param description The description to print out.
     */
    private void printConnectedDeviceDescription(String description) {
        System.out.println("System-Process: New USB device connected! DeviceDescription: " + description);
    }
}