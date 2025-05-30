package ro.cts.clase;

public abstract class ANotifcare implements INotificare{
    protected String destinatar;

    public ANotifcare(String destinatar) {
        this.destinatar = destinatar;
    }
}
