package Task1;

public class PayPalPayment implements Payment{
    @Override
    public void Payment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
