package ro.cts.clase;

public class CardBancar implements IMetodaPlata{
    private float sold;

    public CardBancar(float sold) {
        this.sold = sold;
    }

    @Override
    public void realizeazaPlata(float pretBilet) {
        if(sold>pretBilet){
            System.out.println("Plata efectuata prin card bancar");
            this.sold -= pretBilet;
        }else{
            System.out.println("Fonduri insuficiente");
        }
    }
}
