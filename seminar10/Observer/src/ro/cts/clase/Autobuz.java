package ro.cts.clase;

public class Autobuz extends MijlocTransport{

    public Autobuz(int nrLinie) {
        super(nrLinie);
    }

    @Override
    public void pleacaDeLaCapat() {
      trimiteMesaj("Autobuzul: " + this.getNrLinie() + " pleaca de la capat.");
    }


    public void schimbaTraseu(){
        trimiteMesaj("Autobuzul: " + this.getNrLinie() + " si-a modificat traseul prin bd. Magheru");
    }
}
