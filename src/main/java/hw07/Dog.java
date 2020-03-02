package hw07;

import static hw07.Species.DOG;

public class Dog extends Pet{
    private String species;

    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        this.species=DOG.name();
    }

    @Override
    void foul() {
        System.out.println("Foul method of dog");
        super.foul();
    }

    @Override
    void respond() {
        System.out.printf("Hello owner! I am %s. I miss you!",super.getNickname());
    }
}
