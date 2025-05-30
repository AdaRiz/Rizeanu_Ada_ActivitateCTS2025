package ro.cts.program;

import ro.cts.clase.FabricaPacienti;
import ro.cts.clase.Pacient;
import ro.cts.clase.PacientAbstract;
import ro.cts.clase.Spitalizare;


public class Main {
    public static void main(String[] args) {
        FabricaPacienti fabricaPacienti = new FabricaPacienti();

        try{
            PacientAbstract pacient1 = fabricaPacienti.getPacient("Mircea", "0732123456", "mircea@email.com");
            Spitalizare spitalizare = new Spitalizare(11, 6, 7);
            Spitalizare spitalizare1 = new Spitalizare(2, 9, 10);
            pacient1.afiseazaPacient(spitalizare);
            pacient1.afiseazaPacient(spitalizare1);

            Spitalizare spitalizare2 = new Spitalizare(21, 3, 14);
            Spitalizare spitalizare3 = new Spitalizare(3, 1, 10);

            fabricaPacienti.getPacient("Ioana", "0789098765", "ioana@email.ro").afiseazaPacient(spitalizare2);
            fabricaPacienti.getPacient("0732123456").afiseazaPacient(spitalizare3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
