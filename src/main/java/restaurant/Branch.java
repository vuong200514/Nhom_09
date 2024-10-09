package restaurant;

import table.Table;
import java.util.ArrayList;
import java.util.List;

public class Branch {
    private String name;
    private String location;
    private List<Table> tables;

    public Branch(String name, String location) {
        this.name = name;
        this.location = location;
        this.tables = new ArrayList<>();
    }

    public void addTable(Table table) {
        tables.add(table);
    }

    public void printTables() {
        System.out.println("Branch: " + name + " at " + location);
        for (Table table : tables) {
            System.out.println("Table ID: " + table.getTableId());
        }
    }

    public String getName() {
        return name;
    }
}
