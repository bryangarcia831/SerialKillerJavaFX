package controllers;
/**
 * Controller for Views/home.fxml
 *
 * @author Bryan Garcia
 */

import app.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    private static Stage stage;
    @FXML
    private Label linkedIn;
    private Main main;

    /**
     * Opens my LinkedIn in user's preferred browser.
     * Uses HostServices.
     */
    @FXML
    public void linkedInClick() {
        main.getHostServices().showDocument("https://www.linkedin.com/in/bryangarcia831");
    }

    /**
     * Access the dashboard after pressing the button
     */
    @FXML
    public void showDashboard() {

        stage = main.getStage();

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../views/dashboard.fxml"));
            stage.setTitle("Dashboard");
            stage.setScene(new Scene(root));

            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        main = new Main();
    }
}
