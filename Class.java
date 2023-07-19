package arman;

public class Class {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3, 4}, {5, 6, 7}, {8, 9, 10}, {11, 12, 13}};
        for (int i : mergeArrays(numbers)) {
            System.out.print(i + " ");
        }
    }

    static int[] mergeArrays(int[][] numbers) {
        int newArrayLength = 0;
        for (int[] number : numbers) {
            newArrayLength = newArrayLength + number.length;
        }
        int[] newNumbers = new int[newArrayLength];
        int index = 0;
        for (int[] number : numbers) {
            for (int i : number) {
                newNumbers[index] = i;
                index++;
            }
        }
        return newNumbers;
    }
}
