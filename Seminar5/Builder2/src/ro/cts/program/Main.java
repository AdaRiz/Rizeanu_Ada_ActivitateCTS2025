package ro.cts.program;

import ro.cts.clase.Pacient;
import ro.cts.clase.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder1 = new PacientBuilder();
        pacientBuilder1.setHasPatRabatabil(true).setHasHalatInterior(true).setNumeInsotitor("Ioana");
        Pacient pacient1 = pacientBuilder1.build("Dorel");

        PacientBuilder pacientBuilder2 = new PacientBuilder();
        pacientBuilder2.setHasPatRabatabil(true).setHasHalatInterior(true).setNumeInsotitor("Maria");
        Pacient pacient2 = pacientBuilder2.build("Costel");

        PacientBuilder pacientBuilder3 = new PacientBuilder();
        pacientBuilder3.setHasPatRabatabil(true).setHasHalatInterior(true); // Fără insotitor nou
        Pacient pacient3 = pacientBuilder3.build("Bogdan");

        System.out.println(pacient1.toString());
        System.out.println(pacient2.toString());
        System.out.println(pacient3.toString());
    }
}
