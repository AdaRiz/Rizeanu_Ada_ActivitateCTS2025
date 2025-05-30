package ro.cts.main;

import ro.cts.clase.Supa;
import ro.cts.fabricaSupe.FabricaSupe;
import ro.cts.fabricaSupe.TipSupa;

public class Main {
    public static void main(String[] args) {
        FabricaSupe fabricaSupa = new FabricaSupe(15.20f, 55.30f);
        Supa supaLegume = fabricaSupa.getSupa(TipSupa.SUPALEGUME, 290);
        Supa supaVita = fabricaSupa.getSupa(TipSupa.SUPAVITA, 380);
        Supa supaCiuperci = fabricaSupa.getSupa(TipSupa.SUPACIUPERCI, 300);

        supaLegume.afiseazaDescriere();
        supaVita.afiseazaDescriere();
        supaCiuperci.afiseazaDescriere();
    }
}