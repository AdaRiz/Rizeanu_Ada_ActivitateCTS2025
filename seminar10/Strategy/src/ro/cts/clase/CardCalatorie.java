package ro.cts.clase;

public class CardCalatorie implements IMetodaPlata{
    int nrCalatoriiRamase;

    public CardCalatorie(int nrCalatoriiRamase) {
        this.nrCalatoriiRamase = nrCalatoriiRamase;
    }

    @Override
    public void realizeazaPlata(float pretBilet) {
        if(nrCalatoriiRamase > 0){
            System.out.println("Plata efectuata prin card calatorii");
            this.nrCalatoriiRamase  -= 1;
        }else{
            System.out.println("Nu ai calatorii ramase!");
        }
    }
}
