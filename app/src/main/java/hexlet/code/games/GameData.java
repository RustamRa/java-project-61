package hexlet.code.games;

public final class GameData {
    private final String questionContent;
    private final String correctAnswer;

    public GameData(String param1, String param2) {
        //this.questionText = questionText;
        this.questionContent = param1;
        this.correctAnswer = param2;
    }

    public String getQuestionContent() {
        return this.questionContent;
    }

    public String getCorrectAnswer() {
        return this.correctAnswer;
    }

}
