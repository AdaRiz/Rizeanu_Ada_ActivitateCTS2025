package ro.cts.clase;

public class Pacient {
    private String nume;
    private int gradDificultate;

    public Pacient(String nume, int gradDificultate) {
        this.nume = nume;
        this.gradDificultate = gradDificultate;
    }

    public String getNume() {
        return nume;
    }

    public int getGradDificultate() {
        return gradDificultate;
    }

    @Override
    public String toString() {
        String delimitator = " | ";
        final StringBuilder sb = new StringBuilder("Pacient {");
        sb.append("nume = ").append(nume).append(delimitator);
        sb.append("grad dificultate = ").append('}');
        return sb.toString();
    }
}
