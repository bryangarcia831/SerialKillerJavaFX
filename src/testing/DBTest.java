package testing;

import junit.framework.TestCase;
import model.TableModel;
import utilities.DatabaseUtil;


/**
 * Testing cases for the Database
 *
 * @author Bryan Garcia
 */
public class DBTest extends TestCase {

    private String tableSchema;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        tableSchema = "Country";
    }

    /**
     * Calls the Database Utility and checks the schema specified.
     * The Contents of Table Model created are displayed in system out
     *
     * @throws Exception
     */
    public void testGetSchema() throws Exception {
        DatabaseUtil db = new DatabaseUtil();
        TableModel tempModel = db.getSchema(tableSchema);

        assertTrue(tempModel.isBuilt());
    }


    /**
     * Calls the Database Utility and checks the schema specified.
     * Tests the toString method.
     *
     * @throws Exception
     */
    public void testToString() throws Exception {
        DatabaseUtil db = new DatabaseUtil();
        TableModel tempModel = db.getSchema(tableSchema);

        String tableModelAsString = tempModel.toString();

        assertTrue(!tableModelAsString.isEmpty());
    }

}
