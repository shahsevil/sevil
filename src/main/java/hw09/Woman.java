package hw09;

import java.util.Map;

public final class Woman extends Human {

    public Woman(String name, String surname, int year, int iq, Map<DayOfWeek, String> schedule) {
        super(name, surname, year, iq, schedule);
    }

    public Woman(String name, String surname, int year, int iq) {
        super(name, surname, year, iq);
    }

    void makeUp() {
        System.out.println("MakeUp is unique method of Woman class:)");
    }

    @Override
    void greetPet(Pet pet) {
        System.out.println("Method redefined...");
    }
}