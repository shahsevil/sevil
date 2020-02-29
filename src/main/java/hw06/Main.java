package hw06;

public class Main {
    public static void main(String[] args) {

        Pet pet = new Pet(Species.CAT, "Rock", 5, 75, new String[]{"eat", "drink", "sleep"});
        Human father = new Human("Vito", "Karleone", 1991, 1, new String[][]{{DayOfWeek.SUNDAY.name(), "dcab"}, {DayOfWeek.MONDAY.name(), "bcda"}});
        Human mother = new Human("Jane", "Karleone", 1992, 1, new String[][]{{DayOfWeek.TUESDAY.name(), "abcd"}, {DayOfWeek.WEDNESDAY.name(), "bcda"}});
        Family family = new Family(mother, father, pet);

        Human child1 = new Human("Michael", "Karleone", 2000, 20, new String[][]{{DayOfWeek.TUESDAY.name(), "abcd"}, {DayOfWeek.WEDNESDAY.name(), "bcda"}});
        Human child2 = new Human("Kate", "Karleone", 2005, 30, new String[][]{{DayOfWeek.THURSDAY.name(), "cbda"}, {DayOfWeek.FRIDAY.name(), "bdac"}});

        System.out.println("---Family---");
        System.out.println(family);
        System.out.println();

        System.out.println("---After adding---");
        family.addChild(child1);
        System.out.println(family);
//        family.addChild(child2);
//        System.out.println(family);
        System.out.println();

        System.out.println("---After deleting---");
        family.deleteChild(0);
        System.out.println(family);

        for (int i = 0; i < 100; i++) {
            new Human();
            System.gc();
        }
    }
}