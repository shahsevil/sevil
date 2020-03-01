package hw07;

import java.util.Arrays;
import java.util.Objects;

public abstract class Pet {
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    static
    {
        System.out.println("a new class is being loaded");
    }

    public Pet(String nickname, int age, int trickLevel, String[] habits) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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

    void eat(){
        System.out.println("I am eating");
    }

    abstract void respond();


    public String toString(){
        String s = String.format("{nickname='%s', age=%d, trickLevel=%d, habits=%s}",nickname,age,trickLevel, Arrays.toString(habits));
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age &&
                trickLevel == pet.trickLevel &&
                Objects.equals(nickname, pet.nickname) &&
                Arrays.equals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nickname, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }

}
