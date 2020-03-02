package hw08;

import java.util.Map;

public class Woman extends Human {

    public Woman(String name, String surname, int year, int iq, Map<DayOfWeek, String> schedule) {
        super(name, surname, year, iq,schedule);
    }

    void MakeUp(){
        System.out.println("MakeUp is unique method of Woman class:)");
    }

    @Override
    void greetPet(Pet pet) {
        System.out.println("Method redefined...");
    }
}