package Inheritance;

public class Machine {
    String name = "Machine";
    public static void main(String[] args) {
        Device phone = new Device();
        phone.start();
        phone.end();

        Computer mac = new Computer();
        mac.start();
        mac.end();
    }
}

