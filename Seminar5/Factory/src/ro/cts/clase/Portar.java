package ro.cts.clase;

public class Portar extends Angajat{
    private int vechime;

    public Portar(String nume, double salariu) {
        super(nume, salariu);
    }

    public Portar(String nume, double salariu, int vechime) {
        super(nume, salariu);
        this.vechime = vechime;
    }
}
