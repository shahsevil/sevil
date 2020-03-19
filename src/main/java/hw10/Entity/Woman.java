package hw10.Entity;

import hw10.Enums.DayOfWeek;

import java.text.ParseException;
import java.util.Map;

public final class Woman extends Human {

    public Woman(String name, String surname, String year, int iq, Map<DayOfWeek, String> schedule) throws ParseException {
        super(name, surname, year, iq, schedule);
    }

    public Woman(String name, String surname, String year, int iq) throws ParseException {
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