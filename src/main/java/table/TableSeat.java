package table;

import constants.SeatType;

public class TableSeat {
    private int seatNumber;
    private SeatType type;

    public TableSeat(int seatNumber, SeatType type) {
        this.seatNumber = seatNumber;
        this.type = type;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public SeatType getType() {
        return type;
    }

    public void setType(SeatType type) {
        this.type = type;
    }
}
