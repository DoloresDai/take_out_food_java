import java.util.Scanner;

public class Tool {
    static void print(String arr) {
        System.out.println(arr);
    }

    static int[] convertToIntArr(String[] numStringArr) {
        int[] numArr = new int[numStringArr.length];
        for (int i = 0; i < numStringArr.length; i++) {
            numArr[i] = Integer.parseInt(numStringArr[i]);
        }
        return numArr;
    }

    static Scanner getControlStatic() {
        return new Scanner(System.in);
    }
}
