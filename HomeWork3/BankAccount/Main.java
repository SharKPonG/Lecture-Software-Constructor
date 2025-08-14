package HomeWork3.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1200, "SharkPongAccount");
        Customer customer = new Customer("SharkPong", acc);
        customer.ShowInfo();
    }
}
