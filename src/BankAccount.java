public class BankAccount {

    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public BankAccount(){
        //using a constructor with a constructor to assign default values
        //the line below MUST be the first statement in the constructor body
        this("56789", 2.50, "Default", "Default", "Default");
    }

    public BankAccount(String accountNumber, double balance, String name, String email, String phone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void depositFunds(double amt){
        this.balance += amt;
        System.out.println("New balance is: " + this.balance);
    }

    public void withdrawFunds(double amt){
        if(amt > this.balance){
            System.out.println("Insufficient funds");
        }else{
            balance -= amt;
            System.out.println("New balance is: " + this.balance);
        }
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.depositFunds(45.00);
        myAccount.withdrawFunds(15.76);
        myAccount.withdrawFunds(40);

        BankAccount myOtherAccount = new BankAccount("123B", 50.00, "Kaitlin", "kaitlin@kait.com", "1234");
        System.out.println(myOtherAccount.getBalance());

    }


}
