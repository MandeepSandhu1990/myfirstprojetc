package abc;

public class Account {
    private static final String branch = "ABC Branch";

    private long accountNumber;
    private String accountHolderName;
    private double balance;


    public Account(long accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        System.out.println("Account open sucessfully");
    }


    public void depositBalance(double amount){
        balance = balance + amount;
        System.out.println(amount + "amount deposit sucessfully");
    }

    public void withdrawBalance(double amount) {
        if (balance < amount) {
            System.out.println("insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println(amount + "amount withdraw sucessfully");
        }
    }

    public double checkBalance(){
        return balance;
    }

}
