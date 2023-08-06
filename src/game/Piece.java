package game;

import java.util.ArrayList;
import java.util.List;


public class Piece {
    private static final List<Piece> pieces = new ArrayList<>();

    private Square location;

    public Piece(List<Piece> pieces) {
        pieces.add(this);
    }

    public Square getLocation() {
        return location;
    }

    public void setLocation(Square location) {
        this.location = location;
    }
    public static List<Piece> getPieceBySquare(Square square) {
        List<Piece> out = new ArrayList<>();
        for(Piece piece : pieces) {
            if(piece.location == square) {
                out.add(piece);
            }
        }
        return out;
    }
}
