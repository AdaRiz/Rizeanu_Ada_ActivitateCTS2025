package ro.cts.factory;


import ro.cts.clase.*;

public class DocumentFactory {
    public IDocument creazaDocument(Document document) throws Exception {
        switch (document){
            case pdfDocument:
                return new PdfDocument();
            case wordDocument:
                return new WordDocument();
            case excelDocument:
                return new ExcelDocument();
            default:
                throw new Exception("Documentul nu poate fi printat!");
        }
    }
}
