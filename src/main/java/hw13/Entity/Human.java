package hw13.Entity;

import hw13.Enums.DayOfWeek;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

public class Human implements Serializable {

    private String name;
    private String surname;
    private long birthDate;
    private int iq;
    private Map<DayOfWeek, String> schedule;
    private Family family;
    private static final long serialVersionUID = 1L;

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

    public long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(long birthDate) {
        this.birthDate = birthDate;
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

    public int describeAge() {
        LocalDate endDate = LocalDate.now();
        Date birthday = new Date(birthDate);
        LocalDate startDate = birthday.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Period p = Period.between(startDate, endDate);
        return p.getYears();
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


    public String prettyFormat() {
        return String.format("{name='%s', surname='%s', year=%s, iq=%d}", name, surname, new SimpleDateFormat("yyyy/MM/dd").format(birthDate), iq);
    }

    @Override
    public String toString() {
        return prettyFormat();
    }
}
