package mvc.Modele;

/**
 * Created by REZIGA on 10/04/2017.
 */
public class Piece2 {
    private Case[][] tabCase;

    public Piece2(Case[][] tabCase) {
        this.tabCase = tabCase;
    }

    public Case[][] getTabCase() {
        return tabCase;
    }

    public void setTabCase(Case[][] tabCase) {
        this.tabCase = tabCase;
    }

    public boolean rotation(Rotation rotation) {
        boolean OK = false;
        switch (rotation) {
            case DROITE:

            case GAUCHE:

        }
        return OK;
    }

    public boolean translation(Translation translation) {
        boolean OK = false;
        switch (translation) {
            case DROITE:

            case GAUCHE:

            case BAS:

            case HAUT:

        }
        return OK;
    }
}
