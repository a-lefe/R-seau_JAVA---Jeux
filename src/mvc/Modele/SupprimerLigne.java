package mvc.Modele;

import mvc.Controleur.OperationMatrice;

/**
 * Created by REZIGA on 11/05/2017.
 */
public class SupprimerLigne {
    private final int linesRemoved;
    private final int[][] newMatrix;
    private final int scoreBonus;

    public SupprimerLigne(int linesRemoved, int[][] newMatrix, int scoreBonus) {
        this.linesRemoved = linesRemoved;
        this.newMatrix = newMatrix;
        this.scoreBonus = scoreBonus;
    }

    public int getLinesRemoved() {
        return linesRemoved;
    }

    public int[][] getNewMatrix() {
        return OperationMatrice.copy(newMatrix);
    }

    public int getScoreBonus() {
        return scoreBonus;
    }
}
