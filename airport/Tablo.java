package arman.airport;

public class Tablo {
    public static void main(String[] args) {
        Airplane airplane = Airplane.ARRIVED;
        System.out.println(airplane);
        switch (airplane) {
            case DURING:
                System.out.print("The plane will arrive on time");
                break;
            case DELAY:
                System.out.print("The plane is a delay");
                break;
            case CANCELED:
                System.out.print("The flight has be canceled");
                break;
            case ARRIVED:
                System.out.print("The plane has landed");
                break;
            case CRUSH:
                System.out.print("Unfortunately the plane crashed");
                break;
        }
    }
}
