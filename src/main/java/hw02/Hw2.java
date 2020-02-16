package hw02;

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        int rand1 = ((int) (Math.random() * 5 + 1));
        int rand2 = ((int) (Math.random() * 5 + 1));
        System.out.printf("For checking:rand1=%d, rand2=%d\n",rand1,rand2);
        System.out.print("All set. Get ready to rumble!");
        String[][] array1 = {
                {"'|0","|1","|2","|3","|4","|5|'"},
                {"'|1","|-","|-","|-","|-","|-|'"},
                {"'|2","|-","|-","|-","|-","|-|'"},
                {"'|3","|-","|-","|-","|-","|-|'"},
                {"'|4","|-","|-","|-","|-","|-|'"},
                {"'|5","|-","|-","|-","|-","|-|'"},};

        for (int i = 0; i < 6; i++) {
            System.out.println(" ");
            for (int j = 0; j < 6; j++) {
                System.out.print(array1[i][j]);
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter row and col:");
        int row = scanner.nextInt();
        int col= scanner.nextInt();

        while (row>5||row<1||col>5||col<1) {
            System.out.println("Enter again:");
            row=scanner.nextInt();
            col=scanner.nextInt();
        }

        while (row != rand1||col!= rand2) {
            array1[row][col]="|*";
            for (int i = 0; i <6; i++) {
                System.out.println("");
                for (int j = 0; j <6; j++) {
                    System.out.print(array1[i][j]);
                }
            }
            System.out.println("\nEnter again:");
            row = scanner.nextInt();
            col = scanner.nextInt();
            if (row>5||row<1||col>5||col<1){
                System.out.println("\nEnter again:");
                row = scanner.nextInt();
                col = scanner.nextInt();
            }
        }

        array1[row][col]="|x";

        for (int i = 0; i <6; i++) {
            System.out.println("");
            for (int j = 0; j <6; j++) {
                System.out.print(array1[i][j]);
            }
        }
        System.out.print("\nYou have won!");
    }
}
