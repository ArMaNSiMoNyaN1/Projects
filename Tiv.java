package arman;

import java.util.Arrays;
import java.util.Collections;

public class Tiv {
    public static void main(String[] args) {
        int[] tiv = {12, 456, 76, 55, 3, 2, 89, 14};
        for (int i = 0; i < tiv.length; i++) {
            for (int j = i + 1; j < tiv.length; j++) {
                if (tiv[i] > tiv[j]) {
                    int temp = tiv[i];
                    tiv[i] = tiv[j];
                    tiv[j] = temp;
                }
            }
        }
        for (int number : tiv) {
            System.out.print(number + " ");
        }
        System.out.println("");
        for (int i = 0; i < tiv.length; i++) {
            for (int j = i + 1; j < tiv.length; j++) {
                if (tiv[i] < tiv[j]) {
                    int temp = tiv[i];
                    tiv[i] = tiv[j];
                    tiv[j] = temp;
                }
            }
        }
        for (int number : tiv) {
            System.out.print(number + " ");
        }
        System.out.println(" ");
        int[] number = {12, 435, 1, 7, 35, 98, 887};
        Arrays.sort(number);
        for (int tver : number) {
            System.out.print(tver + " ");
//            Collections.reverseOrder(Arrays.asList(number));
//            System.out.println(Arrays(number + " "));
        }
    }
}
