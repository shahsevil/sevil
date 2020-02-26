package hw05;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    static
    {
        System.out.println("a new class is being loaded");
    }

    {
        System.out.println("a new object is created");
    }

    public Pet(String species, String nickname, int age, int trickLevel,String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

//    void eat(){ System.out.println("I am eating."); }
//    void respond(){System.out.printf("Hello, owner. I am %s. I miss you!\n",this.nickname);}
//    void foul(){System.out.println("I need to cover it up.\n");}


    String tricklevel(int tricklevel){
        String sly="";
        if (tricklevel>50 && tricklevel<=100) sly="very sly";
        else if (tricklevel>0 && tricklevel<=50) sly="is not very sly";
        return sly;
    }

    String habits(String [] habits){
        String str="";
        for(String el:habits) str=str+el;
        return str;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }


    public String toString(){
        String s = String.format("%s{nickname='%s', age=%d, trickLevel=%d, habits=%s}",
                species,nickname,age,trickLevel, Arrays.toString(habits));
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age &&
                trickLevel == pet.trickLevel &&
                Objects.equals(species, pet.species) &&
                Objects.equals(nickname, pet.nickname) &&
                Arrays.equals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickname, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }
}
