package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Drums extends Instrument implements ISell, IPlay {

    private DrumType drumType;

    public Drums(String instrumentType, int broughtPrice, int salePrice, DrumType drumType) {
        super(instrumentType, broughtPrice, salePrice);
        this.drumType = drumType;
    }


    public String getMake(){
        return drumType.getMake();
    }

    public int getNumberOfDrums(){
        return drumType.getNumberOfDrums();
    }

    public int getNumberOfCymbols(){
        return drumType.getNumberOfCymbols();
    }

    public String play(){
        return "bang bang bang";
    }

    public int calculateMarkup(){
        return this.getSalePrice() - this.getBroughtPrice();
    }
}
