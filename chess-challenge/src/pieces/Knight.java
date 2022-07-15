package pieces;

import board.Board;
import board.Spot;

public class Knight extends GenericPiece{

    public Knight(boolean isWhite) {
        this.setWhite(isWhite);
        this.setKilled(false);
        this.setPieceName(PieceName.KNIGHT);
    }

    @Override
    public boolean canMove(final Board board,
                           final Spot start,
                           final Spot end) {

        //TODO: check whether move and new position is valid

        return false;
    }

}
