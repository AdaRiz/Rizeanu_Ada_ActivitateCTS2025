package ro.cts.clase;

public class StudentThreadSafe {
    private int cod;
    private static String nume;
    private int grupa;

    private static volatile StudentThreadSafe instantaStudent = null;

    public StudentThreadSafe(int cod, String nume, int grupa) {
        this.cod = cod;
        this.nume = nume;
        this.grupa = grupa;
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

    public int getGrupa() {
        return grupa;
    }

    public void setGrupa(int grupa) {
        this.grupa = grupa;
    }

    public static synchronized StudentThreadSafe getInstantaStudent(int cod, String nume, int grupa) {
        if(instantaStudent == null){
            instantaStudent = new StudentThreadSafe(cod, nume, grupa);
        }
        return instantaStudent;
    }

    @Override
    public String toString() {
        return "StudentThreadSafe{" +
                "cod=" + cod + ", nume= " + nume +
                ", grupa=" + grupa +
                '}';
    }
}
