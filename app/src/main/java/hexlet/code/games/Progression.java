package hexlet.code.games;

//import hexlet.code.MathR;
import hexlet.code.Util;

//import java.util.Arrays;

public class Progression implements Game {

    public String questionText = "What number is missing in the progression?";

    public final GameData generate() {

        String correctAnswer;
        String questionContent;

        final int rangeNumberMax = 20;
        final int rangeNumberMin = 1;
        final int rangeStepMax = 7;
        final int rangeStepMin = 2;
        final int rangeArrayMax = 6;
        final int rangeArrayMin = 5;
        int numberOne = Util.randomNumberInRange(rangeNumberMax, rangeNumberMin);
        int arrayStep = Util.randomNumberInRange(rangeStepMax, rangeStepMin);
        int arraySize = Util.randomNumberInRange(rangeArrayMax, rangeArrayMin);
        final int rangePositionMin = 0;
        int positionHide = Util.randomNumberInRange(arraySize, rangePositionMin);

        String[] numbers = arithmeticProgressionString(numberOne, arrayStep, arraySize);
        correctAnswer = numbers[positionHide];
        numbers[positionHide] = "..";
        questionContent = String.join(" ", numbers);

        return new GameData(questionContent, correctAnswer);
    }

    public final String getQuestionText() {
        return this.questionText;
    }

    private String[] arithmeticProgressionString(int numberOne, int arrayStep, int arraySize) {
        // Создаем пустой массив с необходимым размером
        String[] values = new String[arraySize];
        for (var i = 0; i < values.length; i++) {
            values[i] = Integer.toString(numberOne + arrayStep * i);
        }
        return values;
    }
}
