package hw06;

import hw05.Human;
import hw05.Pet;

public class Main {

    public static void main(String[] args){
        familyList1();
        familyList2();
    }



    public static void familyList1() {
        hw05.Human father = new hw05.Human("Vito", "Karleone", 1990);
        hw05.Human mother = new hw05.Human("Jane", "Karleone", 1992);
        hw05.Pet pet = new hw05.Pet("Dog", "Rock", 5, 75, new String[]{"eat,", "drink,", "sleep"});
        hw05.Human child = new hw05.Human("Michael", "Karleone", 1977, 90, pet, mother, father, new int[7][3]);

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
        hw05.Human father = new hw05.Human("George", "Garfield", 1985);
        hw05.Human mother = new hw05.Human("Jane", "Garfield", 1990);
        hw05.Pet pet = new Pet("Cat", "Bella", 3, 40, new String[]{"jump,", "run,", "sleep"});
        hw05.Human child = new Human("Jack", "Garfield", 6, 95, pet, mother, father, new int[7][3]);

        child.describePet();
        child.greetpet();
        pet.eat();
        pet.respond();
        pet.foul();
        System.out.println(pet.toString());
        System.out.println(child.toString());
    }



}
