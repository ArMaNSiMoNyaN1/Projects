package arman.minmax;

import java.util.Arrays;
import java.util.Collections;

public class Array {
    public static void main(String[] args) {
        int[] intArray = {77, 45, 23, 43, 11, 2, 55, 777};
        Arrays.sort(intArray);
        int maxNum = intArray[intArray.length - 1];
        System.out.println("Maximum number = " + maxNum);
        System.out.println(" ");
        Arrays.sort(new int[][]{intArray}, Collections.reverseOrder());
        System.out.println("Minimum number = " + intArray[0]);
        Arrays.toString(intArray);
    }
}

