package hw07;

import static hw07.DayOfWeek.*;

public class Main {
    public static void main(String[] args) {

        Man father=new Man("Vito", "Karleone", 1991, 1, new String[][]{{SUNDAY.getString(), "dcab"}, {MONDAY.getString(), "bcda"}});
        Woman mother= new Woman("Jane", "Karleone", 1992, 1, new String[][]{{TUESDAY.getString(), "abcd"}, {WEDNESDAY.getString(), "bcda"}});
        Dog myDog= new Dog("Oscar", 3,20, new String[]{"eat", "drink", "sleep"});
        DomesticCat myDomesticCat=new DomesticCat("Lucy",4,60, new String[]{"eat", "drink", "sleep"});
        Fish myFish=new Fish("Bob",1,10, new String[]{"eat", "drink", "sleep"});
        RoboCat myRoboCat=new RoboCat("Sam",5,48, new String[]{"eat", "drink", "sleep"});
        Unknown myUnknown= new Unknown("Unknown",2,50, new String[]{"eat", "drink", "sleep"});
        Family family=new Family(mother,father);
        Human child1 = new Human("Michael", "Karleone", 2000, 20, new String[][]{{TUESDAY.getString(), "abcd"}, {WEDNESDAY.getString(), "bcda"}});

        System.out.println("----------------");
        System.out.println("Family without adding:");
        System.out.println(family);

        System.out.println("----------------");
        System.out.println("addChild:");
        family.addChild(child1);
        System.out.println(family);

        System.out.println("----------------");
        System.out.println("deleteChild:");
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
        family.setPet(myUnknown);
        System.out.println(family);
        System.out.println("---------------");

        mother.MakeUp();
        father.RepairCar();
        System.out.println("---------------");

        myDog.foul();
        myDog.respond();
        myDog.eat();

        myDomesticCat.foul();
        myDomesticCat.respond();
        myDomesticCat.eat();

        myFish.foul();
        myFish.respond();
        myFish.eat();

        myRoboCat.foul();
        myRoboCat.respond();
        myRoboCat.eat();

        myUnknown.foul();
        myUnknown.respond();
        myUnknown.eat();
        System.out.println("-------------------");

        mother.greetPet(myDog);
        mother.greetPet(myDomesticCat);
        mother.greetPet(myFish);
        mother.greetPet(myRoboCat);
        mother.greetPet(myUnknown);
        System.out.println("----------------");

        father.greetPet(myDog);
        father.greetPet(myDomesticCat);
        father.greetPet(myFish);
        father.greetPet(myRoboCat);
        father.greetPet(myUnknown);
        System.out.println("----------------");
    }
}