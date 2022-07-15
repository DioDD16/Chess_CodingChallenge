package board;

import pieces.GenericPiece;

public class Spot {

    private GenericPiece genericPiece;
    private int x;
    private int y;

    public Spot(int x,
                int y,
                GenericPiece genericPiece) {
        this.setPiece(genericPiece);
        this.setX(x);
        this.setY(y);
    }

    public GenericPiece getPiece() {
        return this.genericPiece;
    }

    public void setPiece(GenericPiece p) {
        this.genericPiece = p;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }
}