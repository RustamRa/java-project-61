package hexlet.code;

import hexlet.code.games.GameData;
import hexlet.code.games.Game;

import java.util.Scanner;

public class Engine {
    public static void engine(Game question, String userName) {

//      Количество правильных ответов
        final int attemptsNumber = 3;

        Scanner scanner = new Scanner(System.in);

        // Переменные результата
        var userAnswer = "";
        var gameResult = "win";

        //Выводим общий текст вопроса игры
        System.out.println(question.getQuestionText());

        int questionNumber = 1; // Cчётчик выполненных итераций
        do {
            // Создаем объект игры и генерируем вопрос
            GameData game = question.generate();

            // Выводим вопрос и запрашиваем ответ
            System.out.println("Question: " + game.getQuestionContent());
            System.out.print("Your answer: ");

            userAnswer = scanner.next();

            // Обработка ответа пользователя
            if (userAnswer.equalsIgnoreCase(game.getCorrectAnswer())) {
                System.out.println("Correct!");
                questionNumber++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. "
                        + "Correct answer was '" + game.getCorrectAnswer() + "'.");
                gameResult = "lose";
            }

        } while (questionNumber <= attemptsNumber && gameResult.equals("win"));

        // Результат игры
        System.out.println((gameResult.equalsIgnoreCase("win")
                ? "Congratulations, "
                : "Let's try again, "
                ) + userName + "!");
    }
}
