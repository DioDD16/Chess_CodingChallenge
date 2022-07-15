package pieces;

import board.Board;
import board.Spot;

public class Knight extends GenericPiece{

    public Knight(boolean isWhite, Spot spot) {
        this.setWhite(isWhite);
        this.setKilled(false);
        this.setSpot(spot);
        this.setPieceName(PieceName.KNIGHT);
    }

    @Override
    public boolean canMove(final Board board,
                           final Spot end) {
        Spot currentSpot = this.getSpot();
        //TODO: check whether move and new position is valid

        return false;
    }

}
