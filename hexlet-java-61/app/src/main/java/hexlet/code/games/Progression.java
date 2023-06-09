package hexlet.code.games;

import java.util.Arrays;

public class Progression {
    public static String proGame() {
        int firstNumber = (int) (Math.random() * 11);
        int difference = (int) (1 + Math.random() * 9);
        int[] progression = new int[5 + (int) (Math.random() * 6)];
        String[] progressionString = new String[progression.length];
        progression[0] = firstNumber;
        progressionString[0] = Integer.toString(firstNumber);
        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + difference;
            progressionString[i] = Integer.toString(progression[i]);
        }
        int memberProgression = (int) (Math.random() * progression.length);
        String replaceMemberValue = progressionString[memberProgression];
        progressionString[memberProgression] = ".. ";
        System.out.println("Question :" + Arrays.toString(progressionString).replace("[", "").replace("]", ""));
        System.out.println("Your answer: ");
        return replaceMemberValue;
    }
}
