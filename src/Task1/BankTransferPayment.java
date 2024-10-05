package Task1;

public class BankTransferPayment implements Payment{
    @Override
    public void Payment(double amount) {
        System.out.println("Processing bank transfer payment of $" + amount);
    }
}
