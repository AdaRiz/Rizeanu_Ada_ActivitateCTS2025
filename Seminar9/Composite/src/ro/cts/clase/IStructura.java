package ro.cts.clase;

public interface IStructura {
    void adaugaStructura(IStructura structura) throws Exception;
    void stergeStructura(IStructura structura) throws Exception;
    void afiseazaDescriere();
    IStructura getStructura(int cheie) throws Exception;
}
