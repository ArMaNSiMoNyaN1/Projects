package arman;

import java.util.LinkedList;

public class Porc {

    //psvm
    public static void main(String[] args) {
//        LinkedList<String> cars = new LinkedList<String>();
//        String[] car = {"Bmw", "Audi", "Porsche", "Bentley"};
//        for (int index = 0; index < car.length; index++) {
//            System.out.println(car[index]);
//            for (int i = car.length - 1; i >= 0; i--) {
//                System.out.println(car[i]);

        System.out.println("1.*-ov stanal 4 toxanoc patker amen toxum 1-* ov avel qan naxordum ev hakarak patkern");
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
                for (int i = 0; i <= n; i++) {
                    for (int j = 0; j < n - i; j++) {
                        System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("2.Gtnel ayn tiv@ vor@ chi krknvum 2 angam");
        int[] array = new int[]{5, 77, 5, 77, 12, 12, 22, 32, 32};
        int result = array[0];
        for (int i = 1; i < array.length; i++) {

            result = result ^ array[i];
        }
        System.out.println(result);
        System.out.println("");
        System.out.println("3.X-in tal y-i arjeqn, isk y-in x-i");
        int x = 34, y = 89;
        int z = x;
        x = y;
        y = z;
        System.out.println("x = " + x + " y = " + y);
        System.out.println("");
        System.out.println("4.Dasavorel zangvacn hajordakanutyamb");
        boolean qaniDerIfMtnume = true;
        int countOfFors = 0;
        while (qaniDerIfMtnume) {
            qaniDerIfMtnume = false;
            for (int i = 0; i < array.length - 1 - countOfFors; i++) {
                if (array[i] > array[i + 1]) {
                    int zz = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = zz;
                    qaniDerIfMtnume = true;
                }
            }
            countOfFors++;
        }
    }

    }
//        }
//    }
//}