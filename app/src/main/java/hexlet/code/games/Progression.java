package hexlet.code.games;

import hexlet.code.Util;

public class Progression implements Game {

    private String questionText = "What number is missing in the progression?";

    public final GameData generate() {
        final int rangeNumberMax = 20;
        final int rangeNumberMin = 1;
        final int rangeStepMax = 7;
        final int rangeStepMin = 2;
        final int rangeArrayMax = 6;
        final int rangeArrayMin = 5;
        int numberOne = Util.getRandomNumberInRange(rangeNumberMax, rangeNumberMin);
        int arrayStep = Util.getRandomNumberInRange(rangeStepMax, rangeStepMin);
        int arraySize = Util.getRandomNumberInRange(rangeArrayMax, rangeArrayMin);
        final int rangePositionMin = 0;
        int positionHide = Util.getRandomNumberInRange(arraySize, rangePositionMin);

        String[] numbers = calculateArithmeticProgressionString(numberOne, arrayStep, arraySize);
        String correctAnswer = numbers[positionHide];
        numbers[positionHide] = "..";
        String questionContent = String.join(" ", numbers);
        return new GameData(questionContent, correctAnswer);
    }

    public final String getQuestionText() {
        return this.questionText;
    }

    private String[] calculateArithmeticProgressionString(int numberOne, int arrayStep, int arraySize) {
        String[] values = new String[arraySize];
        for (var i = 0; i < values.length; i++) {
            values[i] = Integer.toString(numberOne + arrayStep * i);
        }
        return values;
    }
}
