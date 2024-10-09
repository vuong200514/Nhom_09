package person;

import account.Account;

public class Manager extends Employee {
    public Manager(String id, Account account, String name, String email, String phone) {
        super(id, account, name, email, phone);
    }

    public void addEmployee() {
        // Logic to add employee
    }
}
