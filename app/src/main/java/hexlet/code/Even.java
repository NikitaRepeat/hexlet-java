package hexlet.code;
import java.util.Scanner;
public class Even {
    public static void evenGame() {
        int b = 100;
        int numberOfRightAnswer = 0;
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May i have your name?");
        Scanner scanner = new Scanner(System.in);
        String nameUser = scanner.nextLine();
        System.out.println("Hello, " + nameUser + "!");
        for (int i = 0; i < 3; i++) {
            int randomNumber = (int) (Math.random() * b);
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            System.out.println("Question:" + randomNumber);
            System.out.println("Your answer: ");
            Scanner sc = new Scanner(System.in);
            String choiceUser = sc.nextLine();
            String answerRight = "";
            if (randomNumber % 2 == 0) {
                answerRight = "yes";
            } else {
                answerRight = "no";
            }
            if (randomNumber % 2 == 0 & choiceUser.equals(answerRight)) {
                System.out.println("Correct!");
                numberOfRightAnswer += 1;
            } else if (randomNumber % 2 != 0 & choiceUser.equals((answerRight))) {
                System.out.println("Correct!");
                numberOfRightAnswer += 1;
            } else {
                System.out.println(choiceUser + " is wrong answer ;(. Correct answer was " + answerRight);
                System.out.println("Let's try again, " + nameUser);
            }
            if (numberOfRightAnswer == 3) {
                System.out.println("Congratulations, " + nameUser);
            }
        }
    }
}
