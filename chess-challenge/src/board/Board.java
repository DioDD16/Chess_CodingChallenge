package board;

public class Board {
    Spot[][] boxes;

    public Board()
    {
        this.resetInitialBoardPositions();
    }

    public Spot getBox(int x, int y) throws Exception {

        if (x < 0 || x > 7 || y < 0 || y > 7) {
            throw new Exception("Index out of bound");
        }

        return boxes[x][y];
    }

    public void resetInitialBoardPositions()
    {
        // initialize boxes without any piece
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                boxes[i][j] = new Spot(i, j, null);
            }
        }
        //TODO: initialize white pieces

        //TODO: initialize black pieces
    }
}