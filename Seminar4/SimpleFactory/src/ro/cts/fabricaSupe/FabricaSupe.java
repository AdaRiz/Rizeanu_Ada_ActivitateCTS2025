package ro.cts.fabricaSupe;

import ro.cts.clase.Supa;
import ro.cts.clase.SupaCiuperci;
import ro.cts.clase.SupaLegume;
import ro.cts.clase.SupaVita;

public class FabricaSupe {
    private float pret;
    private float calorii;

    public FabricaSupe(float pret, float calorii) {
        this.pret = pret;
        this.calorii = calorii;
    }

    public Supa getSupa(TipSupa tip, float cantitate){
        switch (tip){
            case SUPALEGUME -> {
                SupaLegume supaLegume = new SupaLegume(pret, cantitate, calorii);
                return supaLegume;
            }
            case SUPAVITA -> {
                SupaVita supaVita = new SupaVita(pret, cantitate, calorii);
                return supaVita;
            }
            case SUPACIUPERCI -> {
                SupaCiuperci supaCiuperci = new SupaCiuperci(pret, cantitate, calorii);
                return supaCiuperci;
            }
            default -> {
                return null;
            }
        }
    }
}
