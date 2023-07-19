package arman;

public class Car {
    String brand;
    String model;
    short horsePower;
    short year;
    double engineCapacity;
    boolean isCabriolet;
    String color;

    public static void main(String[] args) {
        Car thisCar = new Car();
        thisCar.printCarInfo();
    }

    void printCarInfo() {
        System.out.print("Brand of this car - " + brand + " Model of car - " + model + " Horsepower - " + horsePower + "\n" + "Is the year of the issue - " + year +
                " Volume of  engine - " + engineCapacity + " Cabriolet - " + isCabriolet + " Color - " + color);
    }
}
