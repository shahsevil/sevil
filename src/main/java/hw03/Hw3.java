package hw03;

import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {

        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "sleep";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "go to park";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "Listen to the music";
        schedule[5][0] = "Friday";
        schedule[5][1] = "have a rest";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "prepare your lessons";

        String i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input the day of the week: ");

        while (true) {
            i = scanner.next();
            String value = String.valueOf(i).toUpperCase();
            switch (value.trim()) {
                case "SUNDAY":
                    System.out.println("Your tasks for " + schedule[0][0] + ": " + schedule[0][1]);
                    break;
                case "MONDAY":
                    System.out.println("Your tasks for " + schedule[1][0] + ": " + schedule[1][1]);
                    break;
                case "TUESDAY":
                    System.out.println("Your tasks for " + schedule[2][0] + ": " + schedule[2][1]);
                    break;
                case "WEDNESDAY":
                    System.out.println("Your tasks for " + schedule[3][0] + ": " + schedule[3][1]);
                    break;
                case "THURSDAY":
                    System.out.println("Your tasks for " + schedule[4][0] + ": " + schedule[4][1]);
                    break;
                case "FRIDAY":
                    System.out.println("Your tasks for " + schedule[5][0] + ": " + schedule[5][1]);
                    break;
                case "SATURDAY":
                    System.out.println("Your tasks for " + schedule[6][0] + ": " + schedule[6][1]);
                    break;
                case "EXIT":
                    return;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
                    break;
            }
        }
    }
}
