package ro.cts.clase;

public class PushNotificare extends ANotifcare{
    public PushNotificare(String destinatar) {
        super(destinatar);
    }

    @Override
    public void trimiteNotificare(){
        System.out.println("Notificare tip push trimisa către " + destinatar);;
    }
}
