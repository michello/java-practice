public class ArrayStrings {
    public static void main(String[] args) {
        String[] words = new String[3];
        words[0] = "Hello";
        words[1] = "to";
        words[2] = "you";

        System.out.println(words[2]);

        String[] fruits = {
            "apple",
            "banana",
            "pear",
            "kiwi"
        };

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // primitive types are denoted with a lowercase letter
        int value = 123;

        // class is denoted with an uppercase letter
        // allocating enough memory (address) for a string
        String text;

        String[] texts = new String[2]; // allocating memory for two places in String[]
        texts[0] = "one";
    }
}