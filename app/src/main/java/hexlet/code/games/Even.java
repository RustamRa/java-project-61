package hexlet.code.games;

import hexlet.code.Util;

public class Even implements Game {

    private String questionText = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public final GameData generate() {
        final int rangeNumberMax = 100;
        final int rangeNumberMin = 1;
        int numberOne = Util.getRandomNumberInRange(rangeNumberMax, rangeNumberMin);

        String correctAnswer =  isEven(numberOne) ? "yes" : "no";
        String questionContent = Integer.toString(numberOne) .trim();
        return new GameData(questionContent, correctAnswer);
    }

    public final String getQuestionText() {
        return this.questionText;
    }

    private boolean isEven(int number) {
        return ((number / 2) * 2) == number;
    }
}
