import Behaviours.ISell;

import java.util.ArrayList;

public class MusicShop {

    private String name;
    private ArrayList<ISell> stockedItems;

    public MusicShop(String name) {
        this.name = name;
        this.stockedItems = new ArrayList<ISell>();
    }

    public String getName() {
        return this.name;
    }

    public int getStockCount() {
        return this.stockedItems.size();
    }

    public void addItemToStock(ISell item) {
        this.stockedItems.add(item);
    }

    public ISell removeItemFromStock() {
        return this.stockedItems.remove(0);
    }

    public int getTotalStockMargin() {
        int stockValue = 0;

        for (ISell isell : stockedItems) {
            stockValue += isell.calculateMarkup();
        }
        return stockValue;
    }

    public boolean findItemInStock(String item) {
        for (ISell isell : stockedItems) {
            if (isell.getMake().equals(item))
                return true;
        }
        return false;
    }

    public ISell findAndRemoveItem(String item) {
        for (ISell isell : stockedItems) {
            if (isell.getMake().equals(item)) {
                int index = this.stockedItems.indexOf(isell);
                return this.stockedItems.remove(index);
            }
        }
        return null;
    }

}
