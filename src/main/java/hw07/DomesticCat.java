package hw07;

import static hw07.Species.DOMESTICCAT;

public class DomesticCat extends Pet{
    private String species;

    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        this.species=DOMESTICCAT.name();
    }

    @Override
    void foul() {
        System.out.println("Foul method of domesticcat");
        super.foul();
    }

    @Override
    void respond() {
        System.out.printf("Hello owner! I am %s. I miss you!",super.getNickname());
    }
}
