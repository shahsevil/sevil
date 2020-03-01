package hw07;

public enum Species {
    DOG("Dog"),
    DOMESTICCAT("DomesticCat"),
    FISH("Fish"),
    ROBOCAT("Robocat"),
    UNKNOWN("Unknown kind of animal");
    String string;

    Species(String constr) {
        this.string=constr;
    }

    public String getString(){
        return this.string;
    }
}
