package hw10.Entity;

import hw10.Enums.Species;

import java.util.Set;

public class Fish extends Pet {
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
