package Inheritance;

public class Computer extends Device {
    @Override
    public void start() {
        System.out.println("Computer has started.");
    }

    @Override
    public void end() {
        System.out.println("Computer has stopped.");
    }
}
