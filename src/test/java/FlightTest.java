import People.CabinCrewMember;
import People.Passenger;
import People.Pilot;
import People.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class FlightTest {

    private Flight flight;
    private Flight flight2;
    private Pilot pilot;
    private CabinCrewMember cabinCrewMember1;
    private CabinCrewMember cabinCrewMember2;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Plane plane;
    private Plane plane2;
    private String flightNum;
    private Airport destination;
    private Airport departsFrom;
    private String departureTime;

    @Before
    public void before(){
        this.pilot = new Pilot("Sacha", Rank.CAPTAIN, "JN4567");
        this.plane = new Plane(PlaneType.BOEING747);
        this.plane2 = new Plane(PlaneType.AIRBUSA380);
        this.flightNum = "ED123";
        this.destination = Airport.EDI;
        this.departsFrom = Airport.LAX;
        this.departureTime = "0540";
        this.flight = new Flight(pilot, plane, flightNum, destination, departsFrom, departureTime);
        this.cabinCrewMember1 = new CabinCrewMember("Teddy", Rank.FIRST_OFFICER);
        this.cabinCrewMember2 = new CabinCrewMember("Evie", Rank.PURSER);
        this.passenger1 = new Passenger("Fiona", 1);
        this.passenger2 = new Passenger("Wilbur", 2);
        this.passenger3 = new Passenger("Baby", 1);
        this.flight2 = new Flight(pilot, plane2, flightNum, destination, departsFrom, departureTime);
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
        flight.bookFlight(passenger1);
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
        assertEquals(Airport.EDI, flight.getDestination());
    }

    @Test
    public void testGetDepartsFrom() {
        assertEquals(Airport.LAX, flight.getDepartsFrom());
    }

    @Test
    public void testGetDepartureTime() {
        assertEquals("0540", flight.getDepartureTime());
    }

    @Test
    public void testGetAvailableSeats(){
        flight.bookFlight(passenger1);
        flight.bookFlight(passenger2);
        assertEquals(2, flight.getAvailableSeats());
    }

    @Test
    public void testCannotBookFlightFull(){
        flight2.bookFlight(passenger1);
        flight2.bookFlight(passenger2);
        flight2.bookFlight(passenger3);
        assertEquals(2, flight2.getPassengers().size());
    }
}
