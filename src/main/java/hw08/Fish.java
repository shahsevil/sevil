package hw08;

import java.util.Set;

import static hw08.Species.FISH;

public class Fish extends Pet {
    private String species;
    public Fish(String nickname, int age, int trickLevel,Set<String> habits) {
        super(nickname, age, trickLevel,habits);
        this.species=FISH.name();
    }

    @Override
    void foul() {
        System.out.println("foul method of fish");
    }

    @Override
    void respond() {
        System.out.printf("Hello owner! I am %s. I miss you!",super.getNickname());
    }
}
