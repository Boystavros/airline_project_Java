import People.Pilot;
import People.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest{

    private Pilot pilot;

    @Before
    public void before(){
        this.pilot = new Pilot("Wilbur", Rank.CAPTAIN, "JN4567");
    }

    @Test
    public void canGetName(){
        assertEquals("Wilbur", pilot.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void canGetLicenceNum(){
        assertEquals("JN4567", pilot.getLicenceNum());
    }
}
