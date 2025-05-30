package ro.cts.clase;

public abstract class PrinterFelicitare implements INota{
    private INota notaDePlata;

    public PrinterFelicitare(INota notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printare(){
        notaDePlata.printare();
        printareFelicitare();
    }

    protected abstract void printareFelicitare();

}
