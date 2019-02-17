package Instruments;

public enum DrumType {

    PEARL("Pearl", 4, 3),
    GRETSCH("Gretsch", 5, 2),
    LUDWIG("Ludwig", 8, 6);

    private final String make;
    private final int numberOfDrums;
    private final int numberOfCymbols;

    DrumType(String make, int numberOfDrums, int numberOfCymbols) {
        this.make = make;
        this.numberOfDrums = numberOfDrums;
        this.numberOfCymbols = numberOfCymbols;
    }

    public String getMake() {
        return this.make;
    }

    public int getNumberOfDrums() {
        return this.numberOfDrums;
    }

    public int getNumberOfCymbols() {
        return this.numberOfCymbols;
    }
}
