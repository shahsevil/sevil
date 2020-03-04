package hw07;

public class RoboCat extends Pet {

    public RoboCat(String nickname, int age, int trickLevel, String[] habits,Species species) {
        super(nickname, age, trickLevel, habits,species);
    }

    @Override
    void foul() {
        System.out.println("Foul method of robocat");
    }

    @Override
    void respond() {
        System.out.printf("Hello owner! I am %s. I miss you!",super.getNickname());
    }
}
