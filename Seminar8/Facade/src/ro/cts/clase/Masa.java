package ro.cts.clase;

public class Masa {
    private int nrMasa;
    private boolean esteLibera;
    private int nrPersoane;

    public Masa(int nrMasa, boolean esteLibera, int nrPersoane) {
        this.nrMasa = nrMasa;
        this.esteLibera = esteLibera;
        this.nrPersoane = nrPersoane;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }
}
