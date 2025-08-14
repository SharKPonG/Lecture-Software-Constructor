package HomeWork4.Com.Travel.Costing;

public class TripPlanner {
    public Trip planTrip(String from, String to, double distanceKm, double baseFare) {
        return new Trip(from, to, distanceKm, baseFare);
    }

    public static void main(String[] args) {
        TripPlanner planner = new TripPlanner();    
        Trip trip = planner.planTrip("Bangkok", "Hua Hin", 180.0, 0.0);
        trip.displayTripSummary();
    }
}
