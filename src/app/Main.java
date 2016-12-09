package app;
/**
 * @author Bryan Garcia
 */

import Utilities.PropertyGetter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Starting place for the application
 */
public class Main extends Application {

    private static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../Views/home.fxml"));
        primaryStage.setTitle("Serial Killers");
        primaryStage.setScene(new Scene(root));

        stage = primaryStage;

        PropertyGetter pg = new PropertyGetter();

        //TODO Change this to Amazon RDS
        String url = pg.getPropValues("localDatabaseURL");
        String user = pg.getPropValues("localDatabaseUserName");
        String password = pg.getPropValues("localDatabasePassword");

        System.out.println(url + " " + user + " " + password);

        primaryStage.show();
    }

    /**
     * @return Stage in which app is showing
     */
    public Stage getStage() {
        return stage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
