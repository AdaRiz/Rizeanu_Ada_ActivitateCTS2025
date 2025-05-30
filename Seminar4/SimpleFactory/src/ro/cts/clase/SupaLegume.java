package ro.cts.clase;

public class SupaLegume extends Supa{


    public SupaLegume(float pret, float cantitate, float calorii) {
        super(pret, cantitate, calorii);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Supa are pretul " + getPret() + ", gramajul " + getCantitate() + " si numarul de calorii" + getCalorii());
    }
}
