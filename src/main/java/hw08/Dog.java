package hw08;

import java.util.Set;

import static hw08.Species.DOG;

public class Dog extends Pet {
    private String species;

    public Dog(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
        this.species = DOG.name();
    }

    @Override
    void foul() {
        System.out.println("Foul method of dog");
    }

    @Override
    void respond() {
        System.out.printf("Hello owner! I am %s. I miss you!", super.getNickname());
    }
}