import People.Passenger;

public class FlightManager {

    public FlightManager() {
    }


    public double getBaggageWeightPerPassenger(Flight flight) {
        return (flight.getPlane().getWeight() / 2) / flight.getPlane().getCapacity();
    }

    public double getBookedBaggageWeight(Flight flight) {
        //assumes each bag weighs 10.00
        double totalWeight = 0;
        for(Passenger passenger : flight.getPassengers()){
            totalWeight += (passenger.getNumBags() * 10);
        }
        return totalWeight;
    }


    public double getRemainingBaggageWeight(Flight flight) {
        return flight.getPlane().getWeight() / 2 - this.getBookedBaggageWeight(flight);
    }
}
