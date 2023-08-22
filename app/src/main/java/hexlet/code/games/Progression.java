package hexlet.code.games;

import hexlet.code.Util;

public class Progression implements Game {

    private final String questionText = "What number is missing in the progression?";
    private final int rangeNumberMax = 20;
    private final int rangeNumberMin = 1;
    private final int rangeStepMax = 7;
    private final int rangeStepMin = 2;
    private final int rangeArrayMax = 6;
    private final int rangeArrayMin = 5;

    public final GameData generateGameData() {
        int numberOne = Util.getRandomNumberInRange(rangeNumberMax, rangeNumberMin);
        int arrayStep = Util.getRandomNumberInRange(rangeStepMax, rangeStepMin);
        int arraySize = Util.getRandomNumberInRange(rangeArrayMax, rangeArrayMin);
        final int rangePositionMin = 0;
        int positionHide = Util.getRandomNumberInRange(arraySize, rangePositionMin);

        String[] numbers = calculateArithmeticProgression(numberOne, arrayStep, arraySize);
        String answer = numbers[positionHide];
        numbers[positionHide] = "..";
        String question = String.join(" ", numbers);
        return new GameData(question, answer);
    }

    public final String getRules() {
        return this.questionText;
    }

    private String[] calculateArithmeticProgression(int numberOne, int arrayStep, int arraySize) {
        String[] values = new String[arraySize];
        for (var i = 0; i < values.length; i++) {
            values[i] = Integer.toString(numberOne + arrayStep * i);
        }
        return values;
    }
}
