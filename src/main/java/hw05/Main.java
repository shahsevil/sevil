package hw05;

public class Main {

    public static void main(String[] args){
        familyList1();
        familyList2();
    }



    public static void familyList1() {
        Human father = new Human("Vito", "Karleone", 1990);
        Human mother = new Human("Jane", "Karleone", 1992);
        Pet pet = new Pet("Dog", "Rock", 5, 75, new String[]{"eat,", "drink,", "sleep"});
        Human child = new Human("Michael", "Karleone", 1977, 90, pet, mother, father, new int[7][3]);

        child.describePet();
        System.out.println("");
        child.greetpet();
        System.out.println("");
        pet.eat();
        pet.respond();
        pet.foul();
        System.out.println(pet.toString());
        System.out.println(child.toString());
    }

    public static void familyList2() {
        Human father = new Human("George", "Garfield", 1985);
        Human mother = new Human("Jane", "Garfield", 1990);
        Pet pet = new Pet("Cat", "Bella", 3, 40, new String[]{"jump,", "run,", "sleep"});
        Human child = new Human("Jack", "Garfield", 6, 95, pet, mother, father, new int[7][3]);

        child.describePet();
        child.greetpet();
        pet.eat();
        pet.respond();
        pet.foul();
        System.out.println(pet.toString());
        System.out.println(child.toString());
    }

}
