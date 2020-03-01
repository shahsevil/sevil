package hw07;

import static hw07.Species.UNKNOWN;
public class Unknown extends Pet implements IFoul {
    private String species;
    public Unknown(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        this.species=UNKNOWN.getString();
    }

    @Override
    public void foul() {
        System.out.println("Foul method of Unknown:)");
    }

    @Override
    void respond() {
        System.out.printf("Hello owner! I am %s. I miss you!",super.getNickname());
    }
}
