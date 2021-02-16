public class If {
    public static void main(String[] args) {
        // boolean cond = 
        if (4 == 4) {
            System.out.println("Yes, 4 == 4 is true!");
        }

        if (5 != 4) {
            System.out.println("No, 5 != 4");
        }

        // int myInt = 20;
        // int myInt = 40;
        int myInt = 30;
        if (myInt < 30) {
            System.out.printf("Yes, %d is less than 30", myInt);
        } else if (myInt == 30) {
            System.out.printf("No, %d is the same as 30", myInt);
        } else {
            System.out.printf("No, %d is not less than 30", myInt);
        }
    }
}