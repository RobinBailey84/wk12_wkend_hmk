package Instruments;

import Behaviours.IPlay;

public abstract class Instrument implements IPlay {

    private String instrumentType;
    private int broughtPrice;
    private int salePrice;

    public Instrument(String instrumentType, int broughtPrice, int salePrice){
        this.instrumentType = instrumentType;
        this.broughtPrice = broughtPrice;
        this.salePrice = salePrice;
    }

    public String getInstrumentType() {
        return this.instrumentType;
    }

    public int getBroughtPrice() {
        return this.broughtPrice;
    }

    public int getSalePrice() {
        return this.salePrice;
    }
}
