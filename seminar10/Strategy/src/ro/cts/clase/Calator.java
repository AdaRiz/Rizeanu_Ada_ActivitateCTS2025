package ro.cts.clase;

public class Calator {
    private String nume;
    IMetodaPlata metodaPlata;

    public Calator(String nume) {
        this.nume = nume;
        metodaPlata = new CardCalatorie(100);
    }

    public Calator(String nume, IMetodaPlata metodaPlata) {
        this.nume = nume;
        this.metodaPlata = metodaPlata;
    }

    public void setMetodaPlata(IMetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void platesteBilet(float pretBilet){
        metodaPlata.realizeazaPlata(pretBilet);
    }
}
