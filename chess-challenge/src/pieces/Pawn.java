package pieces;

import board.Board;
import board.Spot;

public class Pawn extends GenericPiece {

    public Pawn(boolean isWhite, Spot spot) {
        this.setWhite(isWhite);
        this.setKilled(false);
        this.setSpot(spot);
        this.setPieceName(PieceName.PAWN);
    }

    @Override
    public boolean canMove(final Board board,
                           final Spot end) {
        Spot currentSpot = this.getSpot();
        //TODO: check whether new position is valid

        return false;
    }
}
