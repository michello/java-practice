package Inheritance;

public class Device extends Machine {
    public void start() {
        System.out.println(name + " has started.");
    }

    public void end() {
        System.out.println("Device has stopped.");
    }
}
