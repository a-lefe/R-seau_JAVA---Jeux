package mvc.Modele;

/**
 * Created by REZIGA on 10/04/2017.
 */
public class Grille {
    private Case[][] tabCase;

    public Grille(Case[][] tabCase) {
        this.tabCase = tabCase;
    }

    public Case[][] getTabCase() {
        return tabCase;
    }

    public void setTabCase(Case[][] tabCase) {
        this.tabCase = tabCase;
    }
}
