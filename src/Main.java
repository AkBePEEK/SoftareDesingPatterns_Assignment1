import Task1.*;
import Task2.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Task 1
        Payment creditCardPayment = new CreditCardPayment();
        PaymentService creditCardService = new PaymentService(creditCardPayment);
        creditCardService.executePayment(2000.0);

        Payment PayPal = new PayPalPayment();
        PaymentService PayPalService = new PaymentService(PayPal);
        PayPalService.executePayment(1000);

        Payment bank = new BankTransferPayment();
        PaymentService bankService = new PaymentService(bank);
        bankService.executePayment(500);
        // Task 2
        Notification smsNotification = new SMSNotification();
        smsNotification.send("Hello via SMS!", "123456789");

        Notification emailNotification = new EmailNotification();
        emailNotification.send("Hello via Email!", "user@example.com");

        Notification pushNotification = new PushNotification();
        pushNotification.send("Hello via Push Notification!", "user123");

        NotificationService notificationService = new NotificationService(new SMSNotification());
        notificationService.sendBulkNotifications("Bulk SMS Message", Arrays.asList("123456789", "987654321"));

        NotificationService emailService = new NotificationService(new EmailNotification());
        emailService.sendBulkNotifications("Bulk Email Message", Arrays.asList("user1@example.com", "user2@example.com"));

        Notification slackNotification = new SlackNotification();
        slackNotification.send("Hello via Slack!", "slackUser");

        NotificationService slackService = new NotificationService(new SlackNotification());
        slackService.sendBulkNotifications("Bulk Slack Message", Arrays.asList("slackUser1", "slackUser2"));
    }
}