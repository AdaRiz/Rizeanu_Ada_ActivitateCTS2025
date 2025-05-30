package ro.cts.clase;

public class Calator implements IObservator{
    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    public void primesteMesaj(String mesaj) {
        System.out.println(this.nume + " ai primit urmatorul mesaj: " + mesaj);
    }
}
