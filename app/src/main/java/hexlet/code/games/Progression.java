package hexlet.code.games;

//import hexlet.code.MathR;
import hexlet.code.Util;

import java.util.Arrays;

public class Progression implements Game {

    public Progression() {

    }

    public final GameData generate() {

        String correctAnswer;
        String questionContent;

        final int rangeNumberMax = 20;
        final int rangeNumberMin = 1;
        final int rangeStepMax = 7;
        final int rangeStepMin = 2;
        final int rangeArrayMax = 6;
        final int rangeArrayMin = 5;

        // Определяем параметры Прогрессии и массива
        int numberOne = Util.randomNumberInRange(rangeNumberMax, rangeNumberMin);
        int arrayStep = Util.randomNumberInRange(rangeStepMax, rangeStepMin);
        int arraySize = Util.randomNumberInRange(rangeArrayMax, rangeArrayMin);

        // Определяем позицию спрятанного элемента
        final int rangePositionMin = 0;

        int positionHide = Util.randomNumberInRange(arraySize, rangePositionMin);

        // Запрашиваем массив с элементами арифметической прогрессии
        String[] numbers = arithmeticProgressionString(numberOne, arrayStep, arraySize);

        // Сохраняем спрятанный элемент и скрываем его
        correctAnswer = numbers[positionHide];
        numbers[positionHide] = "..";

        // Преобразуем массив в одну строку
        questionContent = Arrays.toString(numbers);

        // Удаляем запятые из полученной строки
        questionContent = questionContent.replaceAll(",", "");

        // Удаляем первую и последнюю скобку от преобразования массива в число
        final int firstPosition = 1;
        int lastPosition = questionContent.length() - 1;
        questionContent = questionContent.substring(firstPosition, lastPosition);

        return new GameData(questionContent, correctAnswer);
    }

    public final String getQuestionText() {
        return "What number is missing in the progression?";
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
