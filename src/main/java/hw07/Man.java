package hw07;

public class Man extends Human {

    public Man(String name, String surname, int year, int iq, String[][] schedule) {
        super(name, surname, year, iq, schedule);
    }

    void RepairCar(){
        System.out.println("RepairCar is unique method of Man class:)");
    }

    @Override
    void greetPet(Pet pet) {
        System.out.println("Method redefined");
    }
}
