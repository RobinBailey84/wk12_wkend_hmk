package Instruments;

public enum HarmonicaType {

    HRICANE("Hricane", "C"),
    HUSDOW("Husdow", "F"),
    ANWENK("Anwenk", "G");

    private final String make;
    private final String key;

    HarmonicaType(String make,String key) {
        this.make = make;
        this.key = key;
    }

    public String getMake() {
        return this.make;
    }


    public String getKey() {
        return this.key;
    }
}
