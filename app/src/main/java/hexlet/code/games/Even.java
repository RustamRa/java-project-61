package hexlet.code.games;

import hexlet.code.Util;

public class Even implements Game {

    private final String questionText = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private final int rangeNumberMax = 100;
    private final int rangeNumberMin = 1;

    public final GameData generateGameData() {

        int numberOne = Util.getRandomNumberInRange(rangeNumberMax, rangeNumberMin);

        String answer =  isEven(numberOne) ? "yes" : "no";
        String question = Integer.toString(numberOne) .trim();
        return new GameData(question, answer);
    }

    public final String getRules() {
        return this.questionText;
    }

    private boolean isEven(int number) {
        return (number % 2) == 0;
    }
}
