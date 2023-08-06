package game;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private Piece piece;
    private List<Die> die;
    private Board board;
    private String name;

    public Player(Piece piece, List<Die> die, Board board, String name) {
        this.piece = piece;
        this.die = die;
        this.board = board;
        this.name = name;
    }

    public void takeTurn() {
        int fv = 0;
        for (Die die : die) {
            die.roll();
            fv += die.getFaceValue();
        }
        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fv);
        piece.setLocation(newLoc);
    }
}
