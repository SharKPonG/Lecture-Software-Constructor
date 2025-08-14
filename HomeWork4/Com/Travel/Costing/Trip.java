package HomeWork4.Com.Travel.Costing;

public class Trip {
    private String from;
    private String to;
    private double distanceKm;
    private double baseFare = 0.0;

    public Trip(String from, String to, double distanceKm, double baseFare){
        this.from = from;
        this.to = to;
        this.distanceKm = distanceKm;
        this.baseFare = baseFare;
    }


    public double calculateFare(){
        if (distanceKm <= 100.0){
            return distanceKm * 5.0;
        }else{
            double firstPart = 100 * 5.0;
            double secondPart = (distanceKm - 100 ) * 3.0;
            return firstPart + secondPart;
        }
    }

    void displayTripSummary(){
        System.out.printf("Trip from %s to %s (%.2f km)\n", from, to, distanceKm);
        System.out.printf("Total Fare: %.2f Baht\n", calculateFare());
    }


    
}



