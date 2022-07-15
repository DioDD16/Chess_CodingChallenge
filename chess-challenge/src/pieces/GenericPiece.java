package pieces;

import board.Board;
import board.Spot;

public abstract class GenericPiece {

    private boolean isKilled;
    private boolean isWhite;
    private PieceName pieceName;
    private Spot spot;

    public GenericPiece() {
    }

    public boolean isWhite()
    {
        return this.isWhite;
    }

    public void setWhite(boolean isWhite)
    {
        this.isWhite = isWhite;
    }

    public boolean isKilled()
    {
        return this.isKilled;
    }

    public void setKilled(boolean isKilled)
    {
        this.isKilled = isKilled;
    }

    public PieceName getPieceName() { return this.pieceName; }

    public void setPieceName(PieceName pieceName) { this.pieceName = pieceName; }

    public Spot getSpot() { return this.spot; }

    public void setSpot(Spot spot) { this.spot = spot; }

    public abstract boolean canMove(Board board, Spot end);
}
