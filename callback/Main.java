package arman.callback;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Aram", "Manukyan");
        Bus bus = new Bus("Zhong Tong", "LCK6", 30, driver);
        bus.Stop();
    }
}