package arman.building;

public class Main {
    public static void main(String[] args) {
        Building building = new Building(2, "Argishti 2");
        University university = new University(100, 145, 305, 1650, 4, "Teryan 1");
        Hospital hospital = new Hospital(120, 240, 140, 3, "Abovyan street 11");
        Hotel hotel = new Hotel(60, 40, 120, 2, "Tumanyan street 8");
        building.Info();
        hospital.Info();
        university.Info();
        hotel.Info();
    }
}