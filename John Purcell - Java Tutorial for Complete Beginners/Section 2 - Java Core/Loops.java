public class Loops {
    public static void main(String[] args) {

        // while loops
        int value = 0;
        while (value < 10) {
            System.out.println("Hello world");
            ++value;        // value is increased, and then value is returned
            // value++;     // value is returned, and then value is increased
        }

        // for loops
        // for (statement1; statement2; statement3) {
        // }
        // statement1: initializer
        // statement2: defines condition
        // statement3: way of executing and moving towards the condition

        for (int i = 0; i < 10; i++) {
            System.out.println("michelle " + i);
            // format specifier, specifies that the string can contain special characters
            System.out.printf("michelle %d\n", i);
        }

    }
}