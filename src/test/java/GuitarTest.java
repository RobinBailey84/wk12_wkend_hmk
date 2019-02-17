import Instruments.Guitar;
import Instruments.GuitarType;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Instruments.Guitar",700, 950, GuitarType.MARTIND1);
    }

    @Test
    public void guitarHasType() {
        assertEquals("Instruments.Guitar", guitar.getInstrumentType());
    }


    @Test
    public void guitarHasBroughtPrice() {
        assertEquals(700, guitar.getBroughtPrice());
    }

    @Test
    public void guitarHasSalePrice() {
        assertEquals(950, guitar.getSalePrice());
    }

    @Test
    public void guitarHasMake() {
        assertEquals("Martin", guitar.guitarMake());
    }

    @Test
    public void hasStrings() {
        assertEquals(6, guitar.guitarStrings());
    }

    @Test
    public void hasType() {
        assertEquals("Acoustic", guitar.guitarType());
    }
}
