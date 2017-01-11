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

import utilities.DatabaseUtil;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class Main extends Application {

    private static Stage stage;
    private static Logger logger;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//        initLogger();

        Parent root = FXMLLoader.load(getClass().getResource("../views/home.fxml"));
        primaryStage.setTitle("Serial Killers");
        primaryStage.setScene(new Scene(root));

        stage = primaryStage;

        primaryStage.show();
    }


    /**
     * Initialize the logger file for error handling
     * Gets current timestamp then creates a error logging file.
     */
    private void initLogger() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        Handler handler = null;

        try {
            handler = new FileHandler("test.log." + sdf.format(timestamp));
            Logger.getLogger("").addHandler(handler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @return Stage in which app is showing
     */
    public Stage getStage() {
        return stage;
    }
}
