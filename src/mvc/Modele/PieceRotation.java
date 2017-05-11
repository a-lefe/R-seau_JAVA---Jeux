package mvc.Modele;

/**
 * Created by REZIGA on 11/05/2017.
 */
public class PieceRotation {
    private Piece piece;
    private int formeCourrante = 0;

    public InfoFormeSuivante getFormeSuivante() {
        int formeSuivante = formeCourrante;
        formeSuivante = (++formeSuivante) % piece.getMatrice().size();
        return new InfoFormeSuivante(piece.getMatrice().get(formeSuivante), formeSuivante);
    }

    public int[][] getFormeCourrante() {
        return piece.getMatrice().get(formeCourrante);
    }

    public void setFormeCourrante(int formeCourrante) {
        this.formeCourrante = formeCourrante;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
        formeCourrante = 0;
    }
}
