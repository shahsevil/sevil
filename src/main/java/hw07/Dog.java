package hw07;

import static hw07.Species.DOG;

public class Dog extends Pet implements IFoul{
    private String species;

    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        this.species=DOG.getString();
    }

    @Override
    void respond() {
        System.out.printf("Hello owner! I am %s. I miss you!",super.getNickname());
    }

    @Override
    public void foul() {
        System.out.println("Foul method of Dog:)");
    }
}
