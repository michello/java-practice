package PublicPrivateProtected.src;
import world.*;

public class App {
    public static void main(String[] args) {
        Plant plant = new Plant();
        System.out.println(plant.name);
        System.out.println(plant.ID);
        System.out.println(plant.size);

        Oak oak = new Oak();
        System.out.println(oak.size);

        Field myField = new Field();
    }
}
