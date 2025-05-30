package ro.cts.program;

import ro.cts.clase.Departament;
import ro.cts.clase.IStructura;
import ro.cts.clase.Sectie;

public class Main {
    public static void main(String[] args) {
        IStructura departament = new Departament("Chirurgie", 30);
        IStructura departament2 = new Departament("Ortopedie", 20);

        IStructura departamentGeneral = new Departament("General", 70);

        IStructura sectie1 = new Sectie("Chirurgie1");
        IStructura sectie2 = new Sectie("Ortopedie1");

        try{
            departamentGeneral.adaugaStructura(departament);
            departamentGeneral.adaugaStructura(departament2);
            departament.adaugaStructura(sectie1);
            departament2.adaugaStructura(sectie2);

            departamentGeneral.afiseazaDescriere();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
