package Interface.src;

public class App {
    static public void main(String[] args) {
        Machine computer = new Machine();
        computer.showInfo();

        Info phone = new Machine();
        phone.showInfo();

        outputInfo(phone);
        outputInfo(computer);
    }

    private static void outputInfo(Info info) {
        info.showInfo();
    }
}
