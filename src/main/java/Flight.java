import People.CabinCrewMember;
import People.Passenger;
import People.Pilot;

import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> crew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNum;
    private Airport destination;
    private Airport departsFrom;
    private String departureTime;


    public Flight(Pilot pilot, Plane plane, String flightNum, Airport destination, Airport departsFrom, String departureTime) {
        this.pilot = pilot;
        this.crew = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNum = flightNum;
        this.destination = destination;
        this.departsFrom = departsFrom;
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public ArrayList<CabinCrewMember> getCrew() {
        return crew;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public Airport getDestination() {
        return destination;
    }

    public Airport getDepartsFrom() {
        return departsFrom;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void addCrewMember(CabinCrewMember cabinCrewMember) {
        this.crew.add(cabinCrewMember);
    }

    public void bookFLight(Passenger passenger) {
        this.passengers.add(passenger);
    }
}
