package arman;

import static arman.Class.mergeArrays;

public class Arr {
    public static void main(String[] args) {
    int[][] numbers = {{1,2,67}, {78,90,23}, {12,34,56}};
    int[] newNumbers = mergeArrays(numbers);
    for (int i : newNumbers) {
        System.out.print(i + " ");
    }
    }
}
