package hw07;

import java.util.Arrays;
import java.util.Objects;

public class Human {

    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule;
    private Family family;

    static
    {
        System.out.println("a new class is being loaded");
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human() {
    }

    public Family getFamily() {
        return family;
    }

    public Human(String name, String surname, int year, int iq, String [][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public String getSchedule() {
        return Arrays.deepToString(schedule);
    }

    public void setSchedule(String [][] schedule) {
        this.schedule = schedule;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    void greetPet(Pet pet) {
        pet = family.getPet();
        System.out.printf("Hello, %s!\n", pet.getNickname());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        if (o.hashCode() != this.hashCode()) return false;
        return year == human.year &&
                iq == human.iq &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Arrays.equals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Human{name='%s',\n surname='%s',\n year=%d,\n iq=%d,\n schedule=%s}",name, surname, year, iq, Arrays.deepToString(schedule));
    }
}
