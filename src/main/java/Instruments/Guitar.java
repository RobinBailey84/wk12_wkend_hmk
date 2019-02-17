package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;
import Instruments.GuitarType;
import Instruments.Instrument;

public class Guitar extends Instrument implements IPlay, ISell {

    private GuitarType guitarType;

    public Guitar(String instrumentType, int broughtPrice, int salePrice, GuitarType guitarType) {
        super(instrumentType, broughtPrice, salePrice);
        this.guitarType = guitarType;
    }

    public String play(){
        return "Instruments.Guitar solo!!";
    }

    public String guitarMake(){
        return this.guitarType.getMake();
    }

    public int guitarStrings(){
        return this.guitarType.getStrings();
    }

    public String guitarType(){
        return this.guitarType.getGuitarType();
    }

    public int calculateMarkup(){
        return this.getSalePrice() - this.getBroughtPrice();
    }

    public String getMake(){
        return this.guitarType.getMake();
    }
}
