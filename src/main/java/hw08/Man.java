package hw08;

import java.util.Map;

public class Man extends Human {

    public Man(String name, String surname, int year, int iq,Map<DayOfWeek ,String > schedule) {
        super(name, surname, year, iq,schedule);
    }

    void repairCar(){
        System.out.println("RepairCar is unique method of Man class:)");
    }

    @Override
    void greetPet(Pet pet) {
        System.out.println("Method redefined");
    }
}
