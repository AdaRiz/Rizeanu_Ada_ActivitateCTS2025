package ro.cts.clase;

public class EmailNotificare extends ANotifcare {
    public EmailNotificare(String destinatar) {
        super(destinatar);
    }

    @Override
    public void trimiteNotificare(){
        System.out.println("Email trimis către " + destinatar);;
    }
}
