import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before(){
        this.plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void hasPlaneType(){
        assertEquals(PlaneType.BOEING747, plane.getType());
    }

    @Test
    public void canGetPlaneWeight(){
        assertEquals(1000.0, plane.getWeight(), 0.01);
    }

    @Test
    public void canGetPlaneCapacity(){
        assertEquals(4, plane.getCapacity());
    }

}
