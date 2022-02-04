import People.CabinCrewMember;
import People.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    private CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        this.cabinCrewMember = new CabinCrewMember("Teddy", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void canGetName(){
        assertEquals("Teddy", cabinCrewMember.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void canRelayMessage(){
        assertEquals("Stow tables", cabinCrewMember.relayMessage());
    }
}
