import javafx.application.Application;
import javafx.stage.Stage;
import mvc.Vue.Jeu;

/**
 * Created by REZIGA on 11/05/2017.
 */
public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        new Jeu();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
