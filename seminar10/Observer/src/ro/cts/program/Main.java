package ro.cts.program;

import ro.cts.clase.Autobuz;
import ro.cts.clase.Calator;
import ro.cts.clase.IObservator;
import ro.cts.clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        IObservator calator = new Calator("Vasile");
        IObservator calator2 = new Calator("George");
        IObservator calator3 = new Calator("Mihaela");

        MijlocTransport autobuz1 = new Autobuz(331);
        autobuz1.abonareObservator(calator);
        autobuz1.abonareObservator(calator2);
        autobuz1.abonareObservator(calator3);
        autobuz1.pleacaDeLaCapat();

        autobuz1.dezabonareObservator(calator2);
        ((Autobuz) autobuz1).schimbaTraseu();



    }
}
