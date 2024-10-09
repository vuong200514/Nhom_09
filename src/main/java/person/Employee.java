package person;

import account.Account;

public abstract class Employee extends Person {
    private String employeeId;
    private Account account;

    public Employee(String id, Account account, String name, String email, String phone) {
        super(name, email, phone);
        this.employeeId = id;
        this.account = account;
    }

    // Additional methods can be added here
}
