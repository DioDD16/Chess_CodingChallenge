package pieces;

import board.Board;
import board.Spot;

public abstract class GenericPiece {

    private boolean isKilled;
    private boolean isWhite;
    private PieceName pieceName;

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

    public abstract boolean canMove(Board board,
                                    Spot start, Spot end);
}
