package main;

import clase.Pacient;
import clase.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder = new PacientBuilder("Andrei");

        Pacient pacient = pacientBuilder.setNumeInsotitor("Ion").setHasHalatInterior(true).setHasPapuciDeCamera(true).setHasMicDejun(true).build();
        System.out.println(pacient.toString());

        Pacient pacient2 = pacientBuilder.setNumeInsotitor("Mihai").setHasMicDejun(true).build();
        System.out.println(pacient2.toString());
    }


}
