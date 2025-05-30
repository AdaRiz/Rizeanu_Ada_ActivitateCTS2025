package ro.cts.clase;

public class NotaDePlata implements INota{
    private float sumaDePlata;

    public NotaDePlata(float sumaDePlata) {
        this.sumaDePlata = sumaDePlata;
    }

    @Override
    public void printare() {
        System.out.println("Aveti de plata suma de: " + sumaDePlata + " RON");
    }
}
