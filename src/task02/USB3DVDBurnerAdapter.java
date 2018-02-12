package task02;

public class USB3DVDBurnerAdapter extends USB3DVDBurner implements IUSB2Device {
    public String getUSB2Description() {
        return this.getUSB3Description();
    }

}