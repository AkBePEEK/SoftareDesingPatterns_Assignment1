package Task2;

public class SlackNotification implements Notification{
    @Override
    public void send(String message, String recipient) {
        System.out.println("Sending slack notification to " + recipient + ": " + message);
    }
}
