package ro.cts.program;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        Farmacie farmacie = new Farmacie("Catena");
        IMedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("No-Spa", 20.30f, true);
        farmacie.vindeMedicament(medicamentFarmacie);

        MedicamentSpital medicamentSpital = new MedicamentSpital("Aspenter", 37.50f);
        AdapterClaseMedicament adapter = new AdapterClaseMedicament(medicamentSpital.getDenumire(), medicamentSpital.getPret());

        AdapterClaseMedicament adapterClaseMedicament = new AdapterClaseMedicament("Omez", 35.10f);
        farmacie.vindeMedicament(adapterClaseMedicament);
        adapterClaseMedicament.achizitioneazaMedicament();
    }
}
