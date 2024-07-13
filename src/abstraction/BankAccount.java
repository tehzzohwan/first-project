package abstraction;

public abstract class BankAccount {
/*
Bank account is an application that enable you to create a bank account,
user can withdraw and deposit in the app
 */
    private String name;
    private String phoneNumber;
    private int balance;
    private String accountNumber;

    public BankAccount(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.balance = 0;
        System.out.println("Hello " + name + " welcome to Pilo bank");
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public abstract void deposit(int amount);

    public abstract void withdraw(int amount);

}
