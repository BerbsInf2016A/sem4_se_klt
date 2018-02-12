package task02;

import java.util.ArrayList;
import java.util.List;


public class Computer {

    private final List<IUSB2DeviceConnectedListener> connectionListener;

    public Computer() {
        this.connectionListener = new ArrayList<>();
    }

    public void addListener(IUSB2DeviceConnectedListener listener) {
        if (this.connectionListener.contains(listener)) return;
        this.connectionListener.add(listener);
    }


    public void plugin(IUSB2Device device) {
        for (IUSB2DeviceConnectedListener listener : this.connectionListener) {
            listener.deviceConnected(device.getUSB2Description());
        }
    }


    public void removeListener(IUSB2DeviceConnectedListener listener) {
        if (this.connectionListener.contains(listener)) this.connectionListener.remove(listener);
    }
}