package ro.cts.clase;

public class PdfDocument implements IDocument {
    @Override
    public void print() {
        System.out.println("Se printeaza un document pdf");
    }
}
