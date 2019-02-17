import Instruments.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MusicShopTest {

    Guitar guitar;
    Drums drums;
    Harmonica harmonica;
    MusicShop musicShop;

    @Before
    public void before(){
        musicShop = new MusicShop("Glasgow Music Shop");
        drums = new Drums("Drum Kit", 200, 300, DrumType.LUDWIG);
        guitar = new Guitar("Acoustic", 500, 750, GuitarType.GIBSONLESPAUL);
        harmonica = new Harmonica("Instruments.Harmonica", 10, 30, HarmonicaType.HRICANE);
    }

    @Test
    public void shopHasName() {
        assertEquals("Glasgow Music Shop", musicShop.getName());
    }

    @Test
    public void shopStockIsEmpty() {
        assertEquals(0, musicShop.getStockCount());
    }

    @Test
    public void checkStockCanBeAdded() {
        musicShop.addItemToStock(guitar);
        assertEquals(1, musicShop.getStockCount());
    }

    @Test
    public void canGetTotalStockMargin() {
        musicShop.addItemToStock(guitar);
        musicShop.addItemToStock(drums);
        musicShop.addItemToStock(harmonica);
        assertEquals(370, musicShop.getTotalStockMargin());
    }

    @Test
    public void canRemoveItemFromStock() {
        musicShop.addItemToStock(guitar);
        musicShop.addItemToStock(drums);
        musicShop.removeItemFromStock();
        assertEquals(1, musicShop.getStockCount());
    }

    @Test
    public void checkCanSearchStockFound() {
        musicShop.addItemToStock(guitar);
        musicShop.addItemToStock(drums);
        assertEquals(true, musicShop.findItemInStock("Gibson"));
    }

    @Test
    public void checkCanSearchStockNotFound() {
        musicShop.addItemToStock(guitar);
        musicShop.addItemToStock(drums);
        assertEquals(false, musicShop.findItemInStock("Martin"));
    }

    @Test
    public void canFindAndRemoveItem() {
        musicShop.addItemToStock(guitar);
        musicShop.addItemToStock(drums);
        musicShop.addItemToStock(harmonica);
        musicShop.findAndRemoveItem("Ludwig");
        assertEquals(2, musicShop.getStockCount());
    }
}
