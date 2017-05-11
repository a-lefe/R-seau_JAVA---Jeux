package mvc.Modele;

import mvc.Controleur.OperationMatrice;

import java.awt.*;

/**
 * Created by REZIGA on 10/04/2017.
 */
public class Plateau {
    private final int largeur;
    private final int hauteur;
    private final int score;
    private Point decalage;
    private final PieceGenerateur pieceGenerateur;
    private final PieceRotation pieceRotation;
    private int[][] matricePlateau;

    public Plateau(int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.pieceGenerateur = new PieceGenerateurHasard();
        this.pieceRotation = new PieceRotation();
        this.matricePlateau = new int[largeur][hauteur];
        this.score = 0;
    }

    public boolean creerPiece() {
        Piece pieceCourrante = pieceGenerateur.getPiece();
        decalage = new Point(4, 0);
        return OperationMatrice.intersect(matricePlateau, pieceRotation.getFormeCourrante(), (int) decalage.getX(), (int) decalage.getY());
    }


    public InfosPiecePlateau getInfosPiecePlateau() {
        return new InfosPiecePlateau(pieceRotation.getFormeCourrante(), (int) decalage.getX(), (int) decalage.getY(), pieceGenerateur.getNextPiece().getMatrice().get(0));
    }

    public int getScore() {
        return score;
    }

    public Point getDecalage() {
        return decalage;
    }

    public void setDecalage(Point decalage) {
        this.decalage = decalage;
    }

    public PieceGenerateur getPieceGenerateur() {
        return pieceGenerateur;
    }

    public PieceRotation getPieceRotation() {
        return pieceRotation;
    }

    public int[][] getMatricePlateau() {
        return matricePlateau;
    }

    public void setMatricePlateau(int[][] matricePlateau) {
        this.matricePlateau = matricePlateau;
    }
}
