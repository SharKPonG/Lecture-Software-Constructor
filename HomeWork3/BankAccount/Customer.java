package HomeWork3.BankAccount;

public class Customer {
    private String name;
    private BankAccount account;

    public Customer(String name, BankAccount account){
        this.name = name;
        this.account = account;
    }

    public void ShowInfo(){
        System.out.println(name + "'s  balance: " + account.getBalance());
    }
}
