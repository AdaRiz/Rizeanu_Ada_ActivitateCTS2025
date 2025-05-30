package fabrici;

import ro.cts.clase.Angajat;
import ro.cts.clase.TipPersonal;

public interface FactoryPersonal {
    Angajat creareAngajat(TipPersonal tipPersonal);


}
