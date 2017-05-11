package mvc.Modele;

import mvc.Controleur.OperationMatrice;

/**
 * Created by REZIGA on 11/05/2017.
 */
public class InfoFormeSuivante {
    private final int[][] forme;
    private final int position;

    public InfoFormeSuivante(final int[][] shape, final int position) {
        this.forme = shape;
        this.position = position;
    }

    public int[][] getForme() {
        return OperationMatrice.copy(forme);
    }

    public int getPosition() {
        return position;
    }
}
