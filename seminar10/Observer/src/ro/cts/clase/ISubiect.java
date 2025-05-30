package ro.cts.clase;

import java.util.Observable;

public interface ISubiect {
    void abonareObservator(IObservator observator);
    void dezabonareObservator(IObservator obserator);
    void trimiteMesaj(String mesaj);
}
