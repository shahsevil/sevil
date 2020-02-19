package hw04;

public class Pet {

    String species, nickname;
    int age, tricklevel;
    String[] habits;

    public Pet(String species, String nickname){
        this.species=species;
        this.nickname=nickname;
    }

    public Pet(String species, String nickname, int age, int tricklevel, String[] habits){
        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.tricklevel=tricklevel;
        this.habits=habits;
    }

    public Pet(){
    }

    String tricklevel(int tricklevel){
        String sly="";
        if (tricklevel>50 && tricklevel<=100) sly="very sly";
        else if (tricklevel>0 && tricklevel<=50) sly="is not very sly";
        return sly;
    }

    String habits(String[] habits){
        String string="";
        for (String el:habits) string+=el;
        return string;
    }

    void eat(){
        System.out.print("I am eating.");
    }

    void respond(){
        System.out.printf("Hello, owner. I am - %s. I miss you!", nickname);
    }

    void foul(){
        System.out.println("I need to cover it up\n");
    }

    public String toString(){
        return String.format("%s{nickname='%s',age=%d,trick level=%d,habits=["+habits(habits)+"]}}",species,nickname,age,tricklevel);
    }

}
