package arman.callback1;

public class Main {
    public static void main(String[] args) {
        Colonel colonel = new Colonel("Artak", "Simonyan", 47, 14);
        Platoon platoon = new Platoon(30);
        Lieutenant lieutenant = new Lieutenant("Tigran", "Manukyan", 23, 2, platoon);
        colonel.Order();
        lieutenant.Bidding();
    }
}
