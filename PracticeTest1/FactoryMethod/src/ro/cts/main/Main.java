package ro.cts.main;

import ro.cts.clase.INotificare;
import ro.cts.factory.NotificareFactory;

public class Main {
    public static void main(String[] args) {
        NotificareFactory factory = new NotificareFactory();

        INotificare sms = factory.creareNotificare("sms", "0723456789");
        sms.trimiteNotificare();

        INotificare email = factory.creareNotificare("email", "test@example.com");
        email.trimiteNotificare();

        INotificare push = factory.creareNotificare("push", "user123");
        push.trimiteNotificare();
    }
}
