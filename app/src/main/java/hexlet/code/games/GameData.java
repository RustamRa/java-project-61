package hexlet.code.games;

public final class GameData {
    private final String question;
    private final String correctAnswer;

    public GameData(String param1, String param2) {
        //this.questionText = questionText;
        this.question = param1;
        this.correctAnswer = param2;
    }

    public String getQuestionContent() {
        return this.question;
    }

    public String getCorrectAnswer() {
        return this.correctAnswer;
    }
}
