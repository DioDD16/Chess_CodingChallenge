package pieces;

import board.Board;
import board.Spot;

public class Rook extends GenericPiece{

    public Rook(boolean isWhite) {
        this.setWhite(isWhite);
        this.setPieceName(PieceName.ROOK);
    }

    @Override
    public boolean canMove(final Board board,
                           final Spot start,
                           final Spot end) {

        //TODO: check whether new position is valid

        return false;
    }
}
