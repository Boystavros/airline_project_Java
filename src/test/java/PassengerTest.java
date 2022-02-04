import People.Passenger;
import People.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest{

    private Passenger passenger;

    @Before
    public void before(){
        this.passenger = new Passenger("Sacha", 1);
    }

    @Test
    public void canGetName(){
        assertEquals("Sacha", passenger.getName());
    }

    @Test
    public void canGetNumBags(){
        assertEquals(1, passenger.getNumBags());
    }





}
