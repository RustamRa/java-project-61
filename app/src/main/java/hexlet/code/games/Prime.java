package hexlet.code.games;

import hexlet.code.Util;

public class Prime implements Game {

    private final String questionText = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private final int rangeNumberMax = 100;
    private final int rangeNumberMin = 1;

    public final GameData generateGameData() {
        int numberOne = Util.getRandomNumberInRange(rangeNumberMax, rangeNumberMin);

        String correctAnswer = isPrime(numberOne) ? "yes" : "no";
        String questionContent = Integer.toString(numberOne) .trim();
        return new GameData(questionContent, correctAnswer);
    }

    public final String getRules() {
        return this.questionText;
    }

    private boolean isPrime(Integer number) {
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

