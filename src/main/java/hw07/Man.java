package hw07;

public class Man extends Human {

    public Man(String name, String surname, int year, int iq, String[][] schedule) {
        super(name, surname, year, iq, schedule);
    }

    void repairCar(){
        System.out.println("RepairCar is unique method of Man class:)");
    }

    @Override
    void greetPet() {
        System.out.println("greetPet method for Man class");
    }
}
