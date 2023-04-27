package hexlet.code;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter. ");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.println("Your choice: ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        if (choice.equals("1")) {
            Cli.welcomeUser();
        } else if (choice.equals("2")) {
            Even.evenGame();
        } else {
            System.out.println("Goodbye!");
        }
    }
}
