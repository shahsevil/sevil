package hw09;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Man father1 = new Man("Vito", "Karleone", 1991, 1);
        Woman mother1 = new Woman("Jane", "Karleone", 1992, 1);

        Woman mother2 = new Woman("Kate", "Adams", 1992, 1);
        Man father2 = new Man("Ben", "Adams", 1991, 1);

        Man boy = new Man("Jacob", "Karleone", 20, 80);
        Woman girl = new Woman("Emma", "Karleone", 15, 70);

        Family family = new Family(mother1, father1);

        Dog myDog = new Dog("Oscar", 3, 20, Collections.singleton("eat,drink,sleep"));
        DomesticCat myDomesticCat = new DomesticCat("Lucy", 4, 60, Collections.singleton("eat,sleep,drink"));
        Fish myFish = new Fish("Bob", 1, 10, Collections.singleton("drink,sleep,eat"));
        RoboCat myRoboCat = new RoboCat("Sam", 5, 48, Collections.singleton("sleep,eat,drink"));

        FamilyController familyController = new FamilyController();

        familyController.createNewFamily(mother2, father2);
        familyController.adoptChild(family, boy);
        familyController.adoptChild(family, girl);
        familyController.bornChild(family, "Harry", "Sophia");
        familyController.displayAllFamilies();
        familyController.deleteFamilyByIndex(1);
        familyController.deleteAllChildrenOlderThan(15);
        familyController.count();
        familyController.displayAllFamilies();

        // exception??
        familyController.addPet(0, myDog);
//        familyController.addPet(0, myDomesticCat);
//        familyController.addPet(0, myFish);
//        familyController.addPet(0, myRoboCat);
    }
}