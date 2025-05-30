package ro.cts.clase;

public class MedicamentFarmacie {
    private String denumire;
    private float pret;
    private boolean esteInStoc;

    public MedicamentFarmacie(String denumire, float pret, boolean esteInStoc) {
        this.denumire = denumire;
        this.pret = pret;
        this.esteInStoc = esteInStoc;
    }

    public void cumparaMedicament() {
        if(esteInStoc){
            System.out.println("Se poate cumpara medicamentul: " + denumire + " cu pretul " + pret + "RON");
        }else{
            System.out.println("Medicamentul nu este in stoc!");
        }
    }
}
