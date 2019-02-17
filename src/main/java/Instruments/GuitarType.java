package Instruments;

public enum GuitarType {

    MARTIND1("Martin", 6, "Acoustic"),
    FENDERSTRATOCASTER("Fender", 6, "Electric"),
    GIBSONLESPAUL("Gibson", 6, "Electric");

    private final String make;
    private final int strings;
    private final String guitarType;

    GuitarType(String make, int strings, String guitarType){
        this.make = make;
        this.strings = strings;
        this.guitarType = guitarType;

    }

    public String getMake() {
        return this.make;
    }

    public int getStrings() {
        return this.strings;
    }

    public String getGuitarType() {
        return this.guitarType;
    }
}
