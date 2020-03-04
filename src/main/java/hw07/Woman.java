package hw07;

public class Woman extends Human{
    public Woman(String name, String surname, int year, int iq, String[][] schedule) {
        super(name, surname, year, iq, schedule);
    }

    void makeUp(){
        System.out.println("MakeUp is unique method of Woman class:)");
    }

    @Override
    void greetPet() {
        System.out.println("greetPet method for Woman class");
    }
}
