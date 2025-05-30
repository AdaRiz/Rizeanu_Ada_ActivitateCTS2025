package Main;

import fabrici.FactoryPersonalMedical;
import fabrici.FactoryPersonalNonMeddical;
import ro.cts.clase.Angajat;
import ro.cts.clase.Medic;
import ro.cts.clase.TipPersonalMedical;

public class Main {
    public static void main(String[] args) {
        FactoryPersonalMedical factoryPersonalMedical = new FactoryPersonalMedical(10.5);
        FactoryPersonalNonMeddical factoryPersonalNonMeddical = new FactoryPersonalNonMeddical(10);
        Angajat medic = factoryPersonalMedical.creareAngajat(TipPersonalMedical.MEDIC, "medic", 5000);
        factoryPersonalMedical
    }
}
