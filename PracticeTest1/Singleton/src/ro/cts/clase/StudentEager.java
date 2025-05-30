package ro.cts.clase;

public class StudentEager {
    private int cod;
    private String nume;
    private boolean areBursaMerit;

    private static final StudentEager instataStudent = new StudentEager();

    private StudentEager() {
        this.cod = 10;
        this.nume = "Andreea";
        this.areBursaMerit = false;
    }

    public static StudentEager getInstataStudent() {
        return instataStudent;
    }


    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isAreBursaMerit() {
        return areBursaMerit;
    }

    public void setAreBursaMerit(boolean areBursaMerit) {
        this.areBursaMerit = areBursaMerit;
    }



    @Override
    public String toString() {
        return "StudentEager{" +
                "cod=" + cod +
                ", nume='" + nume + '\'' +
                ", areBursaMerit=" + areBursaMerit +
                '}';
    }
}
