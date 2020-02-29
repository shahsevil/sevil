package hw05;

public class Main {
    public static void main(String[] args) {

        Pet pet = new Pet("Dog", "Rock", 5, 75, new String[]{"eat", "drink", "sleep"});
        Human father= new Human("Vito","Karleone",1991,1,new String[][]{{"Sunday","dcab"},{"Monday","bcda"}});
        Human mother= new Human("Jane","Karleone",1992, 1,new String[][]{{"Tuesday","abcd"},{"Wednesday","bcda"}});
        Family family=new Family(mother,father,pet);

        Human child1=new Human("Michael","Karleone",2000,20,new String[][]{{"Tuesday","abcd"},{"Wednesday","bcda"}});
        Human child2=new Human("Kate","Karleone",2005,30,new String[][]{{"Thursday","cbda"},{"Friday","bdac"}});

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
    }
}
