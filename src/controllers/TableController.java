package controllers;

import javafx.fxml.Initializable;
import utilities.DBConnection;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

/**
 * Controller for Views/table.fxml
 *
 * @author Bryan Garcia
 */
public class TableController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        testJBDC();
    }

//    private void testJBDC() {
//        Connection con = DBConnection.getConnection();
//
//        Statement stmt = null;
//
//        String query = "select countryName, stateName from Contains";
//
//        try {
//            stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//            while (rs.next()) {
//                String countryName = rs.getString("countryName");
//                String stateName = rs.getString("stateName");
//
//                System.out.println(countryName + "\t" + stateName + "\t");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            if (stmt != null) {
//                try {
//                    stmt.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }


}
