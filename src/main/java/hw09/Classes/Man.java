package hw09.Classes;

import hw09.Enums.DayOfWeek;

import java.util.Map;

public final class Man extends Human {

    public Man(String name, String surname, int year, int iq, Map<DayOfWeek, String> schedule) {
        super(name, surname, year, iq, schedule);
    }

    public Man(String name, String surname, int year, int iq) {
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
