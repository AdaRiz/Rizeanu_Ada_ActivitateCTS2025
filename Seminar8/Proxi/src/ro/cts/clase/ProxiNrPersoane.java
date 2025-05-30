package ro.cts.clase;

public class ProxiNrPersoane implements IRezervare{
    private IRezervare rezerva;

    public ProxiNrPersoane(IRezervare rezervare) {
        this.rezerva = rezervare;
    }

    @Override
    public void rezervare(String numeClient, int nrPersoane, int ora) {
        if(nrPersoane >= 4){
            this.rezerva.rezervare(numeClient, nrPersoane, ora);
        }else{
            System.out.println("Nu este necesara rezervarea! Va asteptam la restaurant!");
        }
    }
}
