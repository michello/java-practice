public class Array {
    public static void main(String[] args) {
        int value = 7;

        int[] values;
        values = new int[3]; // Java give all values in array a value of 0
        values[0] = 10;
        
        System.out.println(values[0]); // 10
        System.out.println(values[1]); // 0
        System.out.println(values[2]); // 0

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        int[] numbers = {5, 6, 7};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}