package HomeWork6.ku.cs.swcon.PackageDeliverySystem;

public class Package {
    private double weight;
    private String destination;

    public Package(double weight, String destination){
        this.weight = weight;
        this.destination = destination;
    }
    public double getWeight(){
        return weight;
    }
    public String getDestination(){
        return destination;
    }

    public double calculateShippingFee(){return 0.0;}
}
