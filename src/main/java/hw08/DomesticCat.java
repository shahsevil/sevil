package hw08;

import java.util.Set;

import static hw08.Species.DOMESTICCAT;

public class DomesticCat extends Pet{
    private String species;

    public DomesticCat(String nickname, int age, int trickLevel,Set<String> habits) {
        super(nickname, age, trickLevel,habits);
        this.species=DOMESTICCAT.name();
    }

    @Override
    void foul() {
        System.out.println("foul method of domestic cat");
    }

    @Override
    void respond() {
        System.out.printf("Hello owner! I am %s. I miss you!",super.getNickname());
    }
}