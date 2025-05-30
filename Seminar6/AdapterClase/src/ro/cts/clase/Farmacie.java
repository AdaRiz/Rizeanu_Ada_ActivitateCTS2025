package ro.cts.clase;

public class Farmacie {
    private String nume;

    public Farmacie(String nume) {
        this.nume = nume;
    }

    public void vindeMedicament(IMedicamentFarmacie medicamentFarmacie) {
        System.out.println("\nFarmacia " + nume + " va ofera medicamentul: ");
        medicamentFarmacie.cumparaMedicament();
    }
}
