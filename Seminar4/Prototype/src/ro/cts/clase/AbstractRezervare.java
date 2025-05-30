package ro.cts.clase;

public abstract class AbstractRezervare {
    protected int nrParticipanti;
    protected int ora;
    protected String numeClient;
    protected int zi;

    public void setZi(int zi) {
        this.zi = zi;
    }

    public AbstractRezervare(int nrParticipanti, int ora, String numeClient, int zi) {
        if(nrParticipanti < 2){
            this.nrParticipanti = 2;
        }
        else {
            this.nrParticipanti = nrParticipanti;
        }

        if(ora >= 10 && ora <= 22){
            this.ora = ora;
        }
        else{
            ora = 12;
        }
        if(numeClient.length() > 2) {
            this.numeClient = numeClient;
        }
        else {
            this.numeClient = "Anonim";
        }
        if(zi >= 1 && zi <= 31){
            this.zi = zi;
        }
        else{
            this.zi=1;
        }
    }

    public abstract AbstractRezervare copiaza(int ziua);

    public AbstractRezervare() {
        this.nrParticipanti = 5;
        this.numeClient = "Mihai";
        this.ora = 15;
        this.zi = 5;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractRezervare{");
        sb.append("nrParticipanti=").append(nrParticipanti);
        sb.append(", ora=").append(ora);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", zi=").append(zi);
        sb.append('}');
        return sb.toString();
    }
}
