package ro.cts.clase;

public class Pacient implements PacientAbstract{
    private String nume;
    private String nrTelefon;
    private String adresaMail;

    public Pacient(String nume, String nrTelefon, String adresaMail) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresaMail = adresaMail;
    }

    @Override
    public String toString() {
        String separator = " | ";
        StringBuilder sb = new StringBuilder("Pacient: {");
        sb.append("nume = ").append(nume).append(separator);
        sb.append("numar telefon = ").append(nrTelefon).append(separator);
        sb.append("adresa mail= ").append(adresaMail).append("}");
        return sb.toString();
    }

    @Override
    public void afiseazaPacient(Spitalizare spitalizare) {
        System.out.println(this.toString() + spitalizare.toString());
    }
}
