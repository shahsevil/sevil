package hw08;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<DayOfWeek,String > mySchedule1 = new HashMap<>();
        mySchedule1.put(DayOfWeek.MONDAY,"aabcd");

        Map<DayOfWeek,String > mySchedule2 = new HashMap<>();
        mySchedule2.put(DayOfWeek.FRIDAY,"aabcd");

        Map<DayOfWeek,String > mySchedule3 = new HashMap<>();
        mySchedule3.put(DayOfWeek.THURSDAY,"aabcd");

        Man father=new Man("Vito", "Karleone", 1991, 1,mySchedule1);
        Woman mother= new Woman("Jane", "Karleone", 1992, 1,mySchedule2);
        Dog myDog= new Dog("Oscar", 3,20, Collections.singleton("eat,drink,sleep"));
        DomesticCat myDomesticCat=new DomesticCat("Lucy",4,60, Collections.singleton("eat,sleep,drink"));
        Fish myFish=new Fish("Bob",1,10, Collections.singleton("drink,sleep,eat"));
        RoboCat myRoboCat=new RoboCat("Sam",5,48, Collections.singleton("sleep,eat,drink"));
        Family family=new Family(mother,father);
        Human child1 = new Human("Michael", "Karleone", 2000, 20,mySchedule3);

        System.out.println("----------------");
        System.out.println("Family without adding:");
        System.out.println(family);

        System.out.println("----------------");
        System.out.println("Added:");
        family.addChild(child1);
        System.out.println(family);

        System.out.println("----------------");
        System.out.println("Deleted:");
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

        father.greetPet(myDog);
        father.greetPet(myDomesticCat);
        father.greetPet(myFish);
        father.greetPet(myRoboCat);
        System.out.println("-----------------");

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
        System.out.println("-------------------");

        mother.greetPet(myDog);
        mother.greetPet(myDomesticCat);
        mother.greetPet(myFish);
        mother.greetPet(myRoboCat);
        System.out.println("----------------");


        father.greetPet(myDog);
        father.greetPet(myDomesticCat);
        father.greetPet(myFish);
        father.greetPet(myRoboCat);
        System.out.println("----------------");
    }
}