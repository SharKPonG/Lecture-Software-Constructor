package HomeWork3.CarAndCarFactory;

public class Car {
    String model;
    String color;
    final String VIN;
    static int totalCarsProduced = 0;


    public Car (String model, String color, String VIN){
        this.model = model;
        this.color = color;
        this.VIN = VIN;
        Car.totalCarsProduced++;
    }
}
