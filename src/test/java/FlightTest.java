import People.CabinCrewMember;
import People.Passenger;
import People.Pilot;
import People.Rank;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class FlightTest {

    private Flight flight;
    private Pilot pilot;
    private CabinCrewMember cabinCrewMember1;
    private CabinCrewMember cabinCrewMember2;
    private Passenger passenger1;
    private Passenger passenger2;
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
        this.cabinCrewMember1 = new CabinCrewMember("Teddy", Rank.FIRST_OFFICER);
        this.cabinCrewMember2 = new CabinCrewMember("Evie", Rank.PURSER);
        this.passenger1 = new Passenger("Fiona", 1);
        this.passenger2 = new Passenger("Wilbur", 2);
    }

    @Test
    public void testGetPilot() {
        assertEquals("JN4567", flight.getPilot().getLicenceNum());
    }

    @Test
    public void crewListStartsEmpty(){
        assertEquals(0, flight.getCrew().size());
    }

    @Test
    public void testAddCrewMember() {
        flight.addCrewMember(cabinCrewMember1);
        flight.addCrewMember(cabinCrewMember2);
        assertEquals(2, flight.getCrew().size());
    }

    @Test
    public void testPassengerListStartsEmpty() {
        assertEquals(0, flight.getPassengers().size());
    }

    @Test
    public void testAddPassenger(){
        flight.bookFLight(passenger1);
        assertEquals(1, flight.getPassengers().size());
    }

    @Test
    public void testGetPlane() {
        assertEquals(PlaneType.BOEING747, flight.getPlane().getType());
    }

    @Test
    public void testGetFlightNum() {
        assertEquals("ED123", flight.getFlightNum());
    }

    @Test
    public void testGetDestination() {
    }

    @Test
    public void testGetDepartsFrom() {
    }

    @Test
    public void testGetDepartureTime() {
    }
}
