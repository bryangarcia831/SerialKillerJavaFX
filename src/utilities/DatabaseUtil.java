package utilities;

import model.TableModel;

import java.sql.*;
import java.util.ArrayList;

/**
 * Utility for working with the mySQL database and DBConnection
 *
 * @author Bryan Garcia
 */
public class DatabaseUtil {

    /**
     * Interacts with DBConnection to get ALL tuples from database table
     *
     * @param table The table you want to pull
     * @return TableModel with all tuples in the schema and columns
     */
    public TableModel getSchema(String table) {
        DBConnection dbConnection = new DBConnection();

        TableModel tableModel = new TableModel();

        Connection con = dbConnection.getConnection();

        Statement stmt = null;

        String query = "SELECT name, population FROM " + table;

        try {
            stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(query);
            ResultSetMetaData metaData = rs.getMetaData();
            int colCount = metaData.getColumnCount();

            for (int i = 1; i < colCount + 1; i++) {
                tableModel.addColumn(metaData.getColumnName(i));
            }

            ArrayList<String> columns = tableModel.getColumns();

            //TODO change this so column labels are always changing
            while (rs.next()) {
                tableModel.addRow(rs.getString("name") + " \t \t \t pop: " + rs.getString("population"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    dbConnection.closeConnection();
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
        return tableModel;
    }

}
