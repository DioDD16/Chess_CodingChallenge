package pieces;

import board.Board;
import board.Spot;

public class Queen extends GenericPiece {

    public Queen(boolean isWhite) {
        this.setWhite(isWhite);
        this.setKilled(false);
        this.setPieceName(PieceName.QUEEN);
    }

    @Override
    public boolean canMove(final Board board,
                           final Spot start,
                           final Spot end) {

        //TODO: check whether new position is valid

        return false;
    }
}
