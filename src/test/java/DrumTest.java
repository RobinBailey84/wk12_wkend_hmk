import Instruments.DrumType;
import Instruments.Drums;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DrumTest {

    Drums drums;

    @Before
    public void before(){
        drums = new Drums("Drum", 250, 350, DrumType.GRETSCH);
    }


    @Test
    public void getBroughtPrice() {
        assertEquals(250, drums.getBroughtPrice());
    }

    @Test
    public void getSalePrice() {
        assertEquals(350, drums.getSalePrice());
    }

    @Test
    public void getDrumMake() {
        assertEquals("Gretsch", drums.getMake());
    }

    @Test
    public void getNumberOfDrums() {
        assertEquals(5, drums.getNumberOfDrums());
    }

    @Test
    public void getNumberOfCymbols() {
        assertEquals(2, drums.getNumberOfCymbols());
    }
}
