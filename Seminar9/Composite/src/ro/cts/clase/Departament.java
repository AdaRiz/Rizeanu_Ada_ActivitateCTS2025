package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements IStructura {

    private String denumire;
    private int nrAngajati;
    List<IStructura> listaSectii;

    public Departament(String denumire, int nrAngajati) {
        this.denumire = denumire;
        this.nrAngajati = nrAngajati;
        listaSectii = new ArrayList<>();
    }

    @Override
    public void adaugaStructura(IStructura structura) throws Exception{
        listaSectii.add(structura);
    }

    @Override
    public void stergeStructura(IStructura structura) throws Exception{
        listaSectii.remove(structura);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Departamentul " + denumire + " are " + nrAngajati + " angajati si este compus din: ");
        for(IStructura s:listaSectii)
            s.afiseazaDescriere();
    }

    @Override
    public IStructura getStructura(int cheie) throws Exception {
        return listaSectii.get(cheie);
    }
}
