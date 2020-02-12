package hw01;

import java.util.Arrays;
import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {

        System.out.println("Let the game begin!");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name:");
        String str1=scanner.nextLine();
        System.out.println("Enter a number:");

        int num=scanner.nextInt();
        int[] arr = new int[30];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }

        for (int el: arr) {
            if(el>num) {
                System.out.println("Your number is too small. Please, try again.");
            }
            else if (el<num){
                System.out.println("Your number is too big. Please, try again.");
            }
            else {
                String e=String.format("Congratulations, %s!\n", str1);
                System.out.println(e);
            }
        }

        String str = Arrays.toString(arr);
        System.out.println(str);
    }
}
