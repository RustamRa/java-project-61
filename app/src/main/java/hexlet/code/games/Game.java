package hexlet.code.games;

public interface Game {
    default GameData generate() {
        return null;
    }

    String getQuestionText();
}
