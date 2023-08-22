package hexlet.code.games;

import hexlet.code.Util;

public class Calc implements Game {

    private final String questionText = "What is the result of the expression?";
    private final int rangeNumberMax = 10;
    private final int rangeNumberMin = 1;
    private final int rangeActionMax = 3;
    private final int rangeActionMin = 1;

    public final GameData generateGameData() {
        int numberOne = Util.getRandomNumberInRange(rangeNumberMax, rangeNumberMin);
        int numberTwo = Util.getRandomNumberInRange(rangeNumberMax, rangeNumberMin);
        int actionExpression = Util.getRandomNumberInRange(rangeActionMax, rangeActionMin);

        String[] calculation = executeAction(actionExpression, numberOne, numberTwo);
        String questionContent = (numberOne + calculation[0] + numberTwo) .trim();
        String correctAnswer = calculation[1];
        return new GameData(questionContent, correctAnswer);
    }

    public final String getRules() {
        return this.questionText;
    }

    private String[] executeAction(int actionExpression, int numberOne, int numberTwo) {
        String[] result = new String[2];
        final int actionSubtraction = 2;
        final int actionMultiplication = 3;
        switch (actionExpression) {
            // Вычитание
            case actionSubtraction -> {
                result[0] = " - ";
                result[1] = Integer.toString(numberOne - numberTwo);
            }
            // Умножение
            case actionMultiplication -> {
                result[0] = " * ";
                result[1] = Integer.toString(numberOne * numberTwo);
            }
            // по Умолчанию "+"
            default -> {
                result[0] = " + ";
                result[1] = Integer.toString(numberOne + numberTwo);
            }
        }
        return result;
    }
}
