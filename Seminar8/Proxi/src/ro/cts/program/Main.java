package ro.cts.program;

import ro.cts.clase.IRezervare;
import ro.cts.clase.ProxiNrPersoane;
import ro.cts.clase.ProxiOra;
import ro.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervaMasa = new Rezervare();
        rezervaMasa.rezervare("Mihai", 6, 13);

        IRezervare proxiNrPersoane = new ProxiNrPersoane(rezervaMasa);
        proxiNrPersoane.rezervare("Alina", 2, 18);

        IRezervare proxiOraRezervare = new ProxiOra(rezervaMasa);
        proxiOraRezervare.rezervare("Costel", 4, 19);
    }
}
