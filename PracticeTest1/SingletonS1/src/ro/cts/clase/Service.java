package ro.cts.clase;

import java.util.Date;

public class Service implements IService{
    private String nume;
    private String locatie;
    private int nrAngajati;
    private AMasina masina;

    public static Service serviceThreadSafe = null;

    private Service(String nume, String locatie, int nrAngajati, AMasina masina) {
        this.nume = nume;
        this.locatie = locatie;
        this.nrAngajati = nrAngajati;
        this.masina = masina;
    }

    public String getNume() {
        return nume;
    }

    public String getLocatie() {
        return locatie;
    }

    public int getNrAngajati() {
        return nrAngajati;
    }

    public AMasina getMasina() {
        return masina;
    }

    public static synchronized IService getServiceThreadSafe(String nume, String locatie, int nrAngajati, AMasina masina) {
        if (serviceThreadSafe == null) {
            serviceThreadSafe = new Service(nume, locatie, nrAngajati, masina);
        }
        return serviceThreadSafe;
    }

    @Override
    public Date programare(AMasina masina) {
        if (this.masina == null) {
            this.masina = masina;
            Date dataProgramare = new Date(); // Data și ora curentă
            System.out.println("Mașină programată: " + masina.descriereMasina());
            return dataProgramare;
        } else {
            System.out.println("Service-ul este ocupat cu mașina: " + this.masina.descriereMasina());
            return null;
        }
    }

    public void elibereazaMasina() {
        if (this.masina != null) {
            System.out.println("Mașina " + this.masina.descriereMasina() + " a părăsit service-ul.");
            this.masina = null;
        } else {
            System.out.println("Nu există nicio mașină în service.");
        }
    }
}
