package account;

import constants.AccountStatus;

public class Account {
    private String id;
    private String password;
    private String address;
    private AccountStatus status;

    public Account(String id, String password, String address, AccountStatus status) {
        this.id = id;
        this.password = password;
        this.address = address;
        this.status = status;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public void resetPassword(String newPassword) {
        this.password = newPassword;
    }
}
