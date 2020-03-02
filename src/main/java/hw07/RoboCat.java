package hw07;

import static hw07.Species.ROBOCAT;

public class RoboCat extends Pet {
    private String species;
    public RoboCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        this.species=ROBOCAT.name();
    }

    @Override
    void foul() {
        System.out.println("Foul method of robocat");
        super.foul();
    }

    @Override
    void respond() {
        System.out.printf("Hello owner! I am %s. I miss you!",super.getNickname());
    }
}
