package game;

import board.Spot;
import pieces.GenericPiece;

public class Move {
    private Player player;
    private Spot start;
    private Spot end;
    private GenericPiece pieceMoved;
    private GenericPiece pieceKilled;
    private boolean castlingMove = false;

    public Move(Player player, Spot start, Spot end)
    {
        this.player = player;
        this.start = start;
        this.end = end;
        this.pieceMoved = start.getPiece();
    }

}
