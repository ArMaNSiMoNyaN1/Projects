package arman;

public class Homework {

    public static void main(String[] args) {
        System.out.println("        *");
        System.out.println("       ***");
        System.out.println("      *****");
        System.out.println("     *******");
        System.out.println("    *********");
        System.out.println("   ************");
        System.out.println("  **************");
        System.out.println(" ****************");
        System.out.println("       *****");
        System.out.println("       *****");
        System.out.println("    ***********");
        System.out.println("    ***********");
        System.out.println("   --------------");
        byte thisNumber = 123;
        byte nextNumber = 127;
        System.out.println(--thisNumber - nextNumber);
        char newChar = '$';
        System.out.println(newChar);
        short thisShort = 999;
        short theShort = 1111;
        System.out.println(thisShort + theShort);
        byte forThisNumber = 23;
        byte nowThisNumber = 6;
        System.out.println(forThisNumber % nowThisNumber);
        int thisInt = 660;
        int nowInt = 6;
        System.out.println(thisInt / nowInt);
        byte thisByte = 6;
        byte isByte = 8;
        ++thisByte;
        --isByte;
        System.out.println(thisByte * isByte);
        System.out.println("");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        int l = 1;
        while (l <= 10) {
            l++;
            if (l % 2 == 0) {
                System.out.print(l + " ");
            }

            System.out.println(" ");
            for (int k = 11; k >= 1; k--) {
                if (k % 2 == 0) {
                    System.out.print(k + " ");
                }
            }
            System.out.println("");
            int star = 17;
            for (int i = 0; i <= star; i += 2) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            int star2 = 3;
            for (int i = 0; i <= star2; i++) {
                for (int j = 0; j <= i; j += 1) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }

            System.out.println("");
            byte java = 3;
            for (int i = 1; i <= java; ++i) {
                System.out.println("Java is a good language for programming");
            }
            System.out.println("");
            int i = 0;
            while (i < 5) {
                System.out.println(i);
                i++;
            }
            System.out.println("");
            byte tiv = 0;
            do {
                System.out.println(tiv);
                tiv++;
            } while (tiv < 3);
        }
        System.out.println("");
        int R = 3;
        int K = 5;
        if (R < K) {
            System.out.println("R smalled then k");
        }
        System.out.println("");
        int weight = 64;
        int age = 22;
        if (weight >= 55) {
            if (age >= 18) {
                System.out.println("You are suitable for the job of a secretary");
            } else {
                System.out.println("You are not suitable for the job of a secretary");
            }
        } else {
            System.out.println("Age must be greater than 18");
        }
        System.out.println("---");
        int n = 5;
        for (int j = 0; j < n; j++) {
            for (int k = 0; k <= j; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        int h = 5;
        for (int i = 0; i < h; i++) {
            for (int j = 1; j <= h - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        int g = 5;
        for (int i = 0; i < g; i ++) {
            for (int j = g - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        int line = 4;
        for (int i = 0; i <= line ; i++) {
            for (int j = 0; j <= line-1 ; j++) {
                System.out.print("*");
            }
        }
        System.out.println(" ");

        int k = 0;
        int k2 = 1;
        int k3;
        int count = 5;
        System.out.print(k + " " + k2);
        for (int i = 2; i < count; i++) {
            k3 = k + k2;
            k = k2;
            k2 = k3;
            System.out.print(" " + k3);
        }
        System.out.println(" ");
        int number1 = 4;
        int fact = 1;
        int i = 1;
        while (i <= number1) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of " + number1 + " = " + fact);

        }
    }






