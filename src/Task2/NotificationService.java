package Task2;
import java.util.List;

public class NotificationService {
    private Notification notification;

    public NotificationService(Notification notification) {
        this.notification = notification;
    }

    public void sendBulkNotifications(String message, List<String> recipients) {
        for (String recipient : recipients) {
            notification.send(message, recipient);
        }
    }
}
