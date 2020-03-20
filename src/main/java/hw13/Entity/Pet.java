package hw13.Entity;

import hw13.Enums.Species;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

public abstract class Pet implements Serializable {

    protected Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private Set<String> habits;
    private static final long serialVersionUID = 1L;

    public Pet(String nickname, int age, int trickLevel, Set<String> habits) {
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

    public Set<String> getHabits() {
        return habits;
    }

    public void setHabits(Set<String> habits) {
        this.habits = habits;
    }

    void eat() {
        System.out.println("I am eating");
    }

    abstract void respond();

    void foul() {
        System.out.println("foul");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age &&
                trickLevel == pet.trickLevel &&
                Objects.equals(nickname, pet.nickname) &&
                Objects.equals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, age, trickLevel, habits);
    }

    public String prettyFormat() {
        return String.format("%s{nickname='%s', age=%d, trickLevel=%d, habits=%s}\n", species, nickname, age, trickLevel, habits);
    }

    @Override
    public String toString() {
        return prettyFormat();
    }
}
