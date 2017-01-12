package model;

import java.util.ArrayList;

/**
 * Building a table to display in table.fxml
 *
 * @author Bryan Garcia
 */
public class TableModel {

    private ArrayList<String> columns = new ArrayList<>();
    //TODO change rows to hashmap for easy search
    private ArrayList<String> rows = new ArrayList<>();


    /**
     * Add a row to the model
     *
     * @param rowName
     */
    public void addRow(String rowName) {
        rows.add(rowName);
    }


    /**
     * Add a column name to the model
     *
     * @param columnName
     */
    public void addColumn(String columnName) {
        columns.add(columnName);
    }


    /**
     * Add an array list of column names to columns
     *
     * @param allColumns
     */
    public void addColumn(ArrayList<String> allColumns) {
        for (String c : allColumns) {
            columns.add(c);
        }
    }


    public ArrayList<String> getColumns() {
        return columns;
    }


    public ArrayList<String> getRows() {
        return rows;
    }


    public boolean isBuilt() {
        if (columns.isEmpty() || rows.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }


    @Override
    public String toString() {
        if (!isBuilt()) {
            return "TableModel not built";
        } else {

            String ret = "TableModel {\ncolumns= ";

            for (String s : columns) {
                ret = ret + s + '\n';
            }
            ret = ret + "\nrows= ";

            for (String s : rows) {
                ret = ret + s + '\n';
            }
            ret = ret + "}\n";


            return ret;
        }
    }
}
