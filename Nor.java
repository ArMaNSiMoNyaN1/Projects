package arman;

public class Nor {
    public static void main(String[] args) {
        int monthDays[];
        monthDays = new int[12];
        monthDays[0] = 31;
        monthDays[1] = 28;
        monthDays[2] = 31;
        monthDays[3] = 30;
        monthDays[4] = 31;
        monthDays[5] = 30;
        monthDays[6] = 31;
        monthDays[7] = 31;
        monthDays[8] = 30;
        monthDays[9] = 31;
        monthDays[10] = 30;
        monthDays[11] = 31;
        System.out.println("In April days of " + monthDays[3]);
        System.out.println("-------");
        int[] daysMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        System.out.println("On February " + daysMonth[1] + " days");
        java.lang.String[] avto = {"JAGUAR", "HUMMER", "ROLLS ROYSE", "Bentley"};
        System.out.println(avto[0]);
        int[] dubl = {1, 2, 4, 6, 3, 9, 7,3};
//                     for (int tiv:dubl ) {
        //                         System.out.print(tiv % 2 == 0);
        for (int i = 2; i <= dubl.length; i += 2) {
            //     if (tiv : dubl ==0)
            System.out.print(dubl);
        }
        System.out.println(" ");
        // for (zuyg:dubl) System.out.println();
        int sum = 0;
        for (int tiv : dubl) {
              sum = sum + tiv;
        }
        System.out.println(sum);
    }
}
//}

