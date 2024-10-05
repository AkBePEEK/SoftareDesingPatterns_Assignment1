import Task1.*;

public class Main {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        PaymentService creditCardService = new PaymentService(creditCardPayment);
        creditCardService.executePayment(2000.0);

        Payment PayPal = new PayPalPayment();
        PaymentService PayPalService = new PaymentService(PayPal);
        PayPalService.executePayment(1000);

        Payment bank = new BankTransferPayment();
        PaymentService bankService = new PaymentService(bank);
        bankService.executePayment(500);
    }
}