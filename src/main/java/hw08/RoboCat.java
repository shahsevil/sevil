package hw08;

import java.util.Set;

import static hw08.Species.ROBOCAT;

public class RoboCat extends Pet{

    private String species;

    public RoboCat(String nickname, int age, int trickLevel,Set<String> habits) {
        super(nickname, age, trickLevel,habits);
        this.species=ROBOCAT.name();
    }

    @Override
    void foul() {
        System.out.println("Foul method of robocat");
    }

    @Override
    void respond() {
        System.out.printf("Hello owner! I am %s. I miss you!",super.getNickname());
    }
}