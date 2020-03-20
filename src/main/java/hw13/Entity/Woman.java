package hw13.Entity;

import hw13.Enums.DayOfWeek;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Map;

public final class Woman extends Human implements Serializable {
    private static final long serialVersionUID = 1L;

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