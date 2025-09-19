package refactoring;

public class TennisGame {

    private int player1Score;
    private int player2Score;
    private final String player1Name;
    private final String player2Name;

    private static final int WINNING_SCORE = 4;
    private static final int MIN_LEAD_TO_WIN = 2;

    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        this.player1Score = 0;
        this.player2Score = 0;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1Name)) {
            player1Score++;
        } else if (playerName.equals(player2Name)) {
            player2Score++;
        } else {
            throw new IllegalArgumentException("Unknown player: " + playerName);
        }
    }

    public String getScore() {
        if (isTie()) return getScoreWhenTied();
        if (isAdvantage()) return getScoreWhenAdvantage();
        if (isWin()) return getWinnerName() + " wins";
        return getNormalScore();
    }

    // ---- Helper methods ----
    private boolean isTie() {
        return player1Score == player2Score;
    }

    private boolean isAdvantage() {
        return player1Score >= WINNING_SCORE && player2Score >= WINNING_SCORE
                && Math.abs(player1Score - player2Score) == 1;
    }

    private boolean isWin() {
        return (player1Score >= WINNING_SCORE || player2Score >= WINNING_SCORE)
                && Math.abs(player1Score - player2Score) >= MIN_LEAD_TO_WIN;
    }

    private String getWinnerName() {
        return player1Score > player2Score ? player1Name : player2Name;
    }

    private String getScoreWhenTied() {
        switch (player1Score) {
            case 0: return "Love-All";
            case 1: return "Fifteen-All";
            case 2: return "Thirty-All";
            case 3: return "Forty-All"; // match test case
            default: return "Deuce";
        }
    }

    private String getScoreWhenAdvantage() {
        return player1Score > player2Score ? "Advantage " + player1Name : "Advantage " + player2Name;
    }

    private String getNormalScore() {
        return scoreToString(player1Score) + "-" + scoreToString(player2Score);
    }

    private String scoreToString(int score) {
        switch (score) {
            case 0: return "Love";
            case 1: return "Fifteen";
            case 2: return "Thirty";
            case 3: return "Forty";
            default: return "Unknown";
        }
    }
}
