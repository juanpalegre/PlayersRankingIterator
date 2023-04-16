

public class Player implements Comparable<Player> {

    private String playerName;
    private int score;

    public Player(){

    }

    public Player(String playerName, int score) {
        this.playerName = playerName;
        this.score = score;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Player other) {
        return Integer.compare(other.score, this.score);
    }
}
