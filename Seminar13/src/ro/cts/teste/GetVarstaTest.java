package ro.cts.teste;

import org.junit.Test;
import ro.cts.clase.Persoana;
import ro.cts.exceptii.ExceptieCNPInexistent;
import ro.cts.exceptii.ExceptieCNPInvalid;

import static org.junit.Assert.*;

public class GetVarstaTest {
    private Persoana persoana;

    @org.junit.Before
    public void setUp() throws Exception {
        persoana = new Persoana();
    }

    @org.junit.Test
    public void getVarstaRight() {
        persoana = new Persoana("Costel", "1921126123456");
        assertEquals(32,persoana.getVarsta());
    }

    @org.junit.Test
    public void getVarstaRight1() {
        persoana = new Persoana("Costel", "6021126123456");
        assertEquals(22,persoana.getVarsta());
    }

    @org.junit.Test
    public void getVarstaBoundary() {
        persoana = new Persoana("Costel", "1991231123456");
        assertEquals(25,persoana.getVarsta());
    }

    @org.junit.Test
    public void getVarstaBoundary1() {
        persoana = new Persoana("Costel", "5000101123456");
        assertEquals(25,persoana.getVarsta());
    }

    @Test(expected = ExceptieCNPInvalid.class)
    public void getVarstaError() {
        persoana = new Persoana("Costel", "5b00101123456");
        persoana.getVarsta();
    }

    @Test(expected = ExceptieCNPInvalid.class)
    public void getVarstaError1() {
        persoana = new Persoana("Costel", "5001401123456");
        persoana.getVarsta();
    }

    @Test(timeout = 100)
    public void getVarstaPerformance() {
        persoana = new Persoana("Costel", "5001001123456");
        persoana.getVarsta();
    }

    @Test
    public void getVarstaOrder(){
        persoana = new Persoana("Dorel", "5001001123456");
        Persoana persoana1 = new Persoana("Vasile", "1990101123456");
        assertTrue(persoana1.getVarsta() > persoana.getVarsta());
    }

    @Test(expected = ExceptieCNPInexistent.class)
    public void getVarstaExistence(){
        persoana = new Persoana("Andrei", null);
        persoana.getVarsta();
    }

    @Test()
    public void getVarstaCardinality(){
        persoana = new Persoana("Mihai", "6250129123456");
        assertEquals(0, persoana.getVarsta());
    }

    @Test()
    public void getVarstaCardinality1(){
        persoana = new Persoana("Mihai", "6240130123456");
        assertEquals(1, persoana.getVarsta());
    }
}