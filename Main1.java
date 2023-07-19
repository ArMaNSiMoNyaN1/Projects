package arman;

public class Main1 {
    public static void main(String[] args) {
        Car thisCar = new Car();
        thisCar.brand = "BMW";
        thisCar.model = "M5";
        thisCar.horsePower = 600;
        thisCar.year = 2022;
        thisCar.engineCapacity = 4.4;
        thisCar.isCabriolet = false;
        thisCar.color = "Blue";
        thisCar.printCarInfo();
    }
}
