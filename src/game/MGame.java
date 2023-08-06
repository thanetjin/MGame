package game;
import java.util.ArrayList;
import java.util.List;

public class MGame {
    private Board board;
    private List<Player> players;
    private int x;
    private int roundCount;

    public MGame(Board board, List<Player> players, int x, int roundCount) {
        this.board = board;
        this.players = players;
        this.x = x;
        roundCount = 0;

    }

    public void playGame() {
        while (roundCount < x) {
            playRound();
            roundCount++;
        }
    }
    private void playRound() {
        for(Player player : players) {
            player.takeTurn();
        }
        }
}
