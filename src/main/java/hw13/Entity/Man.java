package hw13.Entity;

import hw13.Enums.DayOfWeek;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Map;

public final class Man extends Human implements Serializable {

    private static final long serialVersionUID = 1L;

    public Man(String name, String surname, String year, int iq, Map<DayOfWeek, String> schedule) throws ParseException {
        super(name, surname, year, iq, schedule);
    }

    public Man(String name, String surname, String year, int iq) throws ParseException {
        super(name, surname, year, iq);
    }

    void repairCar() {
        System.out.println("RepairCar is unique method of Man class:)");
    }

    @Override
    void greetPet(Pet pet) {
        System.out.println("Method redefined");
    }
}
