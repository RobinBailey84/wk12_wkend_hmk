import Instruments.Harmonica;
import Instruments.HarmonicaType;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HarmonicaTest {

    Harmonica harmonica;

    @Before
    public void before(){
        harmonica = new Harmonica("Instruments.Harmonica", 10, 20, HarmonicaType.ANWENK);
    }

    @Test
    public void harmonicaHasType() {
        assertEquals("Instruments.Harmonica", harmonica.getInstrumentType());
    }


    @Test
    public void harmonicaHasBroughtPrice() {
        assertEquals(10, harmonica.getBroughtPrice());
    }

    @Test
    public void harmonicaHasSalePrice() {
        assertEquals(20, harmonica.getSalePrice());
    }

    @Test
    public void harmonicaHasMake() {
        assertEquals("Anwenk", harmonica.getMake());
    }

    @Test
    public void harmonicaHasKey() {
        assertEquals("G", harmonica.getKey());
    }



}
