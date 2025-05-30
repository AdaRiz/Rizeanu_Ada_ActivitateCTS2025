package ro.cts.program;

import ro.cts.clase.AdapterObiecteMedicament;
import ro.cts.clase.MedicamentFarmacie;
import ro.cts.clase.MedicamentSpital;

public class Main {
    public static void vindeMedicament(MedicamentFarmacie medicamentFarmacie) {
        System.out.println("\nFarmacia noastra va ofera medicamentul: ");
        medicamentFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie1 = new MedicamentFarmacie("Paracetamol", 15.5f, true);
        MedicamentFarmacie medicamentFarmacie2 = new MedicamentFarmacie("Nurofen", 32.95f, true);

        vindeMedicament(medicamentFarmacie1);
        vindeMedicament(medicamentFarmacie2);

        MedicamentSpital medicamentSpital1 = new MedicamentSpital("Omez", 30.10f);
        MedicamentSpital medicamentSpital2 = new MedicamentSpital("Ampicilina", 36.99f);

        vindeMedicament(new AdapterObiecteMedicament(medicamentSpital1));
        vindeMedicament(new AdapterObiecteMedicament(medicamentSpital2));
    }
}
