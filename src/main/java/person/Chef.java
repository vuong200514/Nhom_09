package person;

import account.Account;

public class Chef extends Employee {
    public Chef(String id, Account account, String name, String email, String phone) {
        super(id, account, name, email, phone);
    }

    public void takeOrder() {
        // Logic to take order
    }
}
