package hw10.Entity;

import hw10.Enums.DayOfWeek;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

public class Human {

    private String name;
    private String surname;
    private long birthDate;
    private int iq;
    private Map<DayOfWeek, String> schedule;
    private Family family;

    static {
        System.out.println("a new class is being loaded");
    }

    public Human(String name, String surname, String date, int iq, Map<DayOfWeek, String> schedule) throws ParseException {
        this.name = name;
        this.surname = surname;
        this.birthDate = new SimpleDateFormat("yyyy/MM/dd").parse(date).getTime();
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human(String name, String surname, String year, int iq) throws ParseException {
        this.name = name;
        this.surname = surname;
        this.birthDate = new SimpleDateFormat("yyyy/MM/dd").parse(year).getTime();
        this.iq = iq;
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

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Map<DayOfWeek, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<DayOfWeek, String> schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    void greetPet(Pet pet) {
        pet = (Pet) family.getPet();
        System.out.printf("Hello, %s!\n", pet.getNickname());
    }

    public String describeAge() {
        LocalDate now = LocalDate.now();
        Date birthday = new Date(birthDate);
        Instant instant = birthday.toInstant();
        Period p = Period.between(LocalDate.from(instant), now);
        return String.format("%s days\n%s months\n%s years", p.getDays(), p.getMonths(), p.getYears());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return birthDate == human.birthDate &&
                iq == human.iq &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Objects.equals(schedule, human.schedule) &&
                Objects.equals(family, human.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthDate, iq, schedule, family);
    }

    @Override
    public String toString() {
        return String.format("Human{name='%s',\n surname='%s',\n year=%s,\n iq=%d,\n}", name, surname, new SimpleDateFormat("yyyy/MM/dd").format(birthDate), iq);
    }
}
