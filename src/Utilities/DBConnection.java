package Utilities;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Author Bryan Garcia
 */
public class DBConnection {

    public Connection getConnection(){
        try {
            PropertyGetter pg = new PropertyGetter();

            //TODO Change this to Amazon RDS
            String url = pg.getPropValues("localDatabaseURL");
            String user = pg.getPropValues("localDatabaseUserName");
            String password = pg.getPropValues("localDatabasePassword");


            Class.forName("com.mysql.jdbc.Driver");

            return DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }

}
