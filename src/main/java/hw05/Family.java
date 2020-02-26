package hw05;

import java.util.ArrayList;

public class Family {
    private int countFamily=2;
   private Human mother;
   private Human father;
   private Pet pet;
   private ArrayList<Human> children = new ArrayList<>();

    static
    {
        System.out.println("a new class is being loaded");
    }

    {
        System.out.println("a new object is created");
    }

    public Family(Human mother, Human father, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void   addChild(Human child){
            children.add(child);
            countFamily++;
     //   System.out.println("====== add child");
    }

    public boolean deleteChild(int listIndex) {
        if(children.size()==0) return false;
        else {
            children.remove(listIndex);
            countFamily--;
            return true;
        }
    }

    public int familyNum() {
        return countFamily;
    }

//    void greetpet(){
//        System.out.printf("Hello, %s!", pet.getNickname());
//    }
//
//    void describePet(){
//        System.out.printf("I have a %s, he is %d years old", pet.getSpecies(), pet.getAge());
//    }

    @Override
    public String toString() {
        return String.format("Family{mother=%s,\n father=%s,\n pet=%s,\n countFamily=%d,\n children=%s}",
                                    mother, father, pet, countFamily,  children);
    }
}
