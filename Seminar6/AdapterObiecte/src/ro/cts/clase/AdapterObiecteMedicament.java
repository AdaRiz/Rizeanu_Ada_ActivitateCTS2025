package ro.cts.clase;

public class AdapterObiecteMedicament extends MedicamentFarmacie{
    private MedicamentSpital medicament;

    public AdapterObiecteMedicament(String denumire, float pret, boolean esteInStoc) {
        super(denumire, pret, esteInStoc);
    }

//    public AdapterObiecteMedicament(MedicamentSpital medicament) {
//        super(medicament.getDenumire(), medicament.getPret(), true);
//        this.medicament = medicament;
//    }


    public AdapterObiecteMedicament(MedicamentSpital medicament) {
        super(medicament.getDenumire(), medicament.getPret(), true);
        this.medicament = medicament;
    }

    public void cumparaMedicament() {
        medicament.achizitioneazaMedicament();
    }
}
