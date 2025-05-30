package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocTransport implements ISubiect{
    int nrLinie;
    List<IObservator> listaCalatori;

    public MijlocTransport(int nrLinie) {
        this.nrLinie = nrLinie;
        listaCalatori = new ArrayList<>();
    }

    public int getNrLinie() {
        return nrLinie;
    }

    public List<IObservator> getListaCalatori() {
        return listaCalatori;
    }

    @Override
    public void abonareObservator(IObservator observator){
        listaCalatori.add(observator);
    }

    @Override
    public void dezabonareObservator(IObservator obserator){
        listaCalatori.remove(obserator);
    }
    @Override
    public void trimiteMesaj(String mesaj){
        for(IObservator obs:listaCalatori){
            obs.primesteMesaj(mesaj);
        }
    }

    public abstract void pleacaDeLaCapat();
}
