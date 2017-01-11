package testing;

import java.util.HashMap;

import junit.framework.*;

import model.GenericModel;
import utilities.DatabaseUtil;


/**
 * Testing cases for the Database
 * @author Bryan Garcia
 */
public class DBTest extends TestCase{

    private String tableSchema;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        tableSchema = "Country";
    }

    /**
     * Calls the Database Utility and checks the schema specified.
     * The Contents of Table Model created are displayed in system out
     * @throws Exception
     */
    public void testGetSchema() throws Exception {
        DatabaseUtil db = new DatabaseUtil();
        HashMap<GenericModel, String> temp = db.getSchema(tableSchema);

        //TODO change getSchema to return hashmap
//        assertTrue(!temp.isEmpty());
    }
}
