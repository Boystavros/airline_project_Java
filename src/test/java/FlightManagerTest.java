import People.CabinCrewMember;
import People.Passenger;
import People.Pilot;
import People.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private Flight flight;
    private Pilot pilot;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Plane plane;
    private String flightNum;
    private Airport destination;
    private Airport departsFrom;
    private String departureTime;

    @Before
    public void before(){
        this.pilot = new Pilot("Sacha", Rank.CAPTAIN, "JN4567");
        this.plane = new Plane(PlaneType.BOEING747);
        this.flightNum = "ED123";
        this.destination = Airport.EDI;
        this.departsFrom = Airport.LAX;
        this.departureTime = "0540";
        this.flight = new Flight(pilot, plane, flightNum, destination, departsFrom, departureTime);
        this.passenger1 = new Passenger("Fiona", 1);
        this.passenger2 = new Passenger("Wilbur", 2);
        this.passenger3 = new Passenger("Baby", 1);
        this.flightManager = new FlightManager();
    }

    @Test
    public void testGetBaggageWeightPerPassenger(){
        assertEquals(125.00, flightManager.getBaggageWeightPerPassenger(flight), 0.01);
    }

    @Test
    public void testGetBookedBaggageWeight(){
        flight.bookFlight(passenger1);
        flight.bookFlight(passenger2);
        flight.bookFlight(passenger3);
        assertEquals(40.00, flightManager.getBookedBaggageWeight(flight), 0.01);
    }

    @Test
    public void testGetRemainingBaggageWeight(){
        flight.bookFlight(passenger1);
        flight.bookFlight(passenger2);
        flight.bookFlight(passenger3);
        assertEquals(460.00, flightManager.getRemainingBaggageWeight(flight), 0.01);
    }
}
