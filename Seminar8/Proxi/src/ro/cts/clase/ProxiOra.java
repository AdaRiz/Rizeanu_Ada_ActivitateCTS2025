package ro.cts.clase;

public class ProxiOra implements IRezervare{
    private IRezervare rezerva;

    public ProxiOra(IRezervare rezerva) {
        this.rezerva = rezerva;
    }

    @Override
    public void rezervare(String numeClient, int nrPersoane, int ora) {
        if(ora > 18){
            this.rezerva.rezervare(numeClient, nrPersoane, ora);
        }else{
            System.out.println("Nu este nevoie de rezervare!");
        }
    }
}
