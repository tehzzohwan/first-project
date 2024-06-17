package abstraction;

public class Usage {
    public static void main(String[] args) {
        BankAccount bali = new SavingsAccount("Bali", "09099115299");

        bali.deposit(20);
        System.out.println(bali.getBalance());

        BankAccount lola = new CurrentAccount("Lola", "07034588657", 23);
//
//        lola.deposit(20);
//        System.out.println(lola.getBalance());
//
//        lola.withdraw(10);
//        System.out.println(lola.getBalance());
//
//        lola.withdraw(20);
//        System.out.println(lola.getBalance());



    }
}
