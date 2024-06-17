package abstraction;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String name, String phoneNumber) {
        super(name, phoneNumber);
        setAccountNumber(phoneNumber.substring(1));
        System.out.println("Your account number is: " + getAccountNumber() + " with $" + getBalance() + " balance");

    }

    @Override
    public void deposit(int amount) {
        int balance = getBalance();
        if (amount > 0) {
            balance += amount;
            setBalance(balance);
            System.out.println("$" + amount  + " has been deposited in your account");
            System.out.println("Your new balance is: $" + balance);
        } else {
            System.out.println("Deposit failed!!!");
        }
    }

    @Override
    public void withdraw(int amount) {
        int balance = getBalance();
        if ( balance > amount) {
            balance -= amount;
            setBalance(balance);
            System.out.println("$" + amount + " successfully withdrawn from your account");
            System.out.println("Your new balance is: $" + balance);
        } else {
            System.out.println("Insufficient funds can't withdraw " + "$" + amount);
            System.out.println("Your balance is: $" + balance);
        }
    }
}
