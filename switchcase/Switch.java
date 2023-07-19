package arman.switchcase;

public class Switch {
    public static void main(String[] args) {
        int bus = 22;
        switch (bus) {
            case 8:
                System.out.println("This is bus number 8");
                break;
            case 22:
                System.out.println("This is bus number 22");
                break;
            case 33:
                System.out.println("This is bus number 33");
                break;
            case 35:
                System.out.println("This is bus number 35");
                break;
            case 42:
                System.out.println("This is bus number 42");
                break;
            default:
                System.out.println("Your search term was not found");
        }
        System.out.println("");
        int helicopter = 1;
        switch (helicopter) {
            case 2:
                System.out.println("This is a plane");
                break;
            case 4:
                System.out.println("This is a ship");
                break;
            case 6:
                System.out.println("This is a car");
                 break;
            default:
                System.out.println("Nothing found for your request");
        }
    }
}