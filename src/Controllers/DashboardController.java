package Controllers;

/**
 * Bryan Garcia
 * 12/8/16
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable{

    @FXML private Button stateButton;
    @FXML private Button countryButton;
    @FXML private Button trialButton;
    @FXML private Button victimButton;
    @FXML private Button skButton;
    @FXML private TableView dbTable;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        dbTable.setVisible(false);
    }

    @FXML
    public void showStateTable(ActionEvent e){
        dbTable.setVisible(true);
    }
}
