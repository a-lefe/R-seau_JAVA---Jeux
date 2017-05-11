package mvc.Vue;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import mvc.Modele.InfosPiecePlateau;
import mvc.Modele.Plateau;

import static javafx.scene.paint.Color.*;

/**
 * Created by REZIGA on 10/04/2017.
 */
public class Jeu {
    private Plateau plateau = new Plateau(25, 10);
    private Rectangle[][] matrice;
    private Rectangle[][] rectangles;
    private static final int TAILLE_PIECE = 20;
    private GridPane jeuPanel;
    private GridPane piecePanel;

    public Jeu() {
        plateau.creerPiece();
        initialiserPlateau(plateau.getMatricePlateau(), plateau.getInfosPiecePlateau());
    }

    public void initialiserPlateau(int[][] matricePlateau, InfosPiecePlateau piece) {
        matrice = new Rectangle[matricePlateau.length][matricePlateau[0].length];
        for (int i = 2; i < matricePlateau.length; i++) {
            for (int j = 0; j < matricePlateau[i].length; j++) {
                Rectangle rectangle = new Rectangle(TAILLE_PIECE, TAILLE_PIECE);
                rectangle.setFill(TRANSPARENT);
                matrice[i][j] = rectangle;
                jeuPanel.add(rectangle, j, i - 2);
            }
        }

        rectangles = new Rectangle[piece.getPieceData().length][piece.getPieceData()[0].length];
        for (int i = 0; i < piece.getPieceData().length; i++) {
            for (int j = 0; j < piece.getPieceData()[i].length; j++) {
                Rectangle rectangle = new Rectangle(TAILLE_PIECE, TAILLE_PIECE);
                rectangle.setFill(getCouleur(piece.getPieceData()[i][j]));
                rectangles[i][j] = rectangle;
                piecePanel.add(rectangle, j, i);
            }
        }
        piecePanel.setLayoutX(jeuPanel.getLayoutX() + piece.getxPosition() * piecePanel.getVgap() + piece.getxPosition() * TAILLE_PIECE);
        piecePanel.setLayoutY(-42 + jeuPanel.getLayoutY() + piece.getyPosition() * piecePanel.getHgap() + piece.getyPosition() * TAILLE_PIECE);

        /*generatePreviewPanel(piece.getNextpieceData());


        timeLine = new Timeline(new KeyFrame(
                Duration.millis(400),
                ae -> moveDown(new MoveEvent(EventType.DOWN, EventSource.THREAD))
        ));
        timeLine.setCycleCount(Timeline.INDEFINITE);
        timeLine.play();*/
    }

    private Paint getCouleur(int i) {
        Paint couleur;
        switch (i) {
            case 0:
                couleur = TRANSPARENT;
                break;
            case 1:
                couleur = AQUA;
                break;
            case 2:
                couleur = BLUEVIOLET;
                break;
            case 3:
                couleur = DARKGREEN;
                break;
            case 4:
                couleur = YELLOW;
                break;
            case 5:
                couleur = RED;
                break;
            case 6:
                couleur = BEIGE;
                break;
            case 7:
                couleur = BURLYWOOD;
                break;
            default:
                couleur = WHITE;
                break;
        }
        return couleur;
    }
}
