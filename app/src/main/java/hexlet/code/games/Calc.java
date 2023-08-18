package hexlet.code.games;

import hexlet.code.Util;

public class Calc implements Game {

    public Calc() {

    }

    public final GameData generate() {

        String correctAnswer;
        String questionContent;

        int correctAnswerInt;
        String actionExpressionStr;

        final int rangeNumberMax = 10;
        final int rangeNumberMin = 1;
        final int rangeActionMax = 3;
        final int rangeActionMin = 1;

        int numberOne = Util.randomNumberInRange(rangeNumberMax, rangeNumberMin);
        int numberTwo = Util.randomNumberInRange(rangeNumberMax, rangeNumberMin);
        int actionExpression = Util.randomNumberInRange(rangeActionMax, rangeActionMin);

        switch (actionExpression) {
            // Вычитание
            case 2 -> {
                actionExpressionStr = " - ";
                correctAnswerInt = numberOne - numberTwo;
            }
            // Умножение
            case 3 -> {
                actionExpressionStr = " * ";
                correctAnswerInt = numberOne * numberTwo;
            }
            // по Умолчанию "+"
            default -> {
                actionExpressionStr = " + ";
                correctAnswerInt = numberOne + numberTwo;
            }
        }
        correctAnswer = Integer.toString(correctAnswerInt) .trim();

        questionContent = (numberOne + actionExpressionStr + numberTwo) .trim();

        return new GameData(questionContent, correctAnswer);
    }

    public final String getQuestionText() {
        return "What is the result of the expression?";
    }

}
