package hexlet.code.games;

//import hexlet.code.MathR;

import hexlet.code.Util;

public class Even implements Game {

    private String questionText = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public final GameData generate() {

        String correctAnswer;
        String questionContent;

        final int rangeNumberMax = 100;
        final int rangeNumberMin = 1;

        int numberOne = Util.randomNumberInRange(rangeNumberMax, rangeNumberMin);

        correctAnswer =  isEven(numberOne) ? "yes" : "no";
        questionContent = Integer.toString(numberOne) .trim();

        return new GameData(questionContent, correctAnswer);
    }

    public final String getQuestionText() {
        return this.questionText;
    }

    private boolean isEven(int number) {
        //boolean result = ((number / 2) * 2) == number ? true : false;
        return ((number / 2) * 2) == number;
    }
}
