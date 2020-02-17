package hw01;
import java.util.Scanner;

public class Hw1 {
  public static void main(String[] args) {

      System.out.println("Let the game begin!");
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter your name:");
      String str1=scanner.nextLine();
      System.out.println("Enter a number:");

      int num=scanner.nextInt();
      int rand = (int) (Math.random() * 100 + 1);

      while (true) {
          if(rand>num) {
              System.out.println("Your number is too small. Please, try again.");
              num=scanner.nextInt();
          }
          else if (rand<num){
              System.out.println("Your number is too big. Please, try again.");
              num=scanner.nextInt();
          }
          else {
              String e=String.format("Congratulations, %s!\n", str1);
              System.out.println(e);
              break;
          }
      }
    }
}


