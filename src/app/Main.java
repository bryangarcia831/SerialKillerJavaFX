package app;
/**
 * Starting place for the application
 *
 * @author Bryan Garcia
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static Stage stage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../Views/home.fxml"));
        primaryStage.setTitle("Serial Killers");
        primaryStage.setScene(new Scene(root));

        stage = primaryStage;

        primaryStage.show();
    }

    /**
     * @return Stage in which app is showing
     */
    public Stage getStage() {
        return stage;
    }
}
