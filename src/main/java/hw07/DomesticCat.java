package hw07;

public class DomesticCat extends Pet{

    public DomesticCat(String nickname, int age, int trickLevel, String[] habits,Species species) {
        super(nickname, age, trickLevel, habits,species);
    }

    @Override
    void foul() {
        System.out.println("Foul method of domesticcat");
    }

    @Override
    void respond() {
        System.out.printf("Hello owner! I am %s. I miss you!",super.getNickname());
    }
}
