package ro.cts.clase;

import java.util.Arrays;

public class StudentLazy {
    private String nume;
    private int cod;
    private int[] note;
    private static StudentLazy instantaStudent = null;

    private StudentLazy(String nume, int cod, int[] note) {
        this.nume = nume;
        this.cod = cod;
        this.note = note;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int[] getNote() {
        return note;
    }

    public void setNote(int[] note) {
        this.note = note;
    }

    public static StudentLazy getInstantaStudent(String nume, int cod, int[] note) {
        if(instantaStudent == null) {
            instantaStudent = new StudentLazy(nume, cod, note);
        }
        return instantaStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", cod=" + cod +
                ", note=" + Arrays.toString(note)+
                '}';
    }
}
