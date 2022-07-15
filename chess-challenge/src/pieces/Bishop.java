package pieces;

import board.Board;
import board.Spot;

public class Bishop extends GenericPiece {

    public Bishop(boolean isWhite, Spot spot) {
        this.setWhite(isWhite);
        this.setSpot(spot);
        this.setKilled(false);
        this.setPieceName(PieceName.BISHOP);
    }

    @Override
    public boolean canMove(final Board board,
                           final Spot end) {
        Spot currentSpot = this.getSpot();

        //TODO: check whether new position is valid

        return false;
    }
}
