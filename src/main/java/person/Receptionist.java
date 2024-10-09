package person;

import account.Account;

public class Receptionist extends Employee {
    public Receptionist(String id, Account account, String name, String email, String phone) {
        super(id, account, name, email, phone);
    }

    public void createReservation() {
        // Logic to create reservation
    }
}
