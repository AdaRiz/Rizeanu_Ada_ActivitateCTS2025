package ro.cts.program;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        INota notaDePlata = new NotaDePlata(500.20f);
        notaDePlata.printare();

        INota notaDecorata = new NotaDePlataCraciun(notaDePlata);
        notaDecorata.printare();

        INota notaDecorata2 = new NotaDePlataRevelion(notaDePlata);
        notaDecorata2.printare();

        INota notaDecorata3 = new NotaDePlataRevelion(notaDecorata);
        notaDecorata3.printare();
    }
}
