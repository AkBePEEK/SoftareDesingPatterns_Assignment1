package Task1;

public class CreditCardPayment implements Payment {
    @Override
    public void Payment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
