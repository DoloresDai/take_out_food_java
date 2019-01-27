import java.util.Scanner;

/***
 * This is a tool class that encapsulates common methods.
 * @author Dolores
 * @version 1.0
 */
public class Tool {
    /**
     * @param arr Any string you want to print；
     * @return null
     */
    static void print(String arr) {
        System.out.println(arr);
    }

    /**
     * @param numStringArr - Numbers stored in strings;
     * @return - Array converted to numerical form
     */
    static int[] convertToIntArr(String[] numStringArr) {
        int[] numArr = new int[numStringArr.length];
        for (int i = 0; i < numStringArr.length; i++) {
            numArr[i] = Integer.parseInt(numStringArr[i]);
        }
        return numArr;
    }

    /**
     * @param - Console input string
     * @return String
     */
    static Scanner getControlStatic() {
        return new Scanner(System.in);
    }
}
