package hw05;

public class Main {
    public static void main(String[] args) {
        Human childArr[]=new Human[2];
        Pet pet = new Pet("Dog", "Rock", 5, 75, new String[]{"eat,", "drink,", "sleep"});
        Human father= new Human("Jane","Karleone",1992,1,new String[][]{{"Sunday","dcab"},{"Monday","bcda"}});
        Human mother= new Human("Vito","Karleone",1990, 1,new String[][]{{"Tuesday","abcd"},{"Wednesday","bcda"}});
        Family family = new Family(father, mother,pet);
        childArr[0]=new Human("Michael","Karleone",2000,20,new String[][]{{"Tuesday","abcd"},{"Wednesday","bcda"}});
        childArr[1]=new Human("Kate","Karleone",2005,30,new String[][]{{"Thursday","cbda"},{"Friday","bdac"}});


        //family without children
        System.out.println("Family:");
        System.out.println(family);


        //after adding
        for (Human el : childArr) {
                family.addChild(el);
        }
        System.out.println("");
        System.out.println("After adding:\n"+family);

        //after deleting
        family.deleteChild(0);
        System.out.println("");
        System.out.println("After deleting:\n"+family);
    }
}
