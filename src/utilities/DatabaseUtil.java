package utilities;

import model.GenericModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

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
     * @return Hashmap with all tuples in the schema
     */
    public HashMap<GenericModel, String> getSchema(String table) {

        System.out.println("Inside get schema");

        ArrayList<String> columnTitles = new ArrayList();

        Connection con = DBConnection.getConnection();

        Statement stmt = null;

        String query = "SELECT name, population FROM " + table;

        try {
            stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(query);
            ResultSetMetaData metaData = rs.getMetaData();
            int colCount = metaData.getColumnCount();

//            //Getting column names

//            System.out.println("col count = " + colCount);
//            if (rs.next()) {
//                for (int i = 1; i < colCount; i++) {
//                    //TODO change to NOT temp
//                    String temp = rs.getString(i);
//                    System.out.println(temp);
//                    columnTitles.add(temp);
//                }
//            }

            metaData.getColumnCount();


            while (rs.next()){
                System.out.println(rs.getString("name") +  " \t \t \t pop: " + rs.getString("population"));
            }


//            while (rs.next()) {
            //TODO change to generic columns
//                String countryName = rs.getString("countryName");
//                String stateName = rs.getString("stateName");
//                System.out.println(countryName + "\t" + stateName + "\t");
//            }
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
        }
        return null;
    }

}
