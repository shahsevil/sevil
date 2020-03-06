package hw06;

public class Main {
    public static void main(String[] args) {

        Human child[] = new Human[10];
        Pet pet = new Pet(Species.CAT, "Rock", 5, 75, new String[]{"eat", "drink", "sleep"});
        Human father = new Human("Vito", "Karleone", 1991, 1, new String[][]{{DayOfWeek.SUNDAY.name(), "dcab"}, {DayOfWeek.MONDAY.name(), "bcda"}});
        Human mother = new Human("Jane", "Karleone", 1992, 1, new String[][]{{DayOfWeek.TUESDAY.name(), "abcd"}, {DayOfWeek.WEDNESDAY.name(), "bcda"}});
        Family family = new Family(mother, father, pet);
        child[0] = new Human("Michael", "Karleone", 2000, 20, new String[][]{{DayOfWeek.TUESDAY.name(), "abcd"}, {DayOfWeek.WEDNESDAY.name(), "bcda"}});
        child[1] = new Human("Kate", "Karleone", 2005, 30, new String[][]{{DayOfWeek.THURSDAY.name(), "cbda"}, {DayOfWeek.FRIDAY.name(), "bdac"}});

        System.out.println("---Family---");
        System.out.println(family);
        System.out.println();

        System.out.println("---After adding---");
        family.addChild(child[0]);
        family.addChild(child[1]);
        System.out.println(family);
        System.out.println();

        System.out.println("---After deleting---");
        family.deleteChild(1);
        family.deleteChild(child[0]);
        System.out.println(family);
        System.out.println();

        for (int i = 0; i < 100; i++) {
            new Pet();
            new Human();
            new Family();
            System.gc();
        }
    }
}