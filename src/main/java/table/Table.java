package table;

import constants.SeatType;
import constants.TableStatus;

public class Table {
    private String tableId;
    private int maxCapacity;
    private TableStatus status;

    public Table(String id, int maxCapacity, TableStatus status) {
        this.tableId = id;
        this.maxCapacity = maxCapacity;
        this.status = status;
    }

    public String getTableId() {
        return tableId;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public TableStatus getStatus() {
        return status;
    }

    public void setStatus(TableStatus status) {
        this.status = status;
    }
}
