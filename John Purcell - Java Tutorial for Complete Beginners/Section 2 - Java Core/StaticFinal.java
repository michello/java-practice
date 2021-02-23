class Thing {
    public final static int LUCKY_NUMBER = 7;

    public String name;
    public static String description;

    public static int count = 0;
    public int id;

    public Thing() {
        id = count;
        count++;
    }

    public void showName() {
        System.out.println(name);
    }

    public static void showInfo() {
        System.out.println("Hello");
    }
}

public class StaticFinal {
    public static void main(String[] args) {

        Thing.description = "I am a thing";
        
        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        // thing1.name = "Bob";
        thing2.name = "Sue";
        thing1.name = "Bob";

        System.out.println(thing1.description);
        System.out.println(thing1.name + " has an id of " + thing1.id);

        System.out.println(thing2.name + " has an id of " + thing2.id);
        System.out.println(thing2.description);

        System.out.println(Thing.LUCKY_NUMBER);
        System.out.println(Thing.count);
    }
}
