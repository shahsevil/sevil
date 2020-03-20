package hw13.Entity;

import hw13.Enums.Species;

import java.io.Serializable;
import java.util.Set;

public class Fish extends Pet implements Serializable {

    private static final long serialVersionUID = 1L;

    public Fish(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
        this.species = Species.FISH;
    }

    @Override
    void foul() {
        System.out.println("foul method of fish");
    }

    @Override
    void respond() {
        System.out.printf("Hello owner! I am %s. I miss you!", super.getNickname());
    }
}
