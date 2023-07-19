package arman.minmax;

public class Minmax {

    public static void main(String[] args) {
        int[] num = {1, 45, 23, 78};
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if(num[i] > max)
                max = num[i];
        }
        System.out.println("Maximum = " + max);
        int min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min)
                min = num[i];
        }
        System.out.println("Minimum = " + min);
    }
}
