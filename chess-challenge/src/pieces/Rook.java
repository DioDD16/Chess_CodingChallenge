package pieces;

import board.Board;
import board.Spot;

public class Rook extends GenericPiece{

    public Rook(boolean isWhite, Spot spot) {
        this.setWhite(isWhite);
        this.setKilled(false);
        this.setSpot(spot);
        this.setPieceName(PieceName.ROOK);
    }

    @Override
    public boolean canMove(final Board board,
                           final Spot end) {
        Spot currentSpot = this.getSpot();
        //TODO: check whether new position is valid

        return false;
    }
}
