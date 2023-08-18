package hexlet.code.games;

import hexlet.code.Util;

public class Prime implements Game {

    private String questionText = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public final GameData generate() {

        final int rangeNumberMax = 100;
        final int rangeNumberMin = 1;

        int numberOne = Util.randomNumberInRange(rangeNumberMax, rangeNumberMin);

        String correctAnswer = isSimple(numberOne) ? "yes" : "no";
        String questionContent = Integer.toString(numberOne) .trim();

        return new GameData(questionContent, correctAnswer);
    }

    public final String getQuestionText() {
        return this.questionText;
    }

    private boolean isSimple(Integer number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

