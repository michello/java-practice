class Machine {
    private String type;
    private int code;
    private String name;

    public Machine() {
        this("computer");
    }

    public Machine(String type) {
        this.type = type;
    }

    public Machine(String name, int code) {
        this.name = name;
        this.code = code; 
    }

    String getType() {
        return this.type;
    }

    int getCode() {
        return this.code;
    }

    String getName() {
        return this.name;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Machine computer = new Machine();
        System.out.println("This machine is a " + computer.getType());

        Machine printer = new Machine("printer");
        System.out.println("This machine is a " + printer.getType());

        Machine compiler = new Machine("compiler", 200);
        System.out.println("This machine is a " + compiler.getName());
    }
}
