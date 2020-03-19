package hw12;

import hw12.Controller.FamilyController;
import hw12.Entity.*;
import hw12.io.ConsoleMain;

import java.text.ParseException;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws ParseException {

        Man father1 = new Man("Vito", "Karleone", "1991/11/03", 1);
        Woman mother1 = new Woman("Jane", "Karleone", "1992/03/05", 1);

        Woman mother2 = new Woman("Kate", "Adams", "1995/04/02", 1);
        Man father2 = new Man("Ben", "Adams", "1993/06/06", 1);

        Man boy = new Man("Jacob", "Karleone", "2000/03/04", 80);
        Woman girl = new Woman("Emma", "Karleone", "2003/05/09", 70);

        Dog myDog = new Dog("Oscar", 3, 20, Collections.singleton("eat,drink,sleep"));
        Fish myFish = new Fish("Bob", 1, 10, Collections.singleton("drink,sleep,eat"));

        FamilyController familyController = new FamilyController();
        ConsoleMain consoleMain = new ConsoleMain();

        boolean quit = false;
        while (!quit) {
            consoleMain.printLn(FamilyController.showMenu());
            consoleMain.print("Enter menu num: \n");
            String input = consoleMain.readLn();
            switch (input) {
                case "1":
                    familyController.createNewFamily(mother1, father1);
                    familyController.createNewFamily(mother2, father2);
                    familyController.addPet(0, myDog);
                    familyController.addPet(1, myFish);
                    familyController.getFamilyById(1).addChild(boy);
                    familyController.getFamilyById(0).addChild(girl);
                    break;
                case "2":
                    consoleMain.printLn(String.valueOf(familyController.getAllFamilies()));
                    break;
                case "3":
                    consoleMain.printLn("Enter the number:");
                    int num1 = Integer.parseInt(consoleMain.readLn());
                    consoleMain.printLn(String.valueOf(familyController.getFamiliesBiggerThan(num1)));
                    break;
                case "4":
                    consoleMain.printLn("Enter the number:");
                    int num2 = Integer.parseInt(consoleMain.readLn());
                    consoleMain.printLn(String.valueOf(familyController.getFamiliesLessThan(num2)));
                    break;
                case "5":
                    consoleMain.printLn("Enter the number:");
                    int num3 = Integer.parseInt(consoleMain.readLn());
                    consoleMain.printLn(String.valueOf(familyController.countFamiliesWithMemberNumber(num3)));
                    break;
                case "6":
                    try {
                        consoleMain.printLn("Mother's first name:");
                        String mFirstName = consoleMain.readLn();
                        consoleMain.printLn("Mother's last name:");
                        String mLastName = consoleMain.readLn();
                        consoleMain.printLn("Mother's birth date(format:yyyy/MM/dd):");
                        String mBirthDate = consoleMain.readLn();
                        consoleMain.printLn("Mother's iq:");
                        int mIq = Integer.parseInt(consoleMain.readLn());

                        consoleMain.printLn("Father's first name:");
                        String fFirstName = consoleMain.readLn();
                        consoleMain.printLn("Father's last name:");
                        String fLastName = consoleMain.readLn();
                        consoleMain.printLn("Father's birth date(format:yyyy/MM/dd):");
                        String fBirthDate = consoleMain.readLn();
                        consoleMain.printLn("Father's iq:");
                        int fIq = Integer.parseInt(consoleMain.readLn());

                        familyController.createNewFamily(new Human(mFirstName, mLastName, mBirthDate, mIq), new Human(fFirstName, fLastName, fBirthDate, fIq));
                    } catch (NumberFormatException ex) {
                        System.out.println("Something went wrong..");
                    } catch (ParseException ex) {
                        System.out.println("Something went wrong..");
                    }
                    break;
                case "7":
                    consoleMain.printLn("Enter index which you want to delete:");
                    int index = Integer.parseInt(consoleMain.readLn());
                    familyController.deleteFamilyByIndex(index);
                    break;
                case "8":
                    consoleMain.printLn(familyController.showChildMenu());
                    consoleMain.printLn("Enter menu num:");
                    String menuNum = consoleMain.readLn();
                    switch (menuNum) {
                        case "1":
                            consoleMain.printLn("Enter family identifier (ID)");
                            int id = Integer.parseInt(consoleMain.readLn());
                            consoleMain.printLn("Name for girl:");
                            String gName = consoleMain.readLn();
                            consoleMain.printLn("Name for boy:");
                            String bName = consoleMain.readLn();
                            familyController.bornChild(familyController.getFamilyById(id), bName, gName);
                            break;
                        case "2":
                            consoleMain.printLn("Enter family identifier (ID)");
                            int id1 = Integer.parseInt(consoleMain.readLn());
                            consoleMain.printLn("First name:");
                            String name = consoleMain.readLn();
                            consoleMain.printLn("Last name:");
                            String surName = consoleMain.readLn();
                            consoleMain.printLn("Birth date(format:yyyy/MM/dd):");
                            String birthDate = consoleMain.readLn();
                            consoleMain.printLn("Iq:");
                            int iq = Integer.parseInt(consoleMain.readLn());
                            familyController.getFamilyById(id1).addChild(new Human(name, surName, birthDate, iq));
                            break;
                        case "3":
                            familyController.showMenu();
                            break;
                    }
                    break;
                case "9":
                    consoleMain.printLn("Enter age:");
                    int age = Integer.parseInt(consoleMain.readLn());
                    familyController.deleteAllChildrenOlderThan(age);
                    break;
                case "10":
                    quit = true;
                    break;
            }
        }
    }
}