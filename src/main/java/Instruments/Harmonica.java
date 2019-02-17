package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;
import Instruments.HarmonicaType;
import Instruments.Instrument;

public class Harmonica extends Instrument implements IPlay, ISell {

    private HarmonicaType harmonicaType;

    public Harmonica(String instrumentType, int broughtPrice, int salePrice, HarmonicaType harmonicaType) {
        super(instrumentType, broughtPrice, salePrice);
        this.harmonicaType = harmonicaType;
    }

    public String play(){
        return "Instruments.Harmonica solo";
    }

    public String getType(){
        return this.getInstrumentType();
    }


    public String getKey(){
        return this.harmonicaType.getKey();
    }

    public String getMake(){
        return this.harmonicaType.getMake();
    }

    public int calculateMarkup(){
        return this.getSalePrice() - this.getBroughtPrice();
    }
}
