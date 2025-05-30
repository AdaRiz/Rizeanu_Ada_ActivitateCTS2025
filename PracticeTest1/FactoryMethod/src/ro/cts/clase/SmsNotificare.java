package ro.cts.clase;

import ro.cts.clase.INotificare;

public class SmsNotificare extends ANotifcare {
    public SmsNotificare(String destinatar) {
        super(destinatar);
    }

    @Override
    public void trimiteNotificare(){
        System.out.println("SMS trimis către " + destinatar);;
    }
}
