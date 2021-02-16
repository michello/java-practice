// the condition is checked after the statements are executed, 
// so do while loop guarantees the loop execution at least once.

public class DoWhile {
    public static void main (String[] args) {
        int myNum = 0;
        do {
            System.out.println(myNum);
            myNum++;
        } while (myNum < 3);
    }
}