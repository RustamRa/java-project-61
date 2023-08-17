package hexlet.code.games;

public final class GameData {
    private String questionContent;
    private String correctAnswer;

    public GameData(String questionContent, String correctAnswer) {
        //this.questionText = questionText;
        this.questionContent = questionContent;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionContent() {
        return this.questionContent;
    }

    public String getCorrectAnswer() {
        return this.correctAnswer;
    }

}
