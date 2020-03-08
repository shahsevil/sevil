package hw08;

import java.util.Set;

public class Dog extends Pet {

    public Dog(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
        this.species = Species.DOG;
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