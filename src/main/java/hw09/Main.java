package hw09;

import java.util.Collections;

import static java.lang.System.out;

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
        out.println(familyController.adoptChild(family, boy));
        out.println(String.format("\n\nbornChild method:\n%s", familyController.bornChild(family, "Harry", "Sophia")));
        out.print("\n");
        familyController.displayAllFamilies();
        out.print("\nFamily which has index equal to 1 is deleted...");
        familyController.deleteFamilyByIndex(1);////
        familyController.deleteAllChildrenOlderThan(15);
        out.printf("\n\nCount:%d\n%n", familyController.count());
        out.print("Pets added:\n");
        familyController.addPet(0, myDog);
        familyController.addPet(0, myDomesticCat);
        familyController.addPet(0, myFish);
        familyController.addPet(0, myRoboCat);
        familyController.displayAllFamilies();
        out.printf("\n\nadoptChild method:%s\n", familyController.adoptChild(family, girl));
        out.printf("countFamiliesWithMemberNumber method:\n%d", familyController.countFamiliesWithMemberNumber(2));
        out.printf("\n\ngetFamiliesLessThan method(specified num is 6):\n %s", familyController.getFamiliesLessThan(6));
        out.printf("\n\ngetFamiliesBiggerThan method(specified num is 0):\n %s\n", familyController.getFamiliesBiggerThan(0));
    }
}