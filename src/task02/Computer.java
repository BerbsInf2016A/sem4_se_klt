package task02;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    /**
     * A list of listeners, which are interested in the event of
     * a new connected USB2 device.
     */
    private final List<IUSB2DeviceConnectedListener> connectionListener;

    /**
     * Constructor for the computer.
     */
    public Computer() {
        this.connectionListener = new ArrayList<>();
    }

    /**
     * Add a listener.
     *
     * @param listener The listener.
     */
    public void addListener(IUSB2DeviceConnectedListener listener) {
        if (this.connectionListener.contains(listener)) return;
        this.connectionListener.add(listener);
    }

    /**
     * Plugin a USB2 device.
     *
     * @param device The device to plugin.
     */
    public void plugin(IUSB2Device device) {
        for (IUSB2DeviceConnectedListener listener : this.connectionListener) {
            listener.deviceConnected(device.getUSB2Description());
        }
    }

    /**
     * Remove a listener.
     *
     * @param listener The listener to remove.
     */
    public void removeListener(IUSB2DeviceConnectedListener listener) {
        if (this.connectionListener.contains(listener)) this.connectionListener.remove(listener);
    }
}