package HomeWork3.BankAccount;

public class BankAccount {
    private double balance;
    public final String accountNumber;
    public static double interestRate = 0.05;

    public BankAccount(double balance, String accountNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            amount += balance; 
        }else{
            System.out.println("Your Money must > 0 ");
        }
    }

    public void withdraw(double amount){
        if (amount < 0){
            System.out.println("Cannot withdraw kwai");
        }else if (amount > balance){
            System.out.println("Your money is not enough for withdraw");
        }else{
            balance -= amount;
        }
    }


    

}
