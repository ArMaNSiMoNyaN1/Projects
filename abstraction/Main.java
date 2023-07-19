package arman.abstraction;

public class  Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(50, 70, 150, 5, "Nalbandyan  street 2");
        University university = new University(140, 220, 320, 1080, 6, "Hanrapetutyan 26");
        Hospital hospital = new Hospital(120, 330, 140, 4, "Muracan 6");
        hotel.Info();
        university.Info();
        hospital.Info();
    }
}