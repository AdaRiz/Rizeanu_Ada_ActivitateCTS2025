package ro.cts.clase;

public class SupaCiuperci extends Supa{
    public SupaCiuperci(float pret, float cantitate, float calorii) {
        super(pret, cantitate, calorii);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(super.toString());
    }
}
