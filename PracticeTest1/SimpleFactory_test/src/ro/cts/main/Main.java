package ro.cts.main;

import ro.cts.clase.Document;
import ro.cts.factory.DocumentFactory;

public class Main {
    public static void main(String[] args) throws Exception {

        DocumentFactory documentFactory = new DocumentFactory();
        documentFactory.creazaDocument(Document.pdfDocument).print();
        DocumentFactory documentFactory1 = new DocumentFactory();
        documentFactory1.creazaDocument(Document.wordDocument).print();
        DocumentFactory documentFactory2 = new DocumentFactory();
        documentFactory2.creazaDocument(Document.excelDocument).print();
    }
}
