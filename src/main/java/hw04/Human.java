package hw04;

public class Human {

    String name;
    String surname;
    int year;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    int[][] schedule;

    public Human(String name, String surname, int year){
        this.name=name;
        this.surname=surname;
        this.year=year;
    }

    public Human(String name, String surname, int year, int iq, Human mother, Human father){
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.iq=iq;
        this.mother=mother;
        this.father=father;
    }

    public Human(String name, String surname,int year,int iq, Pet pet,Human mother,Human father,int[][] schedule){
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.iq=iq;
        this.pet=pet;
        this.mother=mother;
        this.father=father;
        this.schedule=schedule;
    }

    public Human(){
    }

    void greetpet(){
        System.out.printf("Hello, %s!",pet.nickname);
    }

    void describePet(){
        System.out.printf("I have a %s, he is %d years old, he is %s",pet.species,pet.age,pet.tricklevel(pet.tricklevel));
    }

    @Override
    public String toString() {
        return String.format("Human{name=%s, surname=%s, year=%d, iq=%d, mother=%s %s,"+"father=%s %s,"+pet.toString() + "}}",name,surname,year,iq,mother.name,mother.surname,father.name,father.surname);
    }

}
