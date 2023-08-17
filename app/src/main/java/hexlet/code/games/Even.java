package hexlet.code.games;

//import hexlet.code.MathR;

import hexlet.code.Util;

public class Even implements Game {

    public Even() {

    }

    public GameData generate() {

        String correctAnswer;
        String questionContent;

        int rangeNumberMax = 100;
        int rangeNumberMin = 1;

        int numberOne = Util.randomNumberInRange(rangeNumberMax, rangeNumberMin);

        correctAnswer =  isEven(numberOne) ? "yes" : "no";
        questionContent = Integer.toString(numberOne) .trim();

        return new GameData(questionContent, correctAnswer);
    }

    public String getQuestionText() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    private boolean isEven(int number) {
        //boolean result = ((number / 2) * 2) == number ? true : false;
        return ((number / 2) * 2) == number;
    }
}
