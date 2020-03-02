package hw07;

import static hw07.Species.FISH;

public class Fish extends Pet {
    private String species;
    public Fish(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        this.species=FISH.name();
    }

    @Override
    void foul() {
        System.out.println("Foul method of fish");
        super.foul();
    }

    @Override
    void respond() {
        System.out.printf("Hello owner! I am %s. I miss you!",super.getNickname());
    }
}
