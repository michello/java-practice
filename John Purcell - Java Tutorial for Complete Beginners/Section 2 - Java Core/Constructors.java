class Machine {
    String type;
    public Machine() {
        // this.type = "computer";
        this("computer");
    }

    public Machine(String type) {
        this.type = type;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Machine computer = new Machine();
        System.out.println("This machine is a " + computer.type);

        Machine printer = new Machine("printer");
        System.out.println("This machine is a " + printer.type);
    }
}
