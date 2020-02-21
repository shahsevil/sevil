package hw07;


public class Human {

    private String name, surname;
    private int year,iq;
    private Family family;
    private int[][] schedule;

    public Human(String name, String surname, int year, int iq, Family family, int[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.family = family;
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

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public int[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(int[][] schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
//        return String.format("Human{name=%s, surname=%s, year=%d, iq=%d, mother=%s %s,"+"father=%s %s}",name,surname,year,iq, family.getFather().getName(),
                family.getFather().getSurname(), family.getMother().getName(),family.getMother().getSurname());
    }


}
