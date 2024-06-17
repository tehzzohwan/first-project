package abstraction;

import java.util.Random;

public class CurrentAccount extends BankAccount {

    private int age;

    public CurrentAccount(String name, String phoneNumber, int age) {
        super(name, phoneNumber);
        this.age = age;
        setAccountNumber(generateAccountNumber());
        System.out.println("Your account number is: " + getAccountNumber() + " with $" + getBalance() + " balance");
    }

    public int getAge() {
        return age;
    }

    @Override
    public void deposit(int amount) {
        int balance = getBalance();
        if (amount > 0) {
            balance += amount;
            setBalance(balance);
            System.out.println("$" + amount + " has been deposited in your account");
            System.out.println("Your new balance is: $" + balance);
        } else {
            System.out.println("Deposit failed!!!");
        }
    }

    @Override
    public void withdraw(int amount) {
        int balance = getBalance();
        if (balance > amount) {
            balance -= amount;
            setBalance(balance);
            System.out.println("$" + amount + " successfully withdrawn from your account");
            System.out.println("Your new balance is: $" + balance);
        } else {
            System.out.println("Insufficient funds can't withdraw " + "$" + amount);
            System.out.println("Your balance is: $" + balance);
        }
    }

    private String generateAccountNumber() {
        return String.valueOf(new Random()
                .nextInt((9 * (int) Math.pow(10, 10 - 1)) - 1)
                + (int) Math.pow(10, 10 - 1));
    }
}
