package task02;

public class SystemProcess implements IUSB2DeviceConnectedListener {

    public void deviceConnected(String description) {
        this.printConnectedDeviceDescription(description);
    }


    public void printConnectedDeviceDescription(String description) {
        System.out.println("System-Process: New USB device connected! DeviceDescription: " + description);
    }
}