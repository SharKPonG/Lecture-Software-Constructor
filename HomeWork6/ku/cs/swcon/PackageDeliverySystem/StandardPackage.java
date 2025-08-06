package HomeWork6.ku.cs.swcon.PackageDeliverySystem;

public class StandardPackage extends Package{
    public StandardPackage(double weight, String destination){
        super(weight, destination);
    }

    @Override
    public double calculateShippingFee() {
        return 50 * getWeight();
    }
}
