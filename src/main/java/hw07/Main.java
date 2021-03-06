package hw07;

import static hw07.DayOfWeek.*;

public class Main {
    public static void main(String[] args) {

        Human child[] = new Human[10];
        Man father = new Man("Vito", "Karleone", 1991, 1, new String[][]{{SUNDAY.name(), "dcab"}, {MONDAY.name(), "bcda"}});
        Woman mother = new Woman("Jane", "Karleone", 1992, 1, new String[][]{{TUESDAY.name(), "abcd"}, {WEDNESDAY.name(), "bcda"}});
        Dog myDog = new Dog("Oscar", 3, 20, new String[]{"eat", "drink", "sleep"});
        DomesticCat myDomesticCat = new DomesticCat("Lucy", 4, 60, new String[]{"eat", "drink", "sleep"});
        Fish myFish = new Fish("Bob", 1, 10, new String[]{"eat", "drink", "sleep"});
        RoboCat myRoboCat = new RoboCat("Sam", 5, 48, new String[]{"eat", "drink", "sleep"});
        Family family = new Family(mother, father);
        child[0] = new Human("Michael", "Karleone", 2000, 20, new String[][]{{hw06.DayOfWeek.TUESDAY.name(), "abcd"}, {hw06.DayOfWeek.WEDNESDAY.name(), "bcda"}});
        child[1] = new Human("Kate", "Karleone", 2005, 30, new String[][]{{hw06.DayOfWeek.THURSDAY.name(), "cbda"}, {hw06.DayOfWeek.FRIDAY.name(), "bdac"}});

        System.out.println("----------------");
        System.out.println("Family without adding:");
        System.out.println(family);

        System.out.println("----------------");
        System.out.println("addChild:");
        family.addChild(child[0]);
        family.addChild(child[1]);
        System.out.println(family);

        System.out.println("----------------");
        System.out.println("deleteChild:");
        family.deleteChild(child[1]);
        family.deleteChild(0);
        System.out.println(family);

        System.out.println("----------------");
        family.setPet(myDog);
        System.out.println(family);

        System.out.println("----------------");
        family.setPet(myDomesticCat);
        System.out.println(family);

        System.out.println("----------------");
        family.setPet(myFish);
        System.out.println(family);

        System.out.println("----------------");
        family.setPet(myRoboCat);
        System.out.println(family);

        System.out.println("----------------");

        mother.makeUp();
        father.repairCar();
        System.out.println("---------------");

        myDog.foul();
        myDog.respond();
        myDog.eat();
        System.out.println();

        myDomesticCat.foul();
        myDomesticCat.respond();
        myDomesticCat.eat();
        System.out.println();

        myFish.foul();
        myFish.respond();
        myFish.eat();
        System.out.println();

        myRoboCat.foul();
        myRoboCat.respond();
        myRoboCat.eat();
        System.out.println("-------------------");

        mother.greetPet();
        father.greetPet();
        System.out.println("----------------");
    }
}