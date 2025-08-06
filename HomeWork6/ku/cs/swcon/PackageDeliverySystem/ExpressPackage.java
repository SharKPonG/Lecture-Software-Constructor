package HomeWork6.ku.cs.swcon.PackageDeliverySystem;

public class ExpressPackage extends Package {
    public ExpressPackage(double weight, String destination){
        super(weight, destination);
    }   

    @Override
    public double calculateShippingFee() {
        return (100 * getWeight()) + 50;
    }
}
