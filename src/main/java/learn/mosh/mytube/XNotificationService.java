package learn.mosh.mytube;

public class XNotificationService implements NotificationService {

    @Override
    public void notify(User user) {
        System.out.println("The user "+user.getEmail()+" was notified about the upload");
    }
}
