package fabrici;

import ro.cts.clase.Angajat;
import ro.cts.clase.TipPersonal;

public class FactoryPersonalMedical {
    @Override
    public Angajat creareAngajat(TipPersonal tipPersonalMedical, String nume,){
        return switch(tipPersonalMedical){

        }
    }
}
