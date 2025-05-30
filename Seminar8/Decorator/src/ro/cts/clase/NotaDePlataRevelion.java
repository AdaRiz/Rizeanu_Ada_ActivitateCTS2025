package ro.cts.clase;

public class NotaDePlataRevelion extends PrinterFelicitare{

    public NotaDePlataRevelion(INota notaDePlata) {
        super(notaDePlata);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("Un an nou fericit!");
    }
}
