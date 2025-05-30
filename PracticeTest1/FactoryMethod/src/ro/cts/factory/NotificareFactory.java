package ro.cts.factory;

import ro.cts.clase.EmailNotificare;
import ro.cts.clase.INotificare;
import ro.cts.clase.PushNotificare;
import ro.cts.clase.SmsNotificare;

public class NotificareFactory {
    public INotificare creareNotificare(String tip, String destinatar) {
        if (tip == null) {
            return null;
        }
        switch (tip.toLowerCase()) {
            case "sms":
                return new SmsNotificare(destinatar);
            case "email":
                return new EmailNotificare(destinatar);
            case "push":
                return new PushNotificare(destinatar);
            default:
                throw new IllegalArgumentException("Tipul de notificare necunoscut: " + tip);
        }
    }
}

