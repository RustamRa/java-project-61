package hexlet.code.games;

import hexlet.code.Util;

public class Gcd implements Game {

    private String questionText = "Find the greatest common divisor of given numbers.";

    public final GameData generate() {
        final int rangeNumberMax = 100;
        final int rangeNumberMin = 1;
        int numberOne = Util.getRandomNumberInRange(rangeNumberMax, rangeNumberMin);
        int numberTwo = Util.getRandomNumberInRange(rangeNumberMax, rangeNumberMin);
        int correctAnswerInt = calculateGCD(numberOne, numberTwo);

        String correctAnswer = Integer.toString(correctAnswerInt) .trim();
        String questionContent = (numberOne + " " + numberTwo) .trim();
        return new GameData(questionContent, correctAnswer);
    }

    public final String getQuestionText() {
        return this.questionText;
    }

    private int calculateGCD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
