package hexlet.code.games;

public final class GameData {
    private final String question;
    private final String answer;

    public GameData(String param1, String param2) {
        //this.questionText = questionText;
        question = param1;
        answer = param2;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
