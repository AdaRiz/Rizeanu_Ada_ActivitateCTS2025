package ro.cts.clase;

public class RezervareTerasa extends AbstractRezervare{
    private boolean esteFumator;

    public RezervareTerasa() {
        super();
    }

    public RezervareTerasa(int nrParticipanti, int ora, String numeClient, int zi, boolean esteFumator) {
        super(nrParticipanti, ora, numeClient, zi);
        this.esteFumator = esteFumator;
    }

    @Override
    public AbstractRezervare copiaza(int ziua) {
        RezervareTerasa rezervare = new RezervareTerasa();
        rezervare.nrParticipanti = this.nrParticipanti;
        rezervare.ora = this.ora;
        rezervare.numeClient = this.numeClient;
        rezervare.zi = ziua;
        rezervare.esteFumator = this.esteFumator;





        return rezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervareTerasa{");
        sb.append("esteFumator= ").append(esteFumator);
        sb.append(", nrParticipanti= ").append(nrParticipanti);
        sb.append(", ora= ").append(ora);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", zi=").append(zi);
        sb.append('}');
        return sb.toString();
    }
}
