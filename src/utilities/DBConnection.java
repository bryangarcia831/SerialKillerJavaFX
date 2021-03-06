package utilities;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Used as a connection to my Amazon RDS database
 *
 * @author Bryan Garcia
 */
public class DBConnection {

    private Connection connection;

    /**
     * Set the MysqlDataSource connection.
     */
    public void setConnection() {
        try {
            PropertyGetter pg = new PropertyGetter();

            String url = pg.getPropValues("localDatabaseURL");
            String user = pg.getPropValues("localDatabaseUserName");
            String password = pg.getPropValues("localDatabasePassword");
            String database = pg.getPropValues("localDatabase");

            MysqlDataSource ds = new MysqlDataSource();
            ds.setServerName(url);
            ds.setPortNumber(3306);
            ds.setDatabaseName(database);
            ds.setUser(user);
            ds.setPassword(password);

            connection = ds.getConnection();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        if (connection == null) {
            setConnection();
        }
        return connection;
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
