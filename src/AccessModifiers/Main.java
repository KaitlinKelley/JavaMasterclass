package AccessModifiers;

public class Main {

    public static void main(String[] args) {

        Account account = new Account("My Account");
        account.deposit(1000);
        account.withdraw(500);
        account.withdraw(-200);
        account.deposit(-20);
        account.calculateBalance();

        //since the variables are public, this can happen. Not good!
//        account.balance = 5000;

        System.out.println("Balance is: " + account.getBalance());

    }
}
