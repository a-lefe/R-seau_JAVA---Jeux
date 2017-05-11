package mvc.Modele;

import mvc.Controleur.OperationMatrice;

/**
 * Created by REZIGA on 11/05/2017.
 */
public class InfosPiecePlateau {
    private final int[][] brickData;
    private final int xPosition;
    private final int yPosition;
    private final int[][] nextBrickData;

    public InfosPiecePlateau(int[][] brickData, int xPosition, int yPosition, int[][] nextBrickData) {
        this.brickData = brickData;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.nextBrickData = nextBrickData;
    }

    public int[][] getPieceData() {
        return OperationMatrice.copy(brickData);
    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public int[][] getInfosPieceSuivante() {
        return OperationMatrice.copy(nextBrickData);
    }
}
