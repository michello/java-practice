package Inheritance.src;

public class Machine {
     
    String name = "Machine";
     
    public void start() {
        System.out.println(this.name + " has started.");
    }
     
    public void stop() {
        System.out.println("Machine stopped.");
    }

    public String getName() {
        return this.name;
    }
}