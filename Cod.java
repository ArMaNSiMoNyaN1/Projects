package arman;


public class Cod {
    public static void main(String args[]) {
        double value1 = 77.0d;
        double value2 = 45.0d;
        double result = 0.0d;
        char opCode = 'a';

        if (opCode == 'a')
            result = value1 + value2;
        else if (opCode == 'b')
            result = value1 - value2;
        else if (opCode == 'c')
            result = value1 / value2;
        else if (opCode == 'd')
            result = value1 * value2;
        System.out.println(result);


        int students = 120;
        int room = 0;
        if (room != 0 && students / room > 30)
            System.out.println("Crowded");
        else if (room == 0)
            System.out.println("False");
    }
}