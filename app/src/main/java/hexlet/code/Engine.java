package hexlet.code;

import hexlet.code.games.GameData;
import hexlet.code.games.Game;

import java.util.Scanner;

public class Engine {

    private static final int ATTEMPTS_NUMBER = 3;

    public static void engine(Game game) {

        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(game.getQuestionText());
        for (var i = 1; i <= ATTEMPTS_NUMBER; i++) {
            GameData gameData = game.generate();
            System.out.println("Question: " + gameData.getQuestionContent());
            System.out.print("Your answer: ");
            var userAnswer = scanner.next();
            if (!userAnswer.equalsIgnoreCase(gameData.getCorrectAnswer())) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. "
                        + "Correct answer was '" + gameData.getCorrectAnswer() + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
