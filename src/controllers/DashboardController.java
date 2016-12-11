package controllers;

/**
 * Controller for Views.dashboard.fxml
 *
 * @author Bryan Garcia
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {

    @FXML
    private Button stateButton;
    @FXML
    private Button countryButton;
    @FXML
    private Button trialButton;
    @FXML
    private Button victimButton;
    @FXML
    private Button skButton;
    @FXML
    private AnchorPane tableAP;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tableAP.setVisible(false);
    }

    /**
     * Will set the table to visible and start the process of grabbing data.
     * @param e
     */
    @FXML
    public void showStateTable(ActionEvent e) {
        tableAP.setVisible(true);
    }
}
