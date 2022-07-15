package pieces;

import board.Board;
import board.Spot;

public class King extends GenericPiece{

    public King(boolean isWhite) {
        this.setWhite(isWhite);
        this.setKilled(false);
        this.setPieceName(PieceName.KING);
    }

    @Override
    public boolean canMove(final Board board,
                           final Spot start,
                           final Spot end) {

        //TODO: check whether new position is valid

        return false;
    }

    public boolean isChecked(Board board) {

        //TODO: check whether the king is in check position

        return false;
    }
}
