package HomeWork3.CarAndCarFactory;

public class CarFactory {
    public Car produceCar(String model, String color){
        return new Car(model, color, "VIN" + Car.totalCarsProduced);
    }
}
