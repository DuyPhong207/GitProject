public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score;
        int tempScore = 0;
        boolean isDisplay = player1Score == player2Score;
        boolean isEndGame = player1Score >= 4 || player2Score >= 4;
        if (isDisplay) return getGameDisplayScore(player1Score);
        if (isEndGame) return getGameDisplayWinner(player1Score, player2Score);
        String display = getPlayerDisplayScore(player1Score)
                + "-" + getPlayerDisplayScore(player2Score);
        return display;
    }

    public static String getPlayerDisplayScore(int playerScore) {
        switch (playerScore) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            default:
                return "Forty";
        }

    }

    public static String getGameDisplayScore(int displayScore) {
        switch (displayScore) {
            case 0:
                return "Love-All";
            case 1:
                return "Fifteen-All";
            case 2:
                return "Thirty-All";
            case 3:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    public static String getGameDisplayWinner (int player1Score, int player2Score) {
        int finalScore = player1Score - player2Score;
        int minusResult = player1Score - player2Score;
        if (minusResult == 1) return "Advantage player1";
        if (minusResult == -1) return "Advantage player2";
        if (finalScore >= 2) return "Win for player1";
        return "Win for player2";
    }
}
