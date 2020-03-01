package hw07;

import static hw07.Species.ROBOCAT;

public class RoboCat extends Pet implements IFoul {
    private String species;
    public RoboCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        this.species=ROBOCAT.getString();
    }

    @Override
    public void foul() {
        System.out.println("Foul method of RoboCat:)");
    }

    @Override
    void respond() {
        System.out.printf("Hello owner! I am %s. I miss you!",super.getNickname());
    }
}
