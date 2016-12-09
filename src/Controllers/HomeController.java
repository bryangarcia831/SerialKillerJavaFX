package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import app.Main;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import javafx.scene.Parent;
import java.util.ResourceBundle;

public class HomeController implements Initializable{

    @FXML private Label linkedIn;

    private static Stage stage;

    private Main main;

    @FXML
    public void linkedInClick(){
        main.getHostServices().showDocument("https://www.linkedin.com/in/bryangarcia831");
    }

    @FXML
    public void showDashboard(){

        stage = main.getStage();

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../Views/dashboard.fxml"));
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
