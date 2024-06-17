package constructor;

public class BankAcct {
    private String name;
    private int balance;
    char currency = '$';
    // create a bank acct
    // create with a name
    // we can get the bal, withdraw, deposit
    // getBal - mention the person name along with the balance
    // deopsit - name your deposit was successful your new bal is ...
    // withdraw - name insufficient bal , withdrawal was successful your new bal is ...
    public BankAcct(String name) {
        this.name = name;
    }

    public void getBalance() {
        System.out.println("Hi " + name + " your balance is: " + currency + balance);
    }

    public void deposit(int funds) {
        if (funds > 0) {
            balance += funds;
            System.out.println("Hi " + name + " your deposit was successful your new bal is: " + currency + balance);
        } else {
            System.out.println("Sorry " + name + " your deposit was unsuccessful your bal is: " + currency + balance);
        }

    }

    public void withdraw(int funds) {
        if (funds > balance) {
            System.out.println("Sorry " + name + " insufficient bal, your balance is: " + currency + balance);
        } else {
            balance -= funds;
            System.out.println("Hi " + name + " you've successful withdrawn " + currency + funds + " from your acct, your new bal is: " + currency + balance);

        }

    }

}
