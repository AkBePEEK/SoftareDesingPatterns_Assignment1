package Task1;

public class PaymentService {
    private final Payment payment;

    public PaymentService(Payment paymentProcessor) {
        this.payment = paymentProcessor;
    }

    public void executePayment(double amount) {
        payment.Payment(amount);
    }
}
