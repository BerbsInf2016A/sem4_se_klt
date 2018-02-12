package task02;

public class Application {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SystemProcess process = new SystemProcess();
        computer.addListener(process);

        IUSB2Device dvdBurner = new USB3DVDBurnerAdapter();
        computer.plugin(dvdBurner);

    }
}
