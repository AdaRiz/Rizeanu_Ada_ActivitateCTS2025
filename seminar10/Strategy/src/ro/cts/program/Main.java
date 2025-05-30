package ro.cts.program;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        IMetodaPlata metodaPlata = new CardCalatorie(5);
        Calator calator = new Calator("Ioana", metodaPlata);
        calator.platesteBilet(5);
        calator.setMetodaPlata(new plataSMS(10));
        calator.platesteBilet(5);
        calator.setMetodaPlata(new CardBancar(5));
        calator.platesteBilet(5);
        calator.setMetodaPlata(metodaPlata);
        calator.platesteBilet(5);
    }
}
