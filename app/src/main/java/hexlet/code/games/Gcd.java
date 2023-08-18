package hexlet.code.games;

//import hexlet.code.MathR;

import hexlet.code.Util;

public class Gcd implements Game {

    public Gcd() {

    }

    public final GameData generate() {

        final int rangeNumberMax = 100;
        final int rangeNumberMin = 1;

        int numberOne = Util.randomNumberInRange(rangeNumberMax, rangeNumberMin);
        int numberTwo = Util.randomNumberInRange(rangeNumberMax, rangeNumberMin);

        int correctAnswerInt = gsd(numberOne, numberTwo);

        String correctAnswer = Integer.toString(correctAnswerInt) .trim();
        String questionContent = (numberOne + " " + numberTwo) .trim();

        return new GameData(questionContent, correctAnswer);
    }

    public final String getQuestionText() {
        return "Find the greatest common divisor of given numbers.";
    }

    private int gsd(int a, int b) {
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
